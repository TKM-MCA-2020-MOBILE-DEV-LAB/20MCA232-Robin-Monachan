package com.example.multi_intend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t,t2;
    EditText e;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       t=findViewById(R.id.t1);
       t2=findViewById(R.id.am);
        b1=findViewById(R.id.button2);
        e = findViewById(R.id.unit);
        String usern=getIntent().getStringExtra("Username");
        t.setText(usern);
        b2=findViewById(R.id.cal);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String unit=e.getText().toString();
                int i=Integer.parseInt(unit);
                int amt= i*3;

                t2.setText(amt+"");
            }
        });



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(i);
            }
        });

    }
}