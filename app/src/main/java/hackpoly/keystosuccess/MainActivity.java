package hackpoly.keystosuccess;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_soundboard);
            final MediaPlayer mediaPlayer1 = MediaPlayer.create(this, R.raw.record1);
            //listen for button being clicked
            ImageButton button1 = (ImageButton) findViewById(R.id.dj1);
            button1.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    mediaPlayer1.start();
                }
            });

            final MediaPlayer mediaPlayer2 = MediaPlayer.create(this,R.raw.record2);
            ImageButton button2 = (ImageButton) findViewById(R.id.dj2);
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer2.start();
                }
            });

            final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.record3);
            //listen for button being clicked
            ImageButton button3 = (ImageButton) findViewById(R.id.dj3);
            button3.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    mediaPlayer3.start();
                }
            });

            final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.record4);
            //listen for button being clicked
            ImageButton button4 = (ImageButton) findViewById(R.id.dj4);
            button4.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    mediaPlayer4.start();
                }
            });

            final MediaPlayer mediaPlayer5 = MediaPlayer.create(this, R.raw.record5);
            //listen for button being clicked
            ImageButton button5 = (ImageButton) findViewById(R.id.dj5);
            button5.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    mediaPlayer5.start();
                }
            });

            final MediaPlayer mediaPlayer6 = MediaPlayer.create(this, R.raw.record6);
            //listen for button being clicked
            ImageButton button6 = (ImageButton) findViewById(R.id.dj6);
            button6.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    mediaPlayer6.start();
                }
            });

            final MediaPlayer mediaPlayer7 = MediaPlayer.create(this, R.raw.record7);
            //listen for button being clicked
            ImageButton button7 = (ImageButton) findViewById(R.id.dj7);
            button7.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    mediaPlayer7.start();
                }
            });

            final MediaPlayer mediaPlayer8 = MediaPlayer.create(this, R.raw.record8);
            //listen for button being clicked
            ImageButton button8 = (ImageButton) findViewById(R.id.dj8);
            button8.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    mediaPlayer8.start();
                }
            });

            final MediaPlayer mediaPlayer9 = MediaPlayer.create(this, R.raw.record9);
            //listen for button being clicked
            ImageButton button9 = (ImageButton) findViewById(R.id.dj9);
            button9.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    mediaPlayer9.start();
                }
            });

            final MediaPlayer mediaPlayer10 = MediaPlayer.create(this, R.raw.record10);
            //listen for button being clicked
            ImageButton button10 = (ImageButton) findViewById(R.id.dj10);
            button10.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    mediaPlayer10.start();
                }
            });

            final MediaPlayer mediaPlayer11 = MediaPlayer.create(this, R.raw.record11);
            //listen for button being clicked
            ImageButton button11 = (ImageButton) findViewById(R.id.dj11);
            button11.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    mediaPlayer11.start();
                }
            });

            final MediaPlayer mediaPlayer12 = MediaPlayer.create(this, R.raw.record12);
            //listen for button being clicked
            ImageButton button12 = (ImageButton) findViewById(R.id.dj12);
            button12.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    mediaPlayer12.start();
                }
            });


    }
}
