package com.example.edacaner.testapk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirteenthActivity extends AppCompatActivity {

    private Button contBtn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirteenth);

        contBtn6 = findViewById(R.id.contButton6);
        contBtn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openFourteenthActivity();
            }
        });
    }

    public void openFourteenthActivity() {
        Intent intent = new Intent(this, FourteenthActivity.class);
        startActivity(intent);
    }
}
