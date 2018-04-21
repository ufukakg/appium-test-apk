package com.example.edacaner.testapk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FourthActivity extends AppCompatActivity {

    private Button saveChangesBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        saveChangesBtn = findViewById(R.id.saveChanges);
        saveChangesBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openSecondActivity();
            }
        });
    }

    public void openSecondActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

}
