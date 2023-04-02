package com.example.task9;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Task5Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Task5Fragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public Task5Fragment() {
        // Required empty public constructor
    }

    public static Task5Fragment newInstance(String param1, String param2) {
        Task5Fragment fragment = new Task5Fragment();
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
        return inflater.inflate(R.layout.fragment_task5, container, false);
    }

    ArrayList<Coffee> arrayList = new ArrayList<>();

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        arrayList.add(new Coffee("Раф", "Ароматный"));
        arrayList.add(new Coffee("Капучино", "Вкусный"));
        arrayList.add(new Coffee("Эспрессо", "Бодрящий"));
        arrayList.add(new Coffee("Латте", "Нежный"));

        EditText editText = view.findViewById(R.id.editTextTask5);
        ListView listView = view.findViewById(R.id.list_view_task5);
        ArrayAdapter<Coffee> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);

        Button add = view.findViewById(R.id.buttonAddTask5);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!editText.getText().toString().isEmpty()){
                    adapter.add(new Coffee(editText.getText().toString(), null));
                    adapter.notifyDataSetChanged();
                }
            }
        });
        Button sub = view.findViewById(R.id.buttonSubTask5);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!editText.getText().toString().isEmpty()){
                    String text = editText.getText().toString();
                    for (int i = 0; i < adapter.getCount(); i++){
                        if (adapter.getItem(i).getName().equals(text)){
                            adapter.remove(adapter.getItem(i));
                        }
                    }
                    adapter.notifyDataSetChanged();
                }
            }
        });

    }
}