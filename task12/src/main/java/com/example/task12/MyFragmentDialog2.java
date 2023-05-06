package com.example.task12;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class MyFragmentDialog2 extends DialogFragment {

    public interface Editable {
        void edit(String name);
    }
    Editable editable;

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        editable = (Editable) context;
    }

    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        String button = getArguments().getString("button");
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        return builder
                .setTitle("Диалоговое окно")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setMessage("Вывести кнопку " + button)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        editable.edit("Нажата " + button);
                    }
                })
                .setNegativeButton("Отмена", null)
                .create();
    }
}
