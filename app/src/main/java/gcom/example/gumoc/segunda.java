package gcom.example.gumoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.gumoc.R;


public class segunda extends AppCompatActivity {

    MediaPlayer intro;
    ImageButton pausa, play,bp, prueba;
    ImageView gumob,bfb,big,byt,bs,bn,ba,bl,ban,bf;
    Window ventana;
    int playpause = 0, redes = 0, maxvol = 50, fade = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        this.ventana = getWindow();
        ventana.setStatusBarColor(111_111_111);

        gumob = findViewById(R.id.gumob);
        big = findViewById(R.id.big);
        bp = findViewById(R.id.bp);
        bl = findViewById(R.id.bl);
        bn = findViewById(R.id.bn);
        ban = findViewById(R.id.ban);
        ba = findViewById(R.id.ba);
        bf = findViewById(R.id.bf);
        pausa = findViewById(R.id.pausa);
        intro = MediaPlayer.create(this, R.raw.intro);
        play = findViewById(R.id.play);
        bfb = findViewById(R.id.bfb);
        byt = findViewById(R.id.byt);
        bs = findViewById(R.id.bs);

        intro.start();
        intro.setLooping(true);
        pausa.setVisibility(View.GONE);
        intro.pause();

        Animation fadeout = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadeout);
        Animation fadein = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadein);

        if(fade == 0) {
            ba.startAnimation(fadein);
            ban.startAnimation(fadein);
            bn.startAnimation(fadein);
            bl.startAnimation(fadein);
            bp.startAnimation(fadein);
            bf.startAnimation(fadein);
            bs.startAnimation(fadein);
            gumob.startAnimation(fadein);
            gumob.startAnimation(fadeout);

            fade++;
        }
        }

    @Override protected void onStop() {
        super.onStop();
        intro.pause();


    }

    /// ESTADO CUANDO SE VUELVE AL MENU DESDE OTRA ACTIVITY

    @Override protected void onResume(){
        super.onResume();
        intro.start();


        gumob.setVisibility(View.INVISIBLE);

        if(playpause%2 == 0){
            intro.pause();
        }

        intro.pause();
    }
    public void pausar(View view) {
        intro.pause();
        pausa.setVisibility(View.GONE);
        play.setVisibility(View.VISIBLE);
        playpause++;
    }

    public void play(View view) {
        intro.start();
        pausa.setVisibility(View.VISIBLE);
        play.setVisibility(View.GONE);
        playpause++;
    }

    public void pedalboard(View view) {

        intro.pause();
        Intent i = new Intent(this, box.class);
        startActivity(i);

    }

    public void nautilus(View view) {

        intro.pause();
        Intent n = new Intent(this, Nautilus.class);
        startActivity(n);
    }
    public void apocalipsis(View view) {

        intro.pause();
        Intent a = new Intent(this, overdrive.class);
        startActivity(a);

    }public void lighthouse(View view) {

        intro.pause();
        Intent l = new Intent(this, lighthouse.class);
        startActivity(l);

    }public void andromeda(View view) {

        intro.pause();
        Intent an = new Intent(this, andromeda.class);
        startActivity(an);

    }public void fuzzilla(View view) {

        intro.pause();
        Intent f = new Intent(this, fuzzilla.class);
        startActivity(f);

    } public void saturno(View view){

            intro.pause();
            Intent s = new Intent(this, saturno.class);
            startActivity(s);


            ///////METODOS PARA INGRESAR A LAS REDES SOCIALES

    }public void instagram(View view){
        intro.pause();
        Intent instagram = new Intent(this, instagram.class);
        startActivity(instagram);

    }public void facebook(View view){
        intro.pause();
        Intent facebook = new Intent(this, facebook.class);
        startActivity(facebook);

    }public void youtube(View view) {
        intro.pause();
        Intent youtube = new Intent(this, youtube.class);
        startActivity(youtube);

    }public void box(View view) {
        intro.pause();
        Intent box = new Intent(this, box.class);
        startActivity(box);
    }
}