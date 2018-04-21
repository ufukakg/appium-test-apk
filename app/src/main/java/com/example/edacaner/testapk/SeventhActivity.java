package com.example.edacaner.testapk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeventhActivity extends AppCompatActivity {

    private Button eventBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);

        eventBtn = findViewById(R.id.eventButton);

        eventBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openEleventhActivity();
            }
        });
    }

    public void openEleventhActivity() {
        Intent intent = new Intent(this, EleventhActivity.class);
        startActivity(intent);
    }

}
