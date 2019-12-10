package com.example.airhorne;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageButton button;
    private MediaPlayer myMusic;
    TextView showTV;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        showTV=findViewById(R.id.showTV);



      /*  myMusic=MediaPlayer.create(this,R.raw.sound2);
        myMusic.start();
        showTV.setText("Hey !Give me side to go forward.");*/




/*        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    i++;

                    if (i==1){
                        myMusic=MediaPlayer.create(getApplicationContext(),R.raw.sound1);
                        myMusic.start();

                        Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
                    }
                    else if (i==2){
                        myMusic=MediaPlayer.create(getApplicationContext(),R.raw.sound2);
                        myMusic.start();

                        Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();

                    }
                    else {
                        myMusic=MediaPlayer.create(getApplicationContext(),R.raw.sound3);
                        myMusic.start();

                        Toast.makeText(MainActivity.this, "3", Toast.LENGTH_SHORT).show();

                    }

                }


        });*/

        button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    //myMusic.seekTo(3);

                    i++;

                    if (i==1){
                        myMusic=MediaPlayer.create(getApplicationContext(),R.raw.sound_1);
                        myMusic.start();

                        Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
                    }
                    else if (i==2){
                        myMusic=MediaPlayer.create(getApplicationContext(),R.raw.sound_2);
                        myMusic.start();

                        Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();

                    }
                    else {
                        myMusic=MediaPlayer.create(getApplicationContext(),R.raw.sound3);
                        myMusic.start();

                        Toast.makeText(MainActivity.this, "3", Toast.LENGTH_SHORT).show();
                        i=0;

                    }

                    myMusic.start();
                    myMusic.setLooping(true);

                } if(event.getAction() == MotionEvent.ACTION_UP) {



                    myMusic.pause();

                }

                return true;

            }
        });

    }
}
