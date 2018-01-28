package com.example.steffan.prox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class search extends AppCompatActivity {

    ListView search_sport;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        search_sport = (ListView) findViewById(R.id.search_sport);
        ArrayList<String> sports = new ArrayList<>();
        sports.addAll(Arrays.asList(getResources().getStringArray(R.array.mysport)));

        adapter = new ArrayAdapter<String>(search.this,
                android.R.layout.simple_list_item_1,
                sports
        );

        search_sport.setAdapter(adapter);

    }

	/*
    public boolean onCreateOptionsMenu(Menu menu){

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.search_menu, menu);

        MenuItem item = menu.findItem(R.id.search_sport);
        SearchView searchView = (SearchView)item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                Intent feeder = new Intent (search.this, feed.class);
                startActivity(feeder);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);

    }
	*/
}
