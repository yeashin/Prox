package com.example.steffan.prox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class feed extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listItems;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        recyclerView = (RecyclerView) findViewById(R.id.feed);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

        for(int i = 0; i <= 10; i++){
            ListItem listItem = new ListItem( "header" + (i +1), "dumy text");
            listItems.add(listItem);
        }


        adapter = new Listadapter(listItems, this);
        recyclerView.setAdapter(adapter);
    }
}
