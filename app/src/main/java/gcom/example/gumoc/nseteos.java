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
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.gumoc.R;

public class nseteos extends AppCompatActivity {

    ImageButton opcionesn;
    ImageView nset1a,nset2a,nset3a,nset4a,nset1b,nset2b,nset3b,nset4b,a, l, an, pb;
    MediaPlayer mn1, mn2, mn3, mn4;
    SoundPool toogle;
    int opciones, sonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nseteos);

        setTitle("\uD83C\uDFA7 Seteos \uD83C\uDFA7");

        toogle = new SoundPool(1, AudioManager.STREAM_MUSIC, 1);
        sonido = toogle.load(this, R.raw.toogle, 1);

        a = findViewById(R.id.a);
        l = findViewById(R.id.l);
        an = findViewById(R.id.an);
        pb = findViewById(R.id.pb);

        mn1 = MediaPlayer.create(this, R.raw.mn1);
        mn2 = MediaPlayer.create(this, R.raw.mn2);
        mn3 = MediaPlayer.create(this, R.raw.mn3);
        mn4 = MediaPlayer.create(this, R.raw.mn4);

        mn1.start();
        mn2.start();
        mn3.start();
        mn4.start();
        mn1.pause();
        mn2.pause();
        mn3.pause();
        mn4.pause();

        nset1a = findViewById(R.id.nset1a);
        nset2a = findViewById(R.id.nset2a);
        nset3a = findViewById(R.id.nset3a);
        nset4a = findViewById(R.id.nset4a);

        nset1b = findViewById(R.id.nset1b);
        nset2b = findViewById(R.id.nset2b);
        nset3b = findViewById(R.id.nset3b);
        nset4b = findViewById(R.id.nset4b);


        nset1a.setVisibility(View.GONE);
        nset2a.setVisibility(View.GONE);
        nset3a.setVisibility(View.GONE);
        nset4a.setVisibility(View.GONE);

        nset1b.setAlpha(175);
        nset2b.setAlpha(175);
        nset3b.setAlpha(175);
        nset4b.setAlpha(175);


    }   ///// F U N C I O N E S  DEL MENU BARRA SUPERIOR (TOOLBAR)
    public boolean onCreateOptionsMenu(Menu menu){
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
            Intent b = new Intent(this, Nautilus.class);
            startActivity(b);

        }
        return true;

    }

    //// APP EN SEGUNDO PLANO PAUSA LOS AUDIOS

    @Override protected void onStop() {
        super.onStop();

        mn1 = MediaPlayer.create(this, R.raw.mn1);
        mn2 = MediaPlayer.create(this, R.raw.mn2);
        mn3 = MediaPlayer.create(this, R.raw.mn3);
        mn4 = MediaPlayer.create(this, R.raw.mn4);

        mn1.release();
        mn2.release();
        mn3.release();
        mn4.release();

    }  @Override protected void onResume(){
        super.onResume();

        mn1 = MediaPlayer.create(this, R.raw.mn1);
        mn2 = MediaPlayer.create(this, R.raw.mn2);
        mn3 = MediaPlayer.create(this, R.raw.mn3);
        mn4 = MediaPlayer.create(this, R.raw.mn4);

        nset1a.setVisibility(View.INVISIBLE);
        nset2a.setVisibility(View.INVISIBLE);
        nset3a.setVisibility(View.INVISIBLE);
        nset4a.setVisibility(View.INVISIBLE);

        nset1b.setVisibility(View.VISIBLE);
        nset2b.setVisibility(View.VISIBLE);
        nset3b.setVisibility(View.VISIBLE);
        nset4b.setVisibility(View.VISIBLE);

        mn1.start();
        mn2.start();
        mn3.start();
        mn4.start();

        if (mn1.isPlaying()) {
            mn1.pause();
        }

        if (mn2.isPlaying()) {
            mn2.pause();
        }
        if (mn3.isPlaying()) {
            mn3.pause();
        }
        if (mn4.isPlaying()) {
            mn4.pause();
        }




    }public void onPause(){
       super.onPause();

        if (mn1.isPlaying()) {
            mn1.pause();
        }

        if (mn2.isPlaying()) {
            mn2.pause();
        }
        if (mn3.isPlaying()) {
            mn3.pause();
        }
        if (mn4.isPlaying()) {
            mn4.pause();
        }


        nset1a.setVisibility(View.INVISIBLE);
        nset2a.setVisibility(View.INVISIBLE);
        nset3a.setVisibility(View.INVISIBLE);
        nset4a.setVisibility(View.INVISIBLE);

        nset1b.setVisibility(View.VISIBLE);
        nset2b.setVisibility(View.VISIBLE);
        nset3b.setVisibility(View.VISIBLE);
        nset4b.setVisibility(View.VISIBLE);

        mn1.release();
        mn2.release();
        mn3.release();
        mn4.release();


    }public void napocalipsis(View view){

        Intent napocalipsis = new Intent(this, overdrive.class);
        startActivity(napocalipsis);

    }public void nlighthouse(View view){

        Intent nlighthouse = new Intent(this, lighthouse.class);
        startActivity(nlighthouse);

    }public void nandromeda(View view){

        Intent nandromeda = new Intent(this, andromeda.class);
        startActivity(nandromeda);

    } public void fuzzilla(View view) {

        Intent f = new Intent(this, fuzzilla.class);
        startActivity(f);


    }public void npedalboard(View view){

        Intent npedalboard = new Intent(this, box.class);
        startActivity(npedalboard);

    }public void s(View view) {

        Intent s = new Intent(this, saturno.class);
        startActivity(s);

    }

///// SETEOS DEL PEDAL



    public void set1b (View view){

        toogle.play(sonido, 1, 1, 1, 0, 0);

        nset1a.setVisibility(View.VISIBLE);
        nset1b.setVisibility(View.INVISIBLE);

        mn1.seekTo(0);

        mn1.start();

        mn2.pause();
        mn3.pause();
        mn4.pause();

        nset2a.setVisibility(View.INVISIBLE);
        nset3a.setVisibility(View.INVISIBLE);
        nset4a.setVisibility(View.INVISIBLE);

        nset2b.setVisibility(View.VISIBLE);
        nset3b.setVisibility(View.VISIBLE);
        nset4b.setVisibility(View.VISIBLE);

    }public void set1a (View view){
        toogle.play(sonido, 1, 1, 1, 0, 0);

        nset1b.setVisibility(View.VISIBLE);
        nset1a.setVisibility(View.INVISIBLE);
        mn1.pause();

    }
    public void set2b (View view){
        toogle.play(sonido, 1, 1, 1, 0, 0);


        nset2a.setVisibility(View.VISIBLE);
        nset2b.setVisibility(View.INVISIBLE);


        mn2.seekTo(0);

        mn2.start();

        mn1.pause();
        mn3.pause();
        mn4.pause();

        nset1a.setVisibility(View.INVISIBLE);
        nset3a.setVisibility(View.INVISIBLE);
        nset4a.setVisibility(View.INVISIBLE);

        nset1b.setVisibility(View.VISIBLE);
        nset3b.setVisibility(View.VISIBLE);
        nset4b.setVisibility(View.VISIBLE);


    }public void set2a (View view){
        toogle.play(sonido, 1, 1, 1, 0, 0);

        nset2b.setVisibility(View.VISIBLE);
        nset2a.setVisibility(View.INVISIBLE);
        mn2.pause();

    }public void set3b (View view){
        toogle.play(sonido, 1, 1, 1, 0, 0);

        nset3a.setVisibility(View.VISIBLE);
        nset3b.setVisibility(View.INVISIBLE);

        mn3.seekTo(0);

        mn3.start();

        mn1.pause();
        mn2.pause();
        mn4.pause();

        nset1a.setVisibility(View.INVISIBLE);
        nset2a.setVisibility(View.INVISIBLE);
        nset4a.setVisibility(View.INVISIBLE);

        nset1b.setVisibility(View.VISIBLE);
        nset2b.setVisibility(View.VISIBLE);
        nset4b.setVisibility(View.VISIBLE);


    }public void set3a (View view){
        toogle.play(sonido, 1, 1, 1, 0, 0);

        nset3b.setVisibility(View.VISIBLE);
        nset3a.setVisibility(View.INVISIBLE);
        mn3.pause();

    }public void set4b (View view) {
        toogle.play(sonido, 1, 1, 1, 0, 0);


        nset4a.setVisibility(View.VISIBLE);
        nset4b.setVisibility(View.INVISIBLE);

        mn4.seekTo(0);

        mn4.start();

        mn1.pause();
        mn2.pause();
        mn3.pause();

        nset1a.setVisibility(View.INVISIBLE);
        nset2a.setVisibility(View.INVISIBLE);
        nset3a.setVisibility(View.INVISIBLE);

        nset1b.setVisibility(View.VISIBLE);
        nset2b.setVisibility(View.VISIBLE);
        nset3b.setVisibility(View.VISIBLE);


    }public void set4a (View view){
        toogle.play(sonido, 1, 1, 1, 0, 0);

        nset4b.setVisibility(View.VISIBLE);
        nset4a.setVisibility(View.INVISIBLE);
        mn4.pause();

    }


}