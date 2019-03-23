package com.example.saloni.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class page1 extends AppCompatActivity {
String msg1;
String msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        msg1=getIntent().getExtras().getString("Key");
        msg="Hey!!  "+ msg1+ "  Welcome to quiz";
        display("hi");
    }


public void bollywood(View view)
{
    Intent i = new Intent(page1.this, bollywood.class);
    startActivity(i);
}
public void hollywood(View view)
{
    Intent i = new Intent(page1.this,hollywood.class);
    startActivity(i);
}
public void generealKnowledge(View view)
{
    Intent i = new Intent(page1.this, general_knowledge.class);
    startActivity(i);
}
public void cricket(View view)
{
    Intent i = new Intent(page1.this,cricket.class);
    startActivity(i);
}
public void logo(View view)
{
    Intent i = new Intent(page1.this,logos.class);
    startActivity(i);
}
public void riddles(View view)
{
    Intent i = new Intent(page1.this,riddles.class);
    startActivity(i);
}
private void display(String greeting)
{
    TextView text=findViewById(R.id.userName);
    text.setText(msg );
}
}
