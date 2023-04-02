package com.example.task9;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Task6_7Fragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public Task6_7Fragment() {
        // Required empty public constructor
    }

    public static Task6_7Fragment newInstance(String param1, String param2) {
        Task6_7Fragment fragment = new Task6_7Fragment();
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
        return inflater.inflate(R.layout.fragment_task6_7, container, false);
    }

    ArrayList<Coffee> arrayList = new ArrayList<>();

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        arrayList.add(new Coffee("Раф", "Ароматный", R.drawable.raf));
        arrayList.add(new Coffee("Капучино", "Вкусный", R.drawable.kapuchino));
        arrayList.add(new Coffee("Эспрессо", "Бодрящий", R.drawable.espresso));
        arrayList.add(new Coffee("Латте", "Нежный", R.drawable.latte));
        arrayList.add(new Coffee("Раф", "Ароматный", R.drawable.raf));
        arrayList.add(new Coffee("Капучино", "Вкусный", R.drawable.kapuchino));
        arrayList.add(new Coffee("Эспрессо", "Бодрящий", R.drawable.espresso));
        arrayList.add(new Coffee("Латте", "Нежный", R.drawable.latte));
        arrayList.add(new Coffee("Раф", "Ароматный", R.drawable.raf));
        arrayList.add(new Coffee("Капучино", "Вкусный", R.drawable.kapuchino));
        arrayList.add(new Coffee("Эспрессо", "Бодрящий", R.drawable.espresso));
        arrayList.add(new Coffee("Латте", "Нежный", R.drawable.latte));
        arrayList.add(new Coffee("Раф", "Ароматный", R.drawable.raf));
        arrayList.add(new Coffee("Капучино", "Вкусный", R.drawable.kapuchino));
        arrayList.add(new Coffee("Эспрессо", "Бодрящий", R.drawable.espresso));
        arrayList.add(new Coffee("Латте", "Нежный", R.drawable.latte));

        ListView listView = view.findViewById(R.id.list_view_task6_7);
        CoffeAdapter adapter = new CoffeAdapter(getActivity(), R.layout.list_part, arrayList);
        listView.setAdapter(adapter);
    }
}