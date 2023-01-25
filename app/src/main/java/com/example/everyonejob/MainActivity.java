package com.example.everyonejob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView id,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id = findViewById(R.id.login_id);
        password = findViewById(R.id.login_pass);

        Intent intent = getIntent();
        String userId = intent.getStringExtra("userID");
        String userPass = intent.getStringExtra("userPass");

        id.setText(userId);
        password.setText(userPass);

        }
    }
