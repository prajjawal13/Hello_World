package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    TextView textView,textView1;
    Button button;
    Context context;

     @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.hello_world);
        textView1=findViewById(R.id.app_name);
        button=findViewById(R.id.button);

        context=MainActivity.this;
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this, "Click Me", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(context,FirstActivity.class);
                startActivity(intent);
            }
        });
    }
}
