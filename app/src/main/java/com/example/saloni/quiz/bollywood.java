package com.example.saloni.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;


public class bollywood extends AppCompatActivity {
    int score1=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bollywood);
    }
    public void result1(View view)
    {   RadioButton checkedq1 = findViewById(R.id.q1C);
        boolean ischeckedq1 = checkedq1.isChecked();
        if(ischeckedq1) score1++;
        RadioButton checkedq2 = findViewById(R.id.q2C);
        boolean ischeckedq2 = checkedq2.isChecked();
        if(ischeckedq2) score1++;
        RadioButton checkedq3 = findViewById(R.id.q3D);
        boolean ischeckedq3 = checkedq3.isChecked();
        if(ischeckedq3) score1++;
        RadioButton checkedq4 = findViewById(R.id.q4B);
        boolean ischeckedq4 = checkedq4.isChecked();
        if(ischeckedq4) score1++;
        RadioButton checkedq5 = findViewById(R.id.q5A );
        boolean ischeckedq5 = checkedq5.isChecked();
        if(ischeckedq5) score1++;
        //Toast toast= Toast.makeText(this, "" + score, Toast.LENGTH_SHORT);
        //toast.show();

        Intent i
                = new Intent(bollywood.this,result.class);
        i.putExtra("key1",score1);
        startActivity(i);
        score1=0;

    }
}



