package com.example.task14;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.CursorLoader;
import androidx.loader.content.Loader;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.security.InvalidParameterException;

public class MainActivity2_8 extends AppCompatActivity implements LoaderManager.LoaderCallbacks<Cursor> {
    private static final int LOADER_ID = 225;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main28);
        LoaderManager.getInstance(this).initLoader(LOADER_ID, null, this);
    }

    // получение всех
    public void getAll(View view) {
        String[] projection = {
                FriendsContract.Columns._ID,
                FriendsContract.Columns.NAME,
                FriendsContract.Columns.EMAIL,
                FriendsContract.Columns.PHONE
        };
        ContentResolver contentResolver = getContentResolver();
        Cursor cursor = contentResolver.query(FriendsContract.CONTENT_URI,
                projection,
                null,
                null,
                FriendsContract.Columns.NAME);
        if (cursor != null) {
            Log.d(TAG, "count: " + cursor.getCount());
            // перебор элементов
            while (cursor.moveToNext()) {
                for (int i = 0; i < cursor.getColumnCount(); i++) {
                    Log.d(TAG, cursor.getColumnName(i) + " : " + cursor.getString(i));
                }
                Log.d(TAG, "=========================");
            }
            cursor.close();
        } else {
            Log.d(TAG, "Cursor is null");
        }
    }

    // Добавление
    public void add(View view) {
        ContentResolver contentResolver = getContentResolver();
        ContentValues values = new ContentValues();
        values.put(FriendsContract.Columns.NAME, "Sam");
        values.put(FriendsContract.Columns.EMAIL, "sam@gmail.com");
        values.put(FriendsContract.Columns.PHONE, "+13676254985");
        Uri uri = contentResolver.insert(FriendsContract.CONTENT_URI, values);
        Log.d(TAG, "Friend added");
    }

    // Обновление
    public void update(View view) {
        ContentResolver contentResolver = getContentResolver();
        ContentValues values = new ContentValues();
        values.put(FriendsContract.Columns.EMAIL, "sammy@gmail.com");
        values.put(FriendsContract.Columns.PHONE, "+55555555555");
        String selection = FriendsContract.Columns.NAME + " = 'Sam'";
        int count = contentResolver.update(FriendsContract.CONTENT_URI, values, selection, null);
        Log.d(TAG, "Friend updated");
    }

    // Удаление
    public void delete(View view) {
        ContentResolver contentResolver = getContentResolver();
        String selection = FriendsContract.Columns.NAME + " = ?";
        String[] args = {"Sam"};
        int count = contentResolver.delete(FriendsContract.CONTENT_URI, selection, args);
        Log.d(TAG, "Friend deleted");
    }

    @NonNull
    @Override
    public Loader<Cursor> onCreateLoader(int id, @Nullable Bundle args) {
        String[] projection = {
                FriendsContract.Columns._ID,
                FriendsContract.Columns.NAME,
                FriendsContract.Columns.EMAIL,
                FriendsContract.Columns.PHONE
        };
        if (id == LOADER_ID)
            return new CursorLoader(this, FriendsContract.CONTENT_URI,
                    projection,
                    null,
                    null,
                    FriendsContract.Columns.NAME);
        else
            throw new InvalidParameterException("Invalid loader id");
    }

    @Override
    public void onLoadFinished(@NonNull Loader<Cursor> loader, Cursor data) {
        if (data != null) {
            Log.d(TAG, "count: " + data.getCount());
            // перебор элементов
            while (data.moveToNext()) {
                for (int i = 0; i < data.getColumnCount(); i++) {
                    Log.d(TAG, data.getColumnName(i) + " : " + data.getString(i));
                }
                Log.d(TAG, "=========================");
            }
            data.close();
        } else {
            Log.d(TAG, "Cursor is null");
        }
    }

    @Override
    public void onLoaderReset(@NonNull Loader<Cursor> loader) {
        Log.d(TAG, "onLoaderReset...");
    }
}