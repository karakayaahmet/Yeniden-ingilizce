package com.ahmetkarakaya.yenideningilizce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText editText;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    EditText editText5;
    EditText editText6;
    EditText editText7;
    EditText editText8;

    String edit1;
    String edit2;
    String edit3;
    String edit4;
    String edit5;
    String edit6;
    String edit7;
    String edit8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editText = findViewById(R.id.editTextTextPersonName);
        editText2 = findViewById(R.id.editTextTextPersonName2);
        editText3 = findViewById(R.id.editTextTextPersonName3);
        editText4 = findViewById(R.id.editTextTextPersonName4);
        editText5 = findViewById(R.id.editTextTextPersonName5);
        editText6 = findViewById(R.id.editTextTextPersonName6);
        editText7 = findViewById(R.id.editTextTextPersonName7);
        editText8 = findViewById(R.id.editTextTextPersonName8);

        Intent intenn = getIntent();
        edit1 = intenn.getStringExtra("edit1");
        edit2 = intenn.getStringExtra("edit2");
        edit3 = intenn.getStringExtra("edit3");
        edit4 = intenn.getStringExtra("edit4");
        edit5 = intenn.getStringExtra("edit5");
        edit6 = intenn.getStringExtra("edit6");
        edit7 = intenn.getStringExtra("edit7");
        edit8 = intenn.getStringExtra("edit8");

    }

    public void tamam(View view){
        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
        intent.putExtra("edit1",edit1);
        intent.putExtra("edit2",edit2);
        intent.putExtra("edit3",edit3);
        intent.putExtra("edit4",edit4);
        intent.putExtra("edit5",edit5);
        intent.putExtra("edit6",edit6);
        intent.putExtra("edit7",edit7);
        intent.putExtra("edit8",edit8);
        intent.putExtra("edit9",editText.getText().toString());
        intent.putExtra("edit10",editText2.getText().toString());
        intent.putExtra("edit11",editText3.getText().toString());
        intent.putExtra("edit12",editText4.getText().toString());
        intent.putExtra("edit13",editText5.getText().toString());
        intent.putExtra("edit14",editText6.getText().toString());
        intent.putExtra("edit15",editText7.getText().toString());
        intent.putExtra("edit16",editText8.getText().toString());

        startActivity(intent);
    }

    public void turkce(View view){
        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        intent.putExtra("edit1",edit1);
        intent.putExtra("edit2",edit2);
        intent.putExtra("edit3",edit3);
        intent.putExtra("edit4",edit4);
        intent.putExtra("edit5",edit5);
        intent.putExtra("edit6",edit6);
        intent.putExtra("edit7",edit7);
        intent.putExtra("edit8",edit8);
        startActivity(intent);
    }
}