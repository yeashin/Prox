package com.example.steffan.prox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Locale;

public class Search extends AppCompatActivity {

    EditText editText;
    ListView listView;
    ListViewAdapter adapter;
    String[] Name;
    ArrayList<SportsList> nameArrayList = new ArrayList<SportsList>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        // Creating Filter or Search

        Name = new String[]{"Hockey","Soccer","Football","Volleyball"};

        listView = (ListView)findViewById(R.id.list);

        for (int i = 0; i < Name.length; i++){
            SportsList PN = new SportsList(Name[i]);
            nameArrayList.add(PN);
        }

        adapter = new ListViewAdapter(this, nameArrayList);

        //Listview
        listView.setAdapter(adapter);

        //Edittext
        editText = (EditText)findViewById(R.id.Edt);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //Search or Filter
                String who = editText.getText().toString().toLowerCase(Locale.getDefault());
                adapter.myFilter(who);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }
}
