package com.example.rajnayan.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateListView();
        registerClick();
    }

    private void populateListView() {
        //Create list items
        String[] myItems = {"Green", "Red", "Purple", "Blue", "Black", "Brown", "Indigo", "Yellow", "Brown", "Indigo", "Yellow"};

        //Build Adaptor
        ArrayAdapter<String> adpt = new ArrayAdapter<String>(this, R.layout.list_items, myItems);

        //Configure the List View.

        ListView list = (ListView) findViewById(R.id.listView);
        list.setAdapter(adpt);
    }
//        public static Toast toast = null;

    private void registerClick() {
        ListView list = (ListView) findViewById(R.id.listView);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                    case 2:
                    case 4:
                    case 6:
                        Intent k = new Intent(MainActivity.this, next.class);
                        startActivity(k);
                        break;
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                        Intent k1 = new Intent(MainActivity.this, next2.class);
                        startActivity(k1);
                        break;
                }


            }
        });

    }


}
