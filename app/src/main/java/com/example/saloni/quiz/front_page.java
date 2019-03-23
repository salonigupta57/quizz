package com.example.saloni.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class front_page extends AppCompatActivity {
    EditText userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);
    }
//
    public void next(View view)
    {
        userName =  findViewById(R.id.user_name);
        String uName= userName.getText().toString();
       Intent i = new Intent(front_page.this, page1.class);
       i.putExtra("Key",uName);
        startActivity(i);
    }

    }
