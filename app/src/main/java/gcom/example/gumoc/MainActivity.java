package gcom.example.gumoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.example.gumoc.R;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    MediaPlayer intromain;
    ImageView logo;
    ProgressBar carga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);


        carga = findViewById(R.id.progressBar);
        carga.setVisibility(View.INVISIBLE);
        carga.setProgress(40);
        logo = findViewById(R.id.logo);
        intromain = MediaPlayer.create(this, R.raw.intromain);
        intromain.start();
        intromain.pause();

        carga.setVisibility(View.VISIBLE);

        Animation fadeout = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadeout);
        Animation fadein = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadein);

        TimerTask transicion = new TimerTask() {

            @Override
            public void run() {


                Animation fadeout = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.desaparecer);
         //       logo.startAnimation(fadeout);


                Intent menu = new Intent(MainActivity.this, segunda.class);
                startActivity(menu);
                finish();
            }
        };

              Timer tiempo = new Timer();
              tiempo.schedule(transicion, 1500);



                  }
              }







