package com.example.steffan.prox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class ProxLogin extends AppCompatActivity {

    private Button register;
    private CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prox_login);

        //cardView used as login button
        register = (Button) findViewById(R.id.registerButton);
        cardView = (CardView) findViewById(R.id.cardView);


        //Listener for register
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent registerIntent = new Intent(ProxLogin.this, ProxyRegistration.class);
                startActivity(registerIntent);
            }
        });

        //Listener for Login Goes to profil
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent loginIntent = new Intent(ProxLogin.this, UserAre.class);
                startActivity(loginIntent);
            }
        });



    }
}
