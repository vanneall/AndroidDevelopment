package com.example.task8_1;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainMenuFragment extends Fragment {

    interface IndexGetter {
        void sendIndex(int index);
    }

    IndexGetter indexGetter;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        indexGetter = (IndexGetter) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_menu, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ListView listView = view.findViewById(R.id.menu_list_view);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                indexGetter.sendIndex(i);
            }
        });
    }

    @Override
    public void onDetach() {
        super.onDetach();
        indexGetter = null;
    }
}