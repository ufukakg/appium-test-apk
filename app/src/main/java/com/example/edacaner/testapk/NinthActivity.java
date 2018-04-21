package com.example.edacaner.testapk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NinthActivity extends AppCompatActivity {

    private Button contBtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth);

        contBtn4 = findViewById(R.id.contButton4);
        contBtn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openTenthActivity();
            }
        });
    }

    public void openTenthActivity() {
        Intent intent = new Intent(this, TenthActivity.class);
        startActivity(intent);
    }
}
