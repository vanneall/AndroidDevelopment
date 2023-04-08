package com.example.task9;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class Task14Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_task14, container, false);
    }

    ArrayList<Coffee> coffees = new ArrayList<>();

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        coffees.add(new Coffee("Раф", "Ароматный", R.drawable.raf));
        coffees.add(new Coffee("Капучино", "Вкусный", R.drawable.kapuchino));
        coffees.add(new Coffee("Эспрессо", "Бодрящий", R.drawable.espresso));
        coffees.add(new Coffee("Латте", "Нежный", R.drawable.latte));

        RecyclerView recyclerView = view.findViewById(R.id.recyclerviewTask14);
        CoffeeAdapterRecyclerView adapter = new CoffeeAdapterRecyclerView(getActivity(), coffees, new CoffeeAdapterRecyclerView.OnCoffeeClickListener() {
            @Override
            public void onCoffeeClick(Coffee coffees, int position) {
                Toast.makeText(getActivity(), "Выбран " + coffees.getName(), Toast.LENGTH_SHORT).show();
            }
        });
        recyclerView.setAdapter(adapter);
    }
}