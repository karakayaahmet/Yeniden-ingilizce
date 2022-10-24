package com.ahmetkarakaya.yenideningilizce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    EditText editText5;
    EditText editText6;
    EditText editText7;
    EditText editText8;

    String edit1, edit2, edit3, edit4, edit5, edit6, edit7, edit8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextTextPersonName);
        editText2 = findViewById(R.id.editTextTextPersonName2);
        editText3 = findViewById(R.id.editTextTextPersonName3);
        editText4 = findViewById(R.id.editTextTextPersonName4);
        editText5 = findViewById(R.id.editTextTextPersonName5);
        editText6 = findViewById(R.id.editTextTextPersonName6);
        editText7 = findViewById(R.id.editTextTextPersonName7);
        editText8 = findViewById(R.id.editTextTextPersonName8);

        Intent intent = getIntent();
        edit1 = intent.getStringExtra("edit1");
        edit2 = intent.getStringExtra("edit2");
        edit3 = intent.getStringExtra("edit3");
        edit4 = intent.getStringExtra("edit4");
        edit5 = intent.getStringExtra("edit5");
        edit6 = intent.getStringExtra("edit6");
        edit7 = intent.getStringExtra("edit7");
        edit8 = intent.getStringExtra("edit8");

        editText.setText(edit1);
        editText2.setText(edit2);
        editText3.setText(edit3);
        editText4.setText(edit4);
        editText5.setText(edit5);
        editText6.setText(edit6);
        editText7.setText(edit7);
        editText8.setText(edit8);
    }

    public void gec(View view){
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra("edit1",editText.getText().toString());
        intent.putExtra("edit2",editText2.getText().toString());
        intent.putExtra("edit3",editText3.getText().toString());
        intent.putExtra("edit4",editText4.getText().toString());
        intent.putExtra("edit5",editText5.getText().toString());
        intent.putExtra("edit6",editText6.getText().toString());
        intent.putExtra("edit7",editText7.getText().toString());
        intent.putExtra("edit8",editText8.getText().toString());
        startActivity(intent);
    }
}