package com.example.edacaner.testapk;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class SecondActivity extends AppCompatActivity {

    private Button goBtn;
    private RadioButton flightBtn, accomodationBtn, eventBtn, changeBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        goBtn = findViewById(R.id.goButton);
        flightBtn = findViewById(R.id.radioButton);
        accomodationBtn = findViewById(R.id.radioButton2);
        eventBtn = findViewById(R.id.radioButton3);
        changeBtn = findViewById(R.id.radioButton4);



        goBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                boolean flight = findViewById(R.id.radioButton).isSelected();
                boolean accomodation = findViewById(R.id.radioButton2).isSelected();
                boolean event = findViewById(R.id.radioButton3).isSelected();
                boolean change = findViewById(R.id.radioButton4).isSelected();

                if(flight)
                {
                    openEighthActivity();
                }
                else if(accomodation)
                {
                    openTwelfthActivity();
                }
                else if(event)
                {
                    openFifthActivity();
                }
                else if(change)
                {
                    openFourththActivity();
                }
                else
                {
                    openFifthActivity();
                }
            }
        });

    }
    public void openFourththActivity() {
        Intent intent = new Intent(this, FourthActivity.class);
        startActivity(intent);
    }

    public void openFifthActivity() {
        Intent intent = new Intent(this, FifthActivity.class);
        startActivity(intent);
    }

    public void openEighthActivity() {
        Intent intent = new Intent(this, EighthActivity.class);
        startActivity(intent);
    }

    public void openTwelfthActivity() {
        Intent intent = new Intent(this, TwelfthActivity.class);
        startActivity(intent);
    }

}

