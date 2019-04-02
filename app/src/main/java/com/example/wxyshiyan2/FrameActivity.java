package com.example.wxyshiyan2;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.LogRecord;

public class FrameActivity extends AppCompatActivity {

    int[]images={
            R.drawable.img_1,
            R.drawable.img_2,
            R.drawable.img_3,
            R.drawable.img_4,
            R.drawable.img_5,
    };
    int SIGN=17;
    int num=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);


        final ImageView image = findViewById(R.id.image);
        final android.os.Handler handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                if(msg.what==SIGN){
                    image.setImageResource(images[num++]);
                    if (num>=images.length){
                        num=0;
                    }
                }

            }
        };
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Message msg = new Message();
                msg.what = SIGN;
                handler.sendMessage(msg);
            }
        },1000,500);
    }


}


