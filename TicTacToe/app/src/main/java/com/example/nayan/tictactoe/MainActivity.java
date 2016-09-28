package com.example.nayan.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //ArrayList<View> allButtons = ((RelativeLayout) findViewById(R.id.button_container)).getTouchables();
    int flag = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button button_1 = (Button) findViewById(R.id.button_1);
        final Button button_2 = (Button) findViewById(R.id.button_2);
        final Button button_3 = (Button) findViewById(R.id.button_3);
        final Button button_4 = (Button) findViewById(R.id.button_4);
        final Button button_5 = (Button) findViewById(R.id.button_5);
        final Button button_6 = (Button) findViewById(R.id.button_6);
        final Button button_7 = (Button) findViewById(R.id.button_7);
        final Button button_8 = (Button) findViewById(R.id.button_8);
        final Button button_9 = (Button) findViewById(R.id.button_9);
        final TextView tv = (TextView) findViewById(R.id.textView);
        button_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flag == 1) {
                    button_1.setText("X");
                    button_1.setEnabled(false);
                    tv.setText("Player B's Turn");
                    flag = 2;
                }
                else if (flag == 2){
                    button_1.setText("O");
                    button_1.setEnabled(false);
                    tv.setText("Player B's Turn");
                    flag = 1;
                }

            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flag == 1) {
                    button_2.setText("X");
                    button_2.setEnabled(false);
                    tv.setText("Player B's Turn");
                    flag = 2;
                }
                else if (flag == 2){
                    button_2.setText("O");
                    button_2.setEnabled(false);
                    tv.setText("Player B's Turn");
                    flag = 1;
                }

            }
        });

    }
}
