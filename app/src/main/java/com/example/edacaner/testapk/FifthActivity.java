package com.example.edacaner.testapk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FifthActivity extends AppCompatActivity {

    private Button contBtn;
    //private Spinner spinner1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        contBtn = findViewById(R.id.contButton);

        contBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openSixthActivity();
            }
        });

    }

    public void openSixthActivity() {
        Intent intent = new Intent(this, SixthActivity.class);
        startActivity(intent);
    }
}
