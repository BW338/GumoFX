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


public class apocalipsis extends AppCompatActivity {

    ImageView aset1a, aset2a, aset3a, aset4a, aset1b, aset2b, aset3b, aset4b, a, l, an, pb;
    MediaPlayer ma1, ma2, ma3, ma4;
    SoundPool toogle;
    int sonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apocalipsis);

        setTitle("\uD83C\uDFA7 Seteos \uD83C\uDFA7");

        toogle = new SoundPool(1, AudioManager.STREAM_MUSIC, 1);
        sonido = toogle.load(this, R.raw.toogle, 1);


        a = findViewById(R.id.a);
        l = findViewById(R.id.l);
        an = findViewById(R.id.an);
        pb = findViewById(R.id.pb);

        ma1 = MediaPlayer.create(this, R.raw.ma1);
        ma2 = MediaPlayer.create(this, R.raw.ma2);
        ma3 = MediaPlayer.create(this, R.raw.ma3);
        ma4 = MediaPlayer.create(this, R.raw.ma4);


        aset1a = findViewById(R.id.aset1a);
        aset2a = findViewById(R.id.aset2a);
        aset3a = findViewById(R.id.aset3a);
        aset4a = findViewById(R.id.aset4a);

        aset1b = findViewById(R.id.aset1b);
        aset2b = findViewById(R.id.aset2b);
        aset3b = findViewById(R.id.aset3b);
        aset4b = findViewById(R.id.aset4b);


        aset1a.setVisibility(View.GONE);
        aset2a.setVisibility(View.GONE);
        aset3a.setVisibility(View.GONE);
        aset4a.setVisibility(View.GONE);

        aset1b.setAlpha(175);
        aset2b.setAlpha(175);
        aset3b.setAlpha(175);
        aset4b.setAlpha(175);

ma1.start();
ma2.start();
ma3.start();
ma4.start();

ma1.pause();
ma2.pause();
ma3.pause();
ma4.pause();

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
            Intent b = new Intent(this, overdrive.class);
            startActivity(b);

        }
        return true;

    }

    //// APP EN SEGUNDO PLANO PAUSA LOS AUDIOS

    @Override
    protected void onStop() {
        super.onStop();

        ma1 = MediaPlayer.create(this, R.raw.ma1);
        ma2 = MediaPlayer.create(this, R.raw.ma2);
        ma3 = MediaPlayer.create(this, R.raw.ma3);
        ma4 = MediaPlayer.create(this, R.raw.ma4);

        aset1a.setVisibility(View.INVISIBLE);
        aset2a.setVisibility(View.INVISIBLE);
        aset3a.setVisibility(View.INVISIBLE);
        aset4a.setVisibility(View.INVISIBLE);

        aset1b.setVisibility(View.VISIBLE);
        aset2b.setVisibility(View.VISIBLE);
        aset3b.setVisibility(View.VISIBLE);
        aset4b.setVisibility(View.VISIBLE);

        ma1.release();
        ma2.release();
        ma3.release();
        ma4.release();



    }

    @Override
    protected void onResume() {
        super.onResume();


        ma1 = MediaPlayer.create(this, R.raw.ma1);
        ma2 = MediaPlayer.create(this, R.raw.ma2);
        ma3 = MediaPlayer.create(this, R.raw.ma3);
        ma4 = MediaPlayer.create(this, R.raw.ma4);

        aset1a.setVisibility(View.INVISIBLE);
        aset2a.setVisibility(View.INVISIBLE);
        aset3a.setVisibility(View.INVISIBLE);
        aset4a.setVisibility(View.INVISIBLE);

        aset1b.setVisibility(View.VISIBLE);
        aset2b.setVisibility(View.VISIBLE);
        aset3b.setVisibility(View.VISIBLE);
        aset4b.setVisibility(View.VISIBLE);

        ma1.start();
        ma2.start();
        ma3.start();
        ma4.start();

        if (ma1.isPlaying()) {
            ma1.pause();
        }

        if (ma2.isPlaying()) {
            ma2.pause();
        }
        if (ma3.isPlaying()) {
            ma3.pause();
        }
        if (ma4.isPlaying()) {
            ma4.pause();
        }

} @Override public void onPause() {
        super.onPause();


        if (ma1.isPlaying()) {
            ma1.pause();
        }

        if (ma2.isPlaying()) {
            ma2.pause();
        }
        if (ma3.isPlaying()) {
            ma3.pause();
        }
        if (ma4.isPlaying()) {
            ma4.pause();
        }


        aset1a.setVisibility(View.INVISIBLE);
        aset2a.setVisibility(View.INVISIBLE);
        aset3a.setVisibility(View.INVISIBLE);
        aset4a.setVisibility(View.INVISIBLE);

        aset1b.setVisibility(View.VISIBLE);
        aset2b.setVisibility(View.VISIBLE);
        aset3b.setVisibility(View.VISIBLE);
        aset4b.setVisibility(View.VISIBLE);

        ma1.release();
        ma2.release();
        ma3.release();
        ma4.release();

    }


        ///// MENU INFERIOR //////////
public void anautilus(View view){

    Intent anautilus = new Intent(this, Nautilus.class);
    startActivity(anautilus);

}public void alighthouse(View view){

    Intent alighthouse = new Intent(this, lighthouse.class);
    startActivity(alighthouse);

}public void aandromeda(View view){

    Intent aandromeda = new Intent(this, andromeda.class);
    startActivity(aandromeda);

}public void apedalboard(View view){

    Intent apedalboard = new Intent(this, box.class);
    startActivity(apedalboard);

 }public void fuzzilla(View view) {

        Intent f = new Intent(this, fuzzilla.class);
        startActivity(f);

    }public void s(View view) {

        Intent s = new Intent(this, saturno.class);
        startActivity(s);

    }
///// SETEOS DEL PEDAL




    public void set1b (View view) {
        toogle.play(sonido, 1, 1, 1, 0, 0);

        aset1a.setVisibility(View.VISIBLE);
        aset1b.setVisibility(View.INVISIBLE);


        ma1.seekTo(0);
        ma1.start();

        if(ma2.isPlaying()){
            ma2.pause();
        }

        if(ma3.isPlaying()) {
            ma3.pause();

        } if (ma4.isPlaying()) {
                ma4.pause();
            }
            aset2a.setVisibility(View.INVISIBLE);
            aset3a.setVisibility(View.INVISIBLE);
            aset4a.setVisibility(View.INVISIBLE);

            aset2b.setVisibility(View.VISIBLE);
            aset3b.setVisibility(View.VISIBLE);
            aset4b.setVisibility(View.VISIBLE);


    }public void set1a (View view) {
        toogle.play(sonido, 1, 1, 1, 0, 0);


        aset1b.setVisibility(View.VISIBLE);
        aset1a.setVisibility(View.INVISIBLE);
        if(ma1.isPlaying()) {
            ma1.pause();
        }

    }
    public void set2b (View view){
        toogle.play(sonido, 1, 1, 1, 0, 0);

        aset2a.setVisibility(View.VISIBLE);
        aset2b.setVisibility(View.INVISIBLE);



        ma2.seekTo(0);

        if(!ma2.isPlaying()){
            ma2.start();
        }

        if(ma1.isPlaying()) {
            ma1.pause();
        }
        if(ma3.isPlaying()) {
            ma3.pause();
        }
        if(ma4.isPlaying()) {
            ma4.pause();
        }


        aset1a.setVisibility(View.INVISIBLE);
        aset3a.setVisibility(View.INVISIBLE);
        aset4a.setVisibility(View.INVISIBLE);

        aset1b.setVisibility(View.VISIBLE);
        aset3b.setVisibility(View.VISIBLE);
        aset4b.setVisibility(View.VISIBLE);


    }public void set2a (View view){
        toogle.play(sonido, 1, 1, 1, 0, 0);


        aset2b.setVisibility(View.VISIBLE);
        aset2a.setVisibility(View.INVISIBLE);
        if(ma2.isPlaying()) {
            ma2.pause();
        }
    }public void set3b (View view){
        toogle.play(sonido, 1, 1, 1, 0, 0);

        aset3a.setVisibility(View.VISIBLE);
        aset3b.setVisibility(View.INVISIBLE);


        ma3.seekTo(0);

        if(!ma3.isPlaying()){
            ma3.start();}

        if(ma1.isPlaying()) {
            ma1.pause();
        }
        if(ma2.isPlaying()) {
            ma2.pause();
        }
        if(ma4.isPlaying()) {
            ma4.pause();
        }
        aset1a.setVisibility(View.INVISIBLE);
        aset2a.setVisibility(View.INVISIBLE);
        aset4a.setVisibility(View.INVISIBLE);

        aset1b.setVisibility(View.VISIBLE);
        aset2b.setVisibility(View.VISIBLE);
        aset4b.setVisibility(View.VISIBLE);


    }public void set3a (View view){
        toogle.play(sonido, 1, 1, 1, 0, 0);

        aset3b.setVisibility(View.VISIBLE);
        aset3a.setVisibility(View.INVISIBLE);

        if(ma3.isPlaying()) {
            ma3.pause();
        }

    }public void set4b (View view){
        toogle.play(sonido, 1, 1, 1, 0, 0);

        aset4a.setVisibility(View.VISIBLE);
        aset4b.setVisibility(View.INVISIBLE);


        ma4.seekTo(0);

        if(!ma4.isPlaying()){
            ma4.start();
        }

        if(ma1.isPlaying()) {
            ma1.pause();
        }
        if(ma2.isPlaying()) {
            ma2.pause();
        }
        if(ma3.isPlaying()) {
            ma3.pause();
        }

        aset1a.setVisibility(View.INVISIBLE);
        aset2a.setVisibility(View.INVISIBLE);
        aset3a.setVisibility(View.INVISIBLE);

        aset1b.setVisibility(View.VISIBLE);
        aset2b.setVisibility(View.VISIBLE);
        aset3b.setVisibility(View.VISIBLE);


    }public void set4a (View view){
        toogle.play(sonido, 1, 1, 1, 0, 0);

        aset4b.setVisibility(View.VISIBLE);
        aset4a.setVisibility(View.INVISIBLE);
        if(ma4.isPlaying()) {
            ma4.pause();
        }


    }


}