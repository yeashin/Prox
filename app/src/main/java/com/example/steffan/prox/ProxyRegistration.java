package com.example.steffan.prox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class ProxyRegistration extends AppCompatActivity {

    private CardView registerCardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy_registration);

        registerCardView = (CardView) findViewById(R.id.registerCardView);

        registerCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent newRegisterIntent = new Intent(ProxyRegistration.this, ProxLogin.class);
                startActivity(newRegisterIntent);
            }
        });
    }


}
