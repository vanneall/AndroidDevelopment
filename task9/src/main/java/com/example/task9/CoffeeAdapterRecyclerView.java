package com.example.task9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CoffeeAdapterRecyclerView extends RecyclerView.Adapter<CoffeeAdapterRecyclerView.ViewHolder> {

    private LayoutInflater inflater;
    private List<Coffee> coffees;

    interface OnCoffeeClickListener{
        void onCoffeeClick(Coffee coffees, int position);
    }

    final OnCoffeeClickListener onClickListener;

    public CoffeeAdapterRecyclerView(@NonNull Context context, @NonNull List<Coffee> objects, OnCoffeeClickListener onClickListener) {
        coffees = objects;
        inflater = LayoutInflater.from(context);
        this.onClickListener = onClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_part, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Coffee coffee = coffees.get(position);
        holder.image.setImageResource(coffee.getPictureId());
        holder.name.setText(coffee.getName());
        holder.info.setText(coffee.getInfo());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickListener.onCoffeeClick(coffee, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return coffees.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView image;
        final TextView name, info;

        public ViewHolder(View view) {
            super(view);
            this.image = view.findViewById(R.id.imageView);
            this.name = view.findViewById(R.id.textViewName);
            this.info = view.findViewById(R.id.textViewInfo);
        }
    }
}
