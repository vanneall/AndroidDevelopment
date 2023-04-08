package com.example.task9;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

public class Task11Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_task11, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        AutoCompleteTextView autoCompleteTextView = view.findViewById(R.id.autoCompleteTextView);
        MultiAutoCompleteTextView multiAutoCompleteTextView = view.findViewById(R.id.multiAutoCompleteTextView);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

        TextView textView = view.findViewById(R.id.textViewSelectedCoffeeTask11_12);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), com.google.android.material.R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.coffees));
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                textView.setText("Выбран кофе: " + adapterView.getItemAtPosition(i));
            }
        });

        multiAutoCompleteTextView.setAdapter(adapter);
        multiAutoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                textView.setText(textView.getText() + " " + adapterView.getItemAtPosition(i));
            }
        });

    }
}