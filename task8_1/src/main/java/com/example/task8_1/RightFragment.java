package com.example.task8_1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RightFragment extends Fragment {

    TextView textViewCounter;

    public void inc(){
        textViewCounter.setText(String.valueOf(Integer.valueOf(textViewCounter.getText().toString()) + 1));
    }

    public void dec(){
        textViewCounter.setText(String.valueOf(Integer.valueOf(textViewCounter.getText().toString()) - 1));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_right, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textViewCounter = view.findViewById(R.id.textCounter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        textViewCounter = null;
    }
}