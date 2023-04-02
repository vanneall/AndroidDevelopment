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
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MiddleFragment extends Fragment {

    interface FragmentController {
        void hideFragment(int i);

        void showFragment(int i);
    }

    FragmentController fragmentController;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        fragmentController = (FragmentController) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_middle, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        CheckBox checkBoxleft = view.findViewById(R.id.checkBoxHideFragment1);
        checkBoxleft.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    fragmentController.hideFragment(checkBoxleft.getId());
                } else {
                    fragmentController.showFragment(checkBoxleft.getId());
                }
            }
        });
        CheckBox checkBoxright = view.findViewById(R.id.checkBoxHideFragment2);
        checkBoxright.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    fragmentController.hideFragment(checkBoxright.getId());
                } else {
                    fragmentController.showFragment(checkBoxright.getId());
                }
            }
        });
    }

    @Override
    public void onDetach() {
        super.onDetach();
        fragmentController = null;
    }
}