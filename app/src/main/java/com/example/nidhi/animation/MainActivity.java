package com.example.nidhi.animation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    Button btnfin,btnfout,btnzin,btnzout,btnblnk,btnrot,btndf;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnfin = (Button) findViewById(R.id.fin);
        btnfout = (Button) findViewById(R.id.fout);
        btnblnk=(Button) findViewById(R.id.blnk);
        btnzin=(Button) findViewById(R.id.zin);
        btnzout=(Button) findViewById(R.id.zout);
        btnrot=(Button) findViewById(R.id.rot);
        btndf=(Button) findViewById(R.id.df);
        img =(ImageView) findViewById(R.id.image);

        btnfin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.fadein);
                img.startAnimation(animation);

            }
        });
        btnfout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.fadeout);
                img.startAnimation(animation);

            }
        });btnzin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoomin);
                img.startAnimation(animation);

            }
        });btnzout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoomout);
                img.startAnimation(animation);

            }
        });btnrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.rot);
                img.startAnimation(animation);

            }
        });btnblnk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.blink);
                animation.setRepeatCount(10);
                img.startAnimation(animation);

            }
        });
        btndf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DFActivity.class);
                startActivity(intent);
            }
        });

    }

}
