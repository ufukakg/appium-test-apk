package com.example.edacaner.testapk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EighthActivity extends AppCompatActivity {

    private Button contBtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth);

        contBtn3 = findViewById(R.id.contButton3);
        contBtn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openNinthActivity();
            }
        });
    }

    public void openNinthActivity() {
        Intent intent = new Intent(this, NinthActivity.class);
        startActivity(intent);
    }
}
