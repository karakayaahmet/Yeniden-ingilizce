package com.ahmetkarakaya.yenideningilizce;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity3 extends AppCompatActivity {
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    TextView textView8;
    TextView textView9;
    TextView textView10;
    TextView textView11;

    Handler handler;
    Runnable runnable;

    String edit1, edit2, edit3, edit4, edit5, edit6, edit7, edit8, edit9, edit10, edit11, edit12, edit13, edit14, edit15, edit16;

    TextView[] textViewsArray;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);
        textView11 = findViewById(R.id.textView11);

        textViewsArray = new TextView[]{textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11};

        Intent intent = getIntent();
        edit1 = intent.getStringExtra("edit1");
        edit2 = intent.getStringExtra("edit2");
        edit3 = intent.getStringExtra("edit3");
        edit4 = intent.getStringExtra("edit4");
        edit5 = intent.getStringExtra("edit5");
        edit6 = intent.getStringExtra("edit6");
        edit7 = intent.getStringExtra("edit7");
        edit8 = intent.getStringExtra("edit8");
        edit9 = intent.getStringExtra("edit9");
        edit10 = intent.getStringExtra("edit10");
        edit11 = intent.getStringExtra("edit11");
        edit12 = intent.getStringExtra("edit12");
        edit13 = intent.getStringExtra("edit13");
        edit14 = intent.getStringExtra("edit14");
        edit15 = intent.getStringExtra("edit15");
        edit16 = intent.getStringExtra("edit16");

        textView4.setText(edit1+" "+edit9);
        textView5.setText(edit2+" "+edit10);
        textView6.setText(edit3+" "+edit11);
        textView7.setText(edit4+" "+edit12);
        textView8.setText(edit5+" "+edit13);
        textView9.setText(edit6+" "+edit14);
        textView10.setText(edit7+" "+edit15);
        textView11.setText(edit8+" "+edit16);

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                for(TextView i : textViewsArray){
                    i.setVisibility(View.INVISIBLE);
                }

                Random random = new Random();
                int i = random.nextInt(8);
                textViewsArray[i].setVisibility(View.VISIBLE);

                handler.postDelayed(this,1000);
            }

        };
        new CountDownTimer(50000,1000){
            public void onTick(long l){
                textView3.setText(""+l/1000);

            }
            public void onFinish(){
                textView3.setText("Bitti");
                Toast.makeText(MainActivity3.this,"Bitti",Toast.LENGTH_LONG).show();
                handler.removeCallbacks(runnable);

                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity3.this);
                alert.setTitle("Tekrar Başlat");
                alert.setMessage("Tekrar Başlatılsın Mı?");
                alert.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent inten2 = getIntent();
                        finish();
                        startActivity(inten2);
                    }
                });

                alert.setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity3.this, "Tamamlandı.", Toast.LENGTH_SHORT).show();

                        for(TextView text : textViewsArray){
                            text.setVisibility(View.INVISIBLE);
                        }
                    }
                });

                alert.show();
            }
        }.start();
        handler.post(runnable);

    }
}