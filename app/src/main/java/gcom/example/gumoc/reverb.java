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

public class reverb extends AppCompatActivity {

    ImageView lset1a,lset2a,lset3a,lset4a,lset1b,lset2b,lset3b,lset4b,  a, n, an, pb;
    MediaPlayer mr1, mr2, mr3, mr4;
    SoundPool toogle;
    int opciones, sonido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverb);

        setTitle("\uD83C\uDFA7 Seteos \uD83C\uDFA7");


        toogle = new SoundPool(1, AudioManager.STREAM_MUSIC, 1);
        sonido = toogle.load(this, R.raw.toogle, 1);

        a = findViewById(R.id.a50);
        n = findViewById(R.id.a50);
        an = findViewById(R.id.an50);
        pb = findViewById(R.id.pb50);

        mr1 = MediaPlayer.create(this, R.raw.mr1);
        mr2 = MediaPlayer.create(this, R.raw.mr2);
        mr3 = MediaPlayer.create(this, R.raw.mr3);
        mr4 = MediaPlayer.create(this, R.raw.mr4);

        mr1.start();
        mr2.start();
        mr3.start();
        mr4.start();

        if(mr1.isPlaying()){
            mr1.pause();
        }
        if(mr2.isPlaying()){
            mr2.pause();
        }
        if(mr3.isPlaying()){
            mr3.pause();
        }
        if(mr4.isPlaying()){
            mr4.pause();
        }

        lset1a = findViewById(R.id.lset1a);
        lset2a = findViewById(R.id.lset2a);
        lset3a = findViewById(R.id.lset3a);
        lset4a = findViewById(R.id.lset4a);
        lset1b = findViewById(R.id.lset1b);
        lset2b = findViewById(R.id.lset2b);
        lset3b = findViewById(R.id.lset3b);
        lset4b = findViewById(R.id.lset4b);


        lset1a.setVisibility(View.GONE);
        lset2a.setVisibility(View.GONE);
        lset3a.setVisibility(View.GONE);
        lset4a.setVisibility(View.GONE);

        lset1b.setAlpha(175);
        lset2b.setAlpha(175);
        lset3b.setAlpha(175);
        lset4b.setAlpha(175);

        mr1.release();
        mr2.release();
        mr3.release();
        mr4.release();



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
            Intent b = new Intent(this, andromeda.class);
            startActivity(b);

        }
        return true;

    }


    //// APP EN SEGUNDO PLANO PAUSA LOS AUDIOS

    @Override protected void onStop() {
        super.onStop();

        lset1a.setVisibility(View.INVISIBLE);
        lset2a.setVisibility(View.INVISIBLE);
        lset3a.setVisibility(View.INVISIBLE);
        lset4a.setVisibility(View.INVISIBLE);

        lset1b.setVisibility(View.VISIBLE);
        lset2b.setVisibility(View.VISIBLE);
        lset3b.setVisibility(View.VISIBLE);
        lset4b.setVisibility(View.VISIBLE);

        mr1 = MediaPlayer.create(this, R.raw.mr1);
        mr2 = MediaPlayer.create(this, R.raw.mr2);
        mr3 = MediaPlayer.create(this, R.raw.mr3);
        mr4 = MediaPlayer.create(this, R.raw.mr4);


        if(mr1.isPlaying()){
            mr1.pause();
        }
        if(mr2.isPlaying()){
            mr2.pause();
        }
        if(mr3.isPlaying()){
            mr3.pause();
        }
        if(mr4.isPlaying()){
            mr4.pause();
        }
        mr1.release();
        mr2.release();
        mr3.release();
        mr4.release();
    }

    @Override protected void onResume(){
        super.onResume();


        mr1 = MediaPlayer.create(this, R.raw.mr1);
        mr2 = MediaPlayer.create(this, R.raw.mr2);
        mr3 = MediaPlayer.create(this, R.raw.mr3);
        mr4 = MediaPlayer.create(this, R.raw.mr4);

        mr1.start();
        mr2.start();
        mr3.start();
        mr4.start();

        if(mr1.isPlaying()){
            mr1.pause();
        }
        if(mr2.isPlaying()){
            mr2.pause();
        }
        if(mr3.isPlaying()){
            mr3.pause();
        }
        if(mr4.isPlaying()){
            mr4.pause();
        }



    }@Override public void onPause(){
        super.onPause();


        if(mr1.isPlaying()){
            mr1.pause();
        }
        if(mr2.isPlaying()){
            mr2.pause();
        }
        if(mr3.isPlaying()){
            mr3.pause();
        }
        if(mr4.isPlaying()){
            mr4.pause();
        }

        mr1.release();
        mr2.release();
        mr3.release();
        mr4.release();

        lset1a.setVisibility(View.INVISIBLE);
        lset2a.setVisibility(View.INVISIBLE);
        lset3a.setVisibility(View.INVISIBLE);
        lset4a.setVisibility(View.INVISIBLE);

        lset1b.setVisibility(View.VISIBLE);
        lset2b.setVisibility(View.VISIBLE);
        lset3b.setVisibility(View.VISIBLE);
        lset4b.setVisibility(View.VISIBLE);

    }

    public void napocalipsis(View view){

        Intent napocalipsis = new Intent(this, overdrive.class);
        startActivity(napocalipsis);

    }public void nnautilus(View view){

        Intent nnautilus = new Intent(this, Nautilus.class);
        startActivity(nnautilus);

    }public void nandromeda(View view){

        Intent nandromeda = new Intent(this, andromeda.class);
        startActivity(nandromeda);

    }public void npedalboard(View view){

        Intent npedalboard = new Intent(this, box.class);
        startActivity(npedalboard);

     }public void fuzzilla(View view) {

        Intent f = new Intent(this, fuzzilla.class);
        startActivity(f);

    }public void s(View view) {

        Intent s = new Intent(this, saturno.class);
        startActivity(s);

    }public void l(View view) {

        Intent l = new Intent(this, lighthouse.class);
        startActivity(l);

    }
///// SETEOS DEL PEDAL



    public void set1b (View view){


        lset1a.setVisibility(View.VISIBLE);
        lset1b.setVisibility(View.INVISIBLE);

        mr1.seekTo(0);
        mr1.start();

        if(mr2.isPlaying()){
            mr2.pause();
        }
        if(mr3.isPlaying()){
            mr3.pause();
        }
        if(mr4.isPlaying()){
            mr4.pause();
        }


        lset2a.setVisibility(View.INVISIBLE);
        lset3a.setVisibility(View.INVISIBLE);
        lset4a.setVisibility(View.INVISIBLE);

        lset2b.setVisibility(View.VISIBLE);
        lset3b.setVisibility(View.VISIBLE);
        lset4b.setVisibility(View.VISIBLE);

    }public void set1a (View view){
        toogle.play(sonido, 1, 1, 1, 0, 0);

        lset1b.setVisibility(View.VISIBLE);
        lset1a.setVisibility(View.INVISIBLE);
        mr1.pause();


    }
    public void set2b (View view){
        toogle.play(sonido, 1, 1, 1, 0, 0);

        lset2a.setVisibility(View.VISIBLE);
        lset2b.setVisibility(View.INVISIBLE);

        mr2.seekTo(0);
        mr2.start();

        if(mr1.isPlaying()){
            mr1.pause();
        }
        if(mr3.isPlaying()){
            mr3.pause();
        }
        if(mr4.isPlaying()){
            mr4.pause();
        }

        lset1a.setVisibility(View.INVISIBLE);
        lset3a.setVisibility(View.INVISIBLE);
        lset4a.setVisibility(View.INVISIBLE);

        lset1b.setVisibility(View.VISIBLE);
        lset3b.setVisibility(View.VISIBLE);
        lset4b.setVisibility(View.VISIBLE);


    }public void set2a (View view){
        toogle.play(sonido, 1, 1, 1, 0, 0);

        lset2b.setVisibility(View.VISIBLE);
        lset2a.setVisibility(View.INVISIBLE);
        mr2.pause();

    }public void set3b (View view){
        toogle.play(sonido, 1, 1, 1, 0, 0);

        lset3a.setVisibility(View.VISIBLE);
        lset3b.setVisibility(View.INVISIBLE);


        mr3.seekTo(0);
        mr3.start();

        if(mr1.isPlaying()){
            mr1.pause();
        }
        if(mr2.isPlaying()){
            mr2.pause();
        }
        if(mr4.isPlaying()){
            mr4.pause();
        }

        lset1a.setVisibility(View.INVISIBLE);
        lset2a.setVisibility(View.INVISIBLE);
        lset4a.setVisibility(View.INVISIBLE);

        lset1b.setVisibility(View.VISIBLE);
        lset2b.setVisibility(View.VISIBLE);
        lset4b.setVisibility(View.VISIBLE);


    }public void set3a (View view){
        toogle.play(sonido, 1, 1, 1, 0, 0);

        lset3b.setVisibility(View.VISIBLE);
        lset3a.setVisibility(View.INVISIBLE);
        mr3.pause();


    }public void set4b (View view){
        toogle.play(sonido, 1, 1, 1, 0, 0);

        lset4a.setVisibility(View.VISIBLE);
        lset4b.setVisibility(View.INVISIBLE);


        mr4.seekTo(0);
        mr4.start();

        if(mr1.isPlaying()){
            mr1.pause();
        }
        if(mr2.isPlaying()){
            mr2.pause();
        }
        if(mr3.isPlaying()){
            mr3.pause();
        }

        lset1a.setVisibility(View.INVISIBLE);
        lset2a.setVisibility(View.INVISIBLE);
        lset3a.setVisibility(View.INVISIBLE);

        lset1b.setVisibility(View.VISIBLE);
        lset2b.setVisibility(View.VISIBLE);
        lset3b.setVisibility(View.VISIBLE);


    }public void set4a (View view){
        toogle.play(sonido, 1, 1, 1, 0, 0);

        lset4b.setVisibility(View.VISIBLE);
        lset4a.setVisibility(View.INVISIBLE);
        mr4.pause();

    }


}
