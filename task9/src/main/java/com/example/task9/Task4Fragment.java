package com.example.task9;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Task4Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Task4Fragment extends Fragment {

    Coffee[] coffees = {new Coffee("Раф", "Ароматный"), new Coffee("Капучино", "Вкусный"),
            new Coffee("Эспрессо", "Бодрящий"), new Coffee("Латте", "Нежный")};


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public Task4Fragment() {
        // Required empty public constructor
    }

    public static Task4Fragment newInstance(String param1, String param2) {
        Task4Fragment fragment = new Task4Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_task4, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView = view.findViewById(R.id.chosenCoffeeTask4);
        ListView listView = view.findViewById(R.id.list_view_task4);
        ArrayAdapter<Coffee> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_multiple_choice, coffees);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                SparseBooleanArray booleanArray = listView.getCheckedItemPositions();
                StringBuilder builder = new StringBuilder();
                for (int j = 0; j < coffees.length; j++) {
                    if (booleanArray.get(j)){
                        builder.append(coffees[j] + ", ");
                    }
                }
                textView.setText("Выбрано: " + builder);
            }
        });
    }
}