package com.example.multi_intend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,p1;
    Button b1;
    String name,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.email);

        p1=findViewById(R.id.pass);
        b1=findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name= e1.getText().toString();
                pass= p1.getText().toString();
                if (name.equals("jomin") && pass.equals("1234")) {
                    Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("Username",name);
                    startActivity(intent);
                }
                else
                Toast.makeText(MainActivity.this,"Invalid Username and password",Toast.LENGTH_LONG).show();            }
        });
    }
}