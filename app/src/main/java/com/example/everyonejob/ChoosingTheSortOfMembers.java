package com.example.everyonejob;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ChoosingTheSortOfMembers extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choosingthesortofmembers);

        Button buttonforseeker = (Button)findViewById(R.id.buttonforseeker);
        Button buttonforcompany = (Button)findViewById(R.id.buttonforcompany);
        buttonforseeker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RegisterForSeeker.class);
                startActivity(intent);
            }
        });
        buttonforcompany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RegisterForCompany.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.buttonforcompany) {

        } else if (view.getId() == R.id.buttonforcompany) {

        }

    }
}
