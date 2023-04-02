package com.example.task9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class CoffeAdapter extends ArrayAdapter<Coffee> {

    private LayoutInflater inflater;
    private List<Coffee> coffees;
    private int layout;

    public CoffeAdapter(@NonNull Context context, int resource, @NonNull List<Coffee> objects) {
        super(context, resource, objects);
        coffees = objects;
        layout = resource;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if (convertView == null) {
            convertView = inflater.inflate(layout, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView textViewName = convertView.findViewById(R.id.textViewName);
        TextView textViewInfo = convertView.findViewById(R.id.textViewInfo);
        Coffee coffee = coffees.get(position);
        imageView.setImageResource(coffee.getPictureId());
        textViewName.setText(coffee.getName());
        textViewInfo.setText(coffee.getInfo());
        return convertView;
    }
}
