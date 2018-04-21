package com.example.edacaner.testapk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class SixthActivity extends AppCompatActivity {

    private Button contBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);

        contBtn2 = findViewById(R.id.contButton2);

        contBtn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                    openSeventhActivity();
            }
        });
    }

    public void openSeventhActivity() {
        Intent intent = new Intent(this, SeventhActivity.class);
        startActivity(intent);
    }

}
