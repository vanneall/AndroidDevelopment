package com.example.task9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import org.w3c.dom.Text;

import java.util.List;
import java.util.zip.Inflater;

public class CoffeeProAdapter extends ArrayAdapter<Coffee> {

    private LayoutInflater inflater;
    private int layoutId;
    private List<Coffee> coffees;


    public CoffeeProAdapter(@NonNull Context context, int resource, @NonNull List<Coffee> objects) {
        super(context, resource, objects);
        inflater = LayoutInflater.from(context);
        layoutId = resource;
        coffees = objects;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = inflater.inflate(layoutId, viewGroup, false);
        }


        ImageView imageView = view.findViewById(R.id.imageViewTask8);
        TextView textViewName = view.findViewById(R.id.coffee_name_task8);
        TextView textViewCount = view.findViewById(R.id.coffee_count_task8);
        Button buttonAdd = view.findViewById(R.id.buttonAddTask8);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewCount.setText(String.valueOf(Integer.valueOf(textViewCount.getText().toString()) + 1));
            }
        });
        Button buttonSub = view.findViewById(R.id.buttonSubTask8);
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Integer.valueOf(textViewCount.getText().toString()) > 0){
                    textViewCount.setText(String.valueOf(Integer.valueOf(textViewCount.getText().toString()) - 1));
                }
            }
        });

        imageView.setImageResource(coffees.get(i).getPictureId());
        textViewName.setText(coffees.get(i).getName());
        textViewCount.setText("0");

        return view;
    }

}
