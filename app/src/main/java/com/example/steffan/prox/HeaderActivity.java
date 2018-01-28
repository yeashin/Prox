package com.example.steffan.prox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HeaderActivity extends AppCompatActivity {
    private ImageButton home;
    private ImageButton profile;
    private ImageButton search;
    private ImageButton settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_header);

        home = (ImageButton) findViewById(R.id.homeButton);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(HeaderActivity.this, HeaderActivity.class);
                startActivity(homeIntent);
            }
        });


        profile = (ImageButton) findViewById(R.id.profileButton);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profileIntent = new Intent(HeaderActivity.this, Profil.class);
                startActivity(profileIntent);
            }
        });

        search = (ImageButton) findViewById(R.id.searchButton);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(HeaderActivity.this, Search.class);
                startActivity(searchIntent);
            }
        });

        settings = (ImageButton) findViewById(R.id.settingButton);

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settingIntent = new Intent(HeaderActivity.this, Settings.class);
                startActivity(settingIntent);
            }
        });
    }
}