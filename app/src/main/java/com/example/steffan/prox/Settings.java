package com.example.steffan.prox;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class Settings extends ListActivity {

    String[] settings = {"Account","Notifications","About"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        ListView listView=(ListView)findViewById(R.id.SettingsList);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1, settings);
        listView.setAdapter(adapter);
    }




}
