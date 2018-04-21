package com.example.edacaner.testapk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TwelfthActivity extends AppCompatActivity {

    private Button contBtn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelfth);

        contBtn5 = findViewById(R.id.contButton5);
        contBtn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openThirteenthActivity();
            }
        });

    }

    public void openThirteenthActivity() {
        Intent intent = new Intent(this, ThirteenthActivity.class);
        startActivity(intent);
    }
}
