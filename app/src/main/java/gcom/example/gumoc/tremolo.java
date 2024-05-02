package gcom.example.gumoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.example.gumoc.R;

public class tremolo extends AppCompatActivity {

    ImageView ss1a,ss2a,ss3a,ss4a,ss1b,ss2b,ss3b,ss4b,a,n,an,f,l;
    MediaPlayer ms1, ms2, ms3, ms4;
    SoundPool toogle;
    int opciones, sonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tremolo);

        setTitle("\uD83C\uDFA7 Seteos \uD83C\uDFA7");


        a = findViewById(R.id.a);
        an = findViewById(R.id.an);
        l = findViewById(R.id.l);
        f = findViewById(R.id.f);
        n = findViewById(R.id.n);

        toogle = new SoundPool(1, AudioManager.STREAM_MUSIC, 1);
        sonido = toogle.load(this, R.raw.toogle, 1);

        ms1 = MediaPlayer.create(this, R.raw.ms1);
        ms2 = MediaPlayer.create(this, R.raw.ms2);
        ms3 = MediaPlayer.create(this, R.raw.ms3);
        ms4 = MediaPlayer.create(this, R.raw.ms4);

        ms1.start();
        ms2.start();
        ms3.start();
        ms4.start();
        ms1.pause();
        ms2.pause();
        ms3.pause();
        ms4.pause();

        ss1a = findViewById(R.id.ss1a);
        ss2a = findViewById(R.id.ss2a);
        ss3a = findViewById(R.id.ss3a);
        ss4a = findViewById(R.id.ss4a);


        ss1b = findViewById(R.id.ss1b);
        ss2b = findViewById(R.id.ss2b);
        ss3b = findViewById(R.id.ss3b);
        ss4b = findViewById(R.id.ss4b);


        ss1a.setVisibility(View.GONE);
        ss2a.setVisibility(View.GONE);
        ss3a.setVisibility(View.GONE);
        ss4a.setVisibility(View.GONE);

        ss1b.setAlpha(175);
        ss2b.setAlpha(175);
        ss3b.setAlpha(175);
        ss4b.setAlpha(175);


        ///// F U N C I O N E S  DEL MENU BARRA SUPERIOR (TOOLBAR)
    }  public boolean onCreateOptionsMenu(Menu menu){
            getMenuInflater().inflate(R.menu.menu_seteos, menu);
            return true;

        } public boolean onOptionsItemSelected(MenuItem item){
            int id = item.getItemId();

            if (id == R.id.ig){
                Intent ig = new Intent(this, instagram.class);
                startActivity(ig);

            }if (id == R.id.fb){
                Intent fb = new Intent(this, facebook.class);
                startActivity(fb);

            }if (id == R.id.yt){
                Intent yt = new Intent(this, youtube.class);
                startActivity(yt);

            }if (id == R.id.Home){
                Intent h = new Intent(this, segunda.class);
                startActivity(h);

            }if (id == R.id.back){
            Intent b = new Intent(this, saturno.class);
            startActivity(b);

        }
            return true;

        }

    //// APP EN SEGUNDO PLANO PAUSA LOS AUDIOS

    @Override protected void onStop() {
        super.onStop();

        ms1 = MediaPlayer.create(this, R.raw.ms1);
        ms2 = MediaPlayer.create(this, R.raw.ms2);
        ms3 = MediaPlayer.create(this, R.raw.ms3);
        ms4 = MediaPlayer.create(this, R.raw.ms4);

        ms1.release();
        ms2.release();
        ms3.release();
        ms4.release();

    }  @Override protected void onResume(){
        super.onResume();

        ms1 = MediaPlayer.create(this, R.raw.ms1);
        ms2 = MediaPlayer.create(this, R.raw.ms2);
        ms3 = MediaPlayer.create(this, R.raw.ms3);
        ms4 = MediaPlayer.create(this, R.raw.ms4);

        ss1a.setVisibility(View.INVISIBLE);
        ss2a.setVisibility(View.INVISIBLE);
        ss3a.setVisibility(View.INVISIBLE);
        ss4a.setVisibility(View.INVISIBLE);

        ss1b.setVisibility(View.VISIBLE);
        ss2b.setVisibility(View.VISIBLE);
        ss3b.setVisibility(View.VISIBLE);
        ss4b.setVisibility(View.VISIBLE);

        ms1.start();
        ms2.start();
        ms3.start();
        ms4.start();

        if (ms1.isPlaying()) {
            ms1.pause();
        }

        if (ms2.isPlaying()) {
            ms2.pause();
        }
        if (ms3.isPlaying()) {
            ms3.pause();
        }
        if (ms4.isPlaying()) {
            ms4.pause();
        }




    }public void onPause(){
        super.onPause();

        if (ms1.isPlaying()) {
            ms1.pause();
        }

        if (ms2.isPlaying()) {
            ms2.pause();
        }
        if (ms3.isPlaying()) {
            ms3.pause();
        }
        if (ms4.isPlaying()) {
            ms4.pause();
        }


        ss1a.setVisibility(View.INVISIBLE);
        ss2a.setVisibility(View.INVISIBLE);
        ss3a.setVisibility(View.INVISIBLE);
        ss4a.setVisibility(View.INVISIBLE);

        ss1b.setVisibility(View.VISIBLE);
        ss2b.setVisibility(View.VISIBLE);
        ss3b.setVisibility(View.VISIBLE);
        ss4b.setVisibility(View.VISIBLE);

        ms1.release();
        ms2.release();
        ms3.release();
        ms4.release();


    } public void a(View view){

            Intent a = new Intent(this, overdrive.class);
            startActivity(a);

        }public void n(View view){

            Intent n = new Intent(this, Nautilus.class);
            startActivity(n);

        }public void an(View view) {

            Intent an = new Intent(this, andromeda.class);
            startActivity(an);

        } public void f(View view) {

            Intent f = new Intent(this, fuzzilla.class);
            startActivity(f);


        }public void box(View view){

            Intent box = new Intent(this, box.class);
            startActivity(box);

        }public void l(View view) {

        Intent l = new Intent(this, lighthouse.class);
        startActivity(l);

///// SETEOS DEL PEDAL


    }public void set1b (View view){

            toogle.play(sonido, 1, 1, 1, 0, 0);

            ss1a.setVisibility(View.VISIBLE);
            ss1b.setVisibility(View.INVISIBLE);

            ms1.seekTo(0);

            ms1.start();

            ms2.pause();
            ms3.pause();
            ms4.pause();

            ss2a.setVisibility(View.INVISIBLE);
            ss3a.setVisibility(View.INVISIBLE);
            ss4a.setVisibility(View.INVISIBLE);

            ss2b.setVisibility(View.VISIBLE);
            ss3b.setVisibility(View.VISIBLE);
            ss4b.setVisibility(View.VISIBLE);


        }
        public void set1a (View view){
            toogle.play(sonido, 1, 1, 1, 0, 0);

            ss1b.setVisibility(View.VISIBLE);
            ss1a.setVisibility(View.INVISIBLE);
            ms1.pause();

        }
        public void set2b (View view){
            toogle.play(sonido, 1, 1, 1, 0, 0);


            ss2a.setVisibility(View.VISIBLE);
            ss2b.setVisibility(View.INVISIBLE);


            ms2.seekTo(0);

            ms2.start();

            ms1.pause();
            ms3.pause();
            ms4.pause();

            ss1a.setVisibility(View.INVISIBLE);
            ss3a.setVisibility(View.INVISIBLE);
            ss4a.setVisibility(View.INVISIBLE);

            ss1b.setVisibility(View.VISIBLE);
            ss3b.setVisibility(View.VISIBLE);
            ss4b.setVisibility(View.VISIBLE);


        }
        public void set2a (View view){
            toogle.play(sonido, 1, 1, 1, 0, 0);

            ss2b.setVisibility(View.VISIBLE);
            ss2a.setVisibility(View.INVISIBLE);
            ms2.pause();

        }
        public void set3b (View view){

            toogle.play(sonido, 1, 1, 1, 0, 0);

            ss3a.setVisibility(View.VISIBLE);
            ss3b.setVisibility(View.INVISIBLE);

            ms3.seekTo(0);

            ms3.start();

            ms1.pause();
            ms2.pause();
            ms4.pause();

            ss1a.setVisibility(View.INVISIBLE);
            ss2a.setVisibility(View.INVISIBLE);
            ss4a.setVisibility(View.INVISIBLE);

            ss1b.setVisibility(View.VISIBLE);
            ss2b.setVisibility(View.VISIBLE);
            ss4b.setVisibility(View.VISIBLE);


        }public void set3a (View view){
            toogle.play(sonido, 1, 1, 1, 0, 0);

            ss3b.setVisibility(View.VISIBLE);
            ss3a.setVisibility(View.INVISIBLE);
            ms3.pause();

        }
        public void set4b (View view){
            toogle.play(sonido, 1, 1, 1, 0, 0);


            ss4a.setVisibility(View.VISIBLE);
            ss4b.setVisibility(View.INVISIBLE);

            ms4.seekTo(0);

            ms4.start();

            ms1.pause();
            ms2.pause();
            ms3.pause();

            ss1a.setVisibility(View.INVISIBLE);
            ss2a.setVisibility(View.INVISIBLE);
            ss3a.setVisibility(View.INVISIBLE);

            ss1b.setVisibility(View.VISIBLE);
            ss2b.setVisibility(View.VISIBLE);
            ss3b.setVisibility(View.VISIBLE);


        }
        public void set4a (View view){
            toogle.play(sonido, 1, 1, 1, 0, 0);

            ss4b.setVisibility(View.VISIBLE);
            ss4a.setVisibility(View.INVISIBLE);
            ms4.pause();

        }


    }
