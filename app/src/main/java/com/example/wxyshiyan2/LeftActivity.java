package com.example.wxyshiyan2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LeftActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuizhi);

        Button button11=(Button)findViewById(R.id.button_11);
        Button button12=(Button)findViewById(R.id.button_12);
        Button button13=(Button)findViewById(R.id.button_13);
        Button button14=(Button)findViewById(R.id.button_14);

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LeftActivity.this,shuipingActivity.class);
                startActivity(intent);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LeftActivity.this,chuizhiActivity.class);
                startActivity(intent);
            }
        });


        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LeftActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
