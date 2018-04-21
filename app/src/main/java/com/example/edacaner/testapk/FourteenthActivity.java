package com.example.edacaner.testapk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourteenthActivity extends AppCompatActivity {

    private Button bookBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourteenth);

        bookBtn2 = findViewById(R.id.bookButton2);
        bookBtn2.setOnClickListener(new View.OnClickListener(){
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
