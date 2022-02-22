package com.example.cryptoapp;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.LayoutInflater;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class Adapter extends RecyclerView.Adapter<Adapter.MyView> {

    private List<String> list;

    public class MyView extends RecyclerView.ViewHolder {

        TextView textView;

        public MyView(View view) {
            super(view);
            textView =(TextView) view.findViewById(R.id.card_name);
        }
    }

    public Adapter(ArrayList<String> horizontalList) {
        this.list = horizontalList;
    }

    @Override
    public MyView onCreateViewHolder(ViewGroup parent,int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.cryptocard,parent,false);
        return new MyView(itemView);
    }


    @Override
    public void onBindViewHolder(final MyView holder,final int position) {
        System.out.println(list.get(position));
        holder.textView.setText(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
