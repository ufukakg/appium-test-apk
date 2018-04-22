package com.example.edacaner.testapk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SecondActivity extends AppCompatActivity {

    private Button goBtn;
    private RadioButton flightBtn, accomodationBtn, eventBtn, changeBtn;
    private RadioGroup radioGroupPurpose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        radioGroupPurpose = findViewById(R.id.radioGroupPurpose);
        goBtn = findViewById(R.id.goButton);

        flightBtn = findViewById(R.id.radioButton);
        accomodationBtn = findViewById(R.id.radioButton2);
        eventBtn = findViewById(R.id.radioButton3);
        changeBtn = findViewById(R.id.radioButton4);

        goBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                switch (getCheckedRadioButton()){
                    case R.id.radioButton:
                        openEighthActivity();
                        break;
                    case R.id.radioButton2:
                        openTwelfthActivity();
                        break;
                    case R.id.radioButton3:
                        openFifthActivity();
                        break;
                    case R.id.radioButton4:
                        openFourthActivity();
                        break;
                }
            }
        });

    }
    public void openFourthActivity() {
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

    private int getCheckedRadioButton(){
        int which = -1;
        if (radioGroupPurpose.getCheckedRadioButtonId() == -1)
        {
            // no radio buttons are checked
        }
        else
        {
            which = radioGroupPurpose.getCheckedRadioButtonId();
        }
        return which;
    }

}

