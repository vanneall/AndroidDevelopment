package com.example.task8_1;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class CounterFragment extends Fragment {

    interface SignalSetter {
        void setSignal(boolean plus);
    }

    SignalSetter signalSetter;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        signalSetter = (SignalSetter) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_counter, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button buttonPlus = view.findViewById(R.id.buttonPlus);
        buttonPlus.setOnClickListener(this::onClick);
        Button buttonMinus = view.findViewById(R.id.buttonMinus);
        buttonMinus.setOnClickListener(this::onClick);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.buttonPlus) {
            signalSetter.setSignal(true);
        } else {
            signalSetter.setSignal(false);
        }
    }
}