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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Task8Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Task8Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Task8Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Task8Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Task8Fragment newInstance(String param1, String param2) {
        Task8Fragment fragment = new Task8Fragment();
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
        return inflater.inflate(R.layout.fragment_task8, container, false);
    }

    ArrayList<Coffee> arrayList = new ArrayList<>();
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        arrayList.add(new Coffee("Раф", "Ароматный", R.drawable.raf));
        arrayList.add(new Coffee("Капучино", "Вкусный", R.drawable.kapuchino));
        arrayList.add(new Coffee("Эспрессо", "Бодрящий", R.drawable.espresso));
        arrayList.add(new Coffee("Латте", "Нежный", R.drawable.latte));

        ListView listView = view.findViewById(R.id.list_view_task8);
        CoffeeProAdapter coffeeProAdapter = new CoffeeProAdapter(getActivity(), R.layout.list_item, arrayList);
        listView.setAdapter(coffeeProAdapter);
    }
}