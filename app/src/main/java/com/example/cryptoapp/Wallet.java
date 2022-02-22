package com.example.cryptoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class Wallet extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<String> source;

    RecyclerView.LayoutManager RecyclerViewLayoutManager;

    Adapter adapter;

    LinearLayoutManager HorizontalLayout;

    View ChildView;
    int RecyclerViewItemPosition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet);

        recyclerView
                = (RecyclerView)findViewById(
                R.id.recyclerview);
        RecyclerViewLayoutManager
                = new LinearLayoutManager(
                getApplicationContext());

        recyclerView.setLayoutManager(
                RecyclerViewLayoutManager);

        AddItemsToRecyclerViewArrayList();

        adapter = new Adapter(source);

        HorizontalLayout= new LinearLayoutManager(Wallet.this,LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(HorizontalLayout);

        recyclerView.setAdapter(adapter);
    }

    public void AddItemsToRecyclerViewArrayList()
    {
        source = new ArrayList<>();
        source.add("Master card");
        source.add("Visa");
    }

    public void goback(View view) {
        finish();
    }
}