package com.example.saloni.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;


public class logos extends AppCompatActivity {
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logos);
    }

    public void Result1(View view)
    {
        RadioButton checkedq1 = findViewById(R.id.qq1B);
        boolean ischeckedq1 = checkedq1.isChecked();
        if(ischeckedq1) score++;
        RadioButton checkedq2 = findViewById(R.id.qq2C);
        boolean ischeckedq2 = checkedq2.isChecked();
        if(ischeckedq2) score++;
        RadioButton checkedq3 = findViewById(R.id.qq3A);
        boolean ischeckedq3 = checkedq3.isChecked();
        if(ischeckedq3) score++;
        RadioButton checkedq4 = findViewById(R.id.qq4B);
        boolean ischeckedq4 = checkedq4.isChecked();
        if(ischeckedq4) score++;
        RadioButton checkedq5 = findViewById(R.id.qq5D);
        boolean ischeckedq5 = checkedq5.isChecked();
        if(ischeckedq5) score++;
        // Toast toast= Toast.makeText(this, "" + score, Toast.LENGTH_SHORT);
        //toast.show();

        Intent i
                = new Intent(logos.this,result.class);
        i.putExtra("key1",score);
        startActivity(i);
        score=0;

    }
}
