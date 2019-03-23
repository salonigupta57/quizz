package com.example.saloni.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class result extends AppCompatActivity
{
int score1;
String msg;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        score1=getIntent().getIntExtra("key1",5);
        // Toast toast=Toast.makeText(result.this,"score1",Toast.LENGTH_LONG);
        // toast.show();
        msg="Congrats you scored "+score1;
         display(msg);
     }
        private void display(String result)
    {
        TextView finalResult1=findViewById(R.id.finalResult);
        finalResult1.setText(""+result);
    }
}
