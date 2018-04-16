package com.example.android.alc2018;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class FirstScreen extends AppCompatActivity {
    RadioGroup radioButtonGroup;
    RadioButton radioButton;
    RadioButton radthree;
    RadioButton radfive;


    Button button;

    String selected = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
        radioButtonGroup = findViewById(R.id.radioGroup);

        button = findViewById(R.id.button);
      //  radthree = findViewById(R.id.radthree);
      //  int rad3id = radthree.getId();

    //    radfive = findViewById(R.id.radfive);
     //   int rad5id = radfive.getId();

        //3 Grid


        button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){

               // button = findViewById(R.id.button);
                int buttonId = radioButtonGroup.getCheckedRadioButtonId();
                radioButton = findViewById(buttonId);
                if (radioButton!=null && radioButton.getText().toString().equalsIgnoreCase("3 Grid")){
                    //dam = MainActivity.class;
                    selected = "3";

                }
                else if (radioButton!=null && radioButton.getText().toString().equalsIgnoreCase("5 Grid")){
                    //dam = GridFive.class;
                    selected = "5";
                }
                else {
                    selected = null;
                }



                if(selected!=null && !TextUtils.isEmpty(selected) && selected.equalsIgnoreCase("3")){
                    Intent i = new Intent(FirstScreen.this, MainActivity.class);
                    startActivity(i);
                } else if (selected!=null && !TextUtils.isEmpty(selected) && selected.equalsIgnoreCase("5")){

                    Intent i = new Intent(FirstScreen.this, GridFive.class);
                    startActivity(i);
                } else {

                    Toast.makeText(FirstScreen.this, "Select an option", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
