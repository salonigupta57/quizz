package com.example.saloni.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class riddles extends AppCompatActivity {
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riddles);
    }

    public void Result2(View view)
    {
        EditText q1 =  findViewById(R.id.q1);
        String Q1= q1.getText().toString();
        if(Q1.equalsIgnoreCase("Starting"))
            score++;
        EditText q2 =  findViewById(R.id.q2);
        String Q2= q2.getText().toString();
        if(Q2.equalsIgnoreCase("A Penny")||Q2.equalsIgnoreCase("Penny"))
            score++;
        EditText q3 =  findViewById(R.id.q3);
        String Q3= q3.getText().toString();
        if(Q3.equalsIgnoreCase("A Piano")||Q3.equalsIgnoreCase("Piano"))
            score++;
        EditText q4 =  findViewById(R.id.q4);
        String Q4= q4.getText().toString();
        if(Q4.equalsIgnoreCase("A Die")||Q4.equalsIgnoreCase("A Dice")||Q4.equalsIgnoreCase("Die")||Q4.equalsIgnoreCase("Dice"))
            score++;
        EditText q5 =  findViewById(R.id.q5);
        String Q5= q5.getText().toString();
        if(Q5.equalsIgnoreCase("A Fence")||Q5.equalsIgnoreCase("Fence"))
            score++;
        // Toast toast= Toast.makeText(this, "" + score, Toast.LENGTH_SHORT);
        //toast.show();

        Intent i = new Intent(riddles.this,result.class);
        i.putExtra("key1",score);
        startActivity(i);
        score=0;

    }
}
