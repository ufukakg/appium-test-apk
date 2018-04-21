package com.example.edacaner.testapk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TenthActivity extends AppCompatActivity {

    private Button bookBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth);

        bookBtn = findViewById(R.id.bookButton);
        bookBtn.setOnClickListener(new View.OnClickListener(){
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
