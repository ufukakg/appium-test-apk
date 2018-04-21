package com.example.edacaner.testapk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EleventhActivity extends AppCompatActivity {

    private Button submitBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleventh);

        submitBtn2 = findViewById(R.id.submitButton2);
        submitBtn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openFifteenthActivity();
            }
        });
    }

    public void openFifteenthActivity() {
        Intent intent = new Intent(this, FifteenthActivity.class);
        startActivity(intent);
    }
}
