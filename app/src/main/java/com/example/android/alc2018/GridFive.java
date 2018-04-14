package com.example.android.alc2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GridFive extends AppCompatActivity implements View.OnClickListener{

    private final static String TAG = GridFive.class.getSimpleName();
    boolean PLAYER_X = true;

    int TURN_COUNT = 0;
    Button b00;
    Button b01;
    Button b02;
    Button b03;
    Button b04;

    Button b10;
    Button b11;
    Button b12;
    Button b13;
    Button b14;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_five);
    }
    public void onClick(View view){

    }
}
