package gcom.example.gumoc;
import static com.example.gumoc.R.*;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import com.example.gumoc.R;


public class box extends AppCompatActivity {

    ImageView ap, an, li, fu, na, apa, ana, lia, fua, naa, playb, pausa, stop, nfuyna, ffuyna;
    Switch bypass;
    Integer visap = 0, visan = 0, visli = 0, visfu = 0, visna = 0, pna = 0, pp = 0, pap = 0, pfu = 0, pan = 0, pli = 0, bp = 0;
    MediaPlayer apyan, apyli, apyfu, apyna, fuyli, fuyna, fuyan, nayli, nayan, liyan, cnaylib, cnayanb, canylib, capylib, capynab, capyanb, cfuyli, cfuyna, cfuyan, capyfu;
    SoundPool plugin, box;
    int sound, sonido;
    boolean loaded = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_box);
        initializeSoundPool();
        playFile();
        setTitle("\uD83C\uDFA7 Pedalboard \uD83C\uDFA7");

        ap = findViewById(id.ap);
        an = findViewById(id.an);
        li = findViewById(id.li);
        fu = findViewById(id.fu);
        na = findViewById(id.na);

        apa = findViewById(id.apa);
        ana = findViewById(id.ana);
        lia = findViewById(id.lia);
        fua = findViewById(id.fua);
        naa = findViewById(id.naa);

        apa.setVisibility(View.GONE);
        apa.setAlpha(100);
        ana.setVisibility(View.GONE);
        ana.setAlpha(100);
        lia.setVisibility(View.GONE);
        lia.setAlpha(100);
        fua.setVisibility(View.GONE);
        fua.setAlpha(100);
        naa.setVisibility(View.GONE);
        naa.setAlpha(100);


        playb = findViewById(id.playb);
        pausa = findViewById(id.pausab);
        stop = findViewById(id.stop);
        bypass = findViewById(id.bypas);

        apyan = MediaPlayer.create(this, raw.apyan);
        apyna = MediaPlayer.create(this, raw.apyna);
        apyli = MediaPlayer.create(this, raw.apyli);
        apyfu = MediaPlayer.create(this, raw.apyfu);
        fuyli = MediaPlayer.create(this, raw.fuyli);
        fuyna = MediaPlayer.create(this, raw.fuyna);
        fuyan = MediaPlayer.create(this, raw.fuyan);
        nayli = MediaPlayer.create(this, raw.nayli);
        nayan = MediaPlayer.create(this, raw.nayanb);
        liyan = MediaPlayer.create(this, raw.anyli);
        cnaylib = MediaPlayer.create(this, raw.cnayli);
        cnayanb = MediaPlayer.create(this, raw.cnayanb);
        canylib = MediaPlayer.create(this, raw.canyli);
        capylib = MediaPlayer.create(this, raw.capyli);
        capynab = MediaPlayer.create(this, raw.capyna);
        capyanb = MediaPlayer.create(this, raw.capyan);
        capyfu = MediaPlayer.create(this, raw.capyfu);
        cfuyna = MediaPlayer.create(this, raw.cfuyna);
        cfuyan = MediaPlayer.create(this, raw.cfuyan);
        cfuyli = MediaPlayer.create(this, raw.cfuylib);

        plugin = new SoundPool(1, AudioManager.STREAM_MUSIC, 1);
        sound = plugin.load(this, raw.plugin, 1);

        bypass.setTextColor(getResources().getColor(R.color.gris));

        //////////////SONIDO PORTADA -------------- chequear los dos metodos mas abajo 414 al 433--
        box.play(sonido, 1, 1, 1, 0, 0);
        initializeSoundPool();
        playFile();
        //////////////////////////////////////////////////

        Toast.makeText(this, "Selecciona dos pedales para testear", Toast.LENGTH_LONG).show();

        playb.setAlpha(130);
        stop.setAlpha(130);
        stop.setEnabled(false);
        pausa.setAlpha(130);
        pausa.setEnabled(false);

        if (pausa.getAlpha() != 255) {
            pausa.setEnabled(false);

        }
        if (playb.getAlpha() != 255 & stop.getAlpha() != 255) {
            pausa.setEnabled(false);
        }

        //////------ Listener del BYPASS ---//////
        bypass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                plugin.play(sound, 1, 1, 1, 0, 0);
                bypass.setTextColor(getResources().getColor(R.color.on));

                if (bp % 2 == 0) {

                    bypass.setTextColor(getResources().getColor(R.color.on));

                    if (lia.isShown() || apa.isShown()) {
                        lia.setAlpha(130);
                        apa.setAlpha(130);
                        apyli.setVolume(0, 0);
                        capylib.setVolume(1, 1);

                    }
                    if (naa.isShown() || apa.isShown()) {
                        naa.setAlpha(130);
                        apa.setAlpha(130);
                        apyna.setVolume(0, 0);
                        capynab.setVolume(1, 1);

                    }
                    if (lia.isShown() || naa.isShown()) {
                        naa.setAlpha(130);
                        lia.setAlpha(130);
                        nayli.setVolume(0, 0);
                        cnaylib.setVolume(1, 1);

                    }
                    if (lia.isShown() || ana.isShown()) {
                        ana.setAlpha(130);
                        lia.setAlpha(130);
                        liyan.setVolume(0, 0);
                        canylib.setVolume(1, 1);

                    }
                    if (naa.isShown() || ana.isShown()) {
                        naa.setAlpha(130);
                        ana.setAlpha(130);
                        nayan.setVolume(0, 0);
                        cnayanb.setVolume(1, 1);

                    }
                    if (apa.isShown() || ana.isShown()) {
                        apa.setAlpha(130);
                        ana.setAlpha(130);
                        apyan.setVolume(0, 0);
                        capyanb.setVolume(1, 1);

                    }
                    if (fua.isShown() || ana.isShown()) {
                        fua.setAlpha(130);
                        ana.setAlpha(130);
                        fuyan.setVolume(0, 0);
                        cfuyan.setVolume(1, 1);

                    }
                    if (apa.isShown() || fua.isShown()) {
                        apa.setAlpha(130);
                        fua.setAlpha(130);
                        apyfu.setVolume(0, 0);
                        capyfu.setVolume(1, 1);

                    }
                    if (lia.isShown() || fua.isShown()) {
                        lia.setAlpha(130);
                        fua.setAlpha(130);
                        fuyli.setVolume(0, 0);
                        cfuyli.setVolume(1, 1);

                    }
                    if (fua.isShown() || naa.isShown()) {
                        fua.setAlpha(130);
                        naa.setAlpha(130);
                        fuyna.setVolume(0, 0);
                        cfuyna.setVolume(1, 1);

                    }


                }
                if (bp % 2 != 0) {

                    bypass.setTextColor(getResources().getColor(R.color.gris));

                    if (lia.isShown() || apa.isShown()) {
                        lia.setAlpha(255);
                        apa.setAlpha(255);
                        apyli.setVolume(1, 1);
                        capylib.setVolume(0, 0);

                    }
                    if (naa.isShown() || apa.isShown()) {
                        naa.setAlpha(255);
                        apa.setAlpha(255);
                        apyna.setVolume(1, 1);
                        capynab.setVolume(0, 0);

                    }
                    if (lia.isShown() || naa.isShown()) {
                        naa.setAlpha(255);
                        lia.setAlpha(255);
                        nayli.setVolume(1, 1);
                        cnaylib.setVolume(0, 0);

                    }
                    if (lia.isShown() || ana.isShown()) {
                        ana.setAlpha(255);
                        lia.setAlpha(255);
                        liyan.setVolume(1, 1);
                        canylib.setVolume(0, 0);

                    }
                    if (naa.isShown() || ana.isShown()) {
                        naa.setAlpha(255);
                        ana.setAlpha(255);
                        nayan.setVolume(1, 1);
                        cnayanb.setVolume(0, 0);

                    }
                    if (apa.isShown() || ana.isShown()) {
                        apa.setAlpha(255);
                        ana.setAlpha(255);
                        apyan.setVolume(1, 1);
                        capyanb.setVolume(0, 0);

                    }
                    if (fua.isShown() || ana.isShown()) {
                        fua.setAlpha(130);
                        ana.setAlpha(130);
                        fuyan.setVolume(1, 1);
                        cfuyan.setVolume(0, 0);

                    }
                    if (apa.isShown() || fua.isShown()) {
                        apa.setAlpha(130);
                        fua.setAlpha(130);
                        apyfu.setVolume(1, 1);
                        capyfu.setVolume(0, 0);

                    }
                    if (lia.isShown() || fua.isShown()) {
                        lia.setAlpha(130);
                        fua.setAlpha(130);
                        fuyli.setVolume(1, 1);
                        cfuyli.setVolume(0, 0);

                    }
                    if (fua.isShown() || naa.isShown()) {
                        fua.setAlpha(130);
                        naa.setAlpha(130);
                        fuyna.setVolume(1, 1);
                        cfuyna.setVolume(0, 0);

                    }

                    lia.setAlpha(255);
                    apa.setAlpha(255);
                    fua.setAlpha(255);
                    ana.setAlpha(255);
                    naa.setAlpha(255);

                }
                bp++;
            }
        });


// PARACHE QUE SIMULA "ESTADO PAUSE" PARA QUE FUNDIONEN LOS AUDIOS

        if (nayli.isPlaying()) {
            nayli.pause();

        }
        if (nayan.isPlaying()) {
            nayan.pause();

        }
        if (fuyna.isPlaying()) {
            fuyna.pause();

        }
        if (liyan.isPlaying()) {
            liyan.pause();

        }
        if (apyfu.isPlaying()) {
            apyfu.pause();

        }
        if (fuyan.isPlaying()) {
            fuyan.pause();

        }
        if (fuyli.isPlaying()) {
            fuyli.pause();

        }
        if (apyli.isPlaying()) {
            apyli.pause();

        }
        if (apyna.isPlaying()) {
            apyna.pause();

        }
        if (apyan.isPlaying()) {
            apyan.pause();

        }
        if (cnaylib.isPlaying()) {
            cnaylib.pause();
            bypass.setChecked(false);

        }
        if (cnayanb.isPlaying()) {
            cnayanb.pause();
            bypass.setChecked(false);

        }
        if (canylib.isPlaying()) {
            canylib.pause();
            bypass.setChecked(false);

        }
        if (capylib.isPlaying()) {
            capylib.pause();
            bypass.setChecked(false);

        }
        if (capynab.isPlaying()) {
            capynab.pause();
            bypass.setChecked(false);

        }
        if (capyanb.isPlaying()) {
            capyanb.pause();
            bypass.setChecked(false);

        }
        if (cfuyan.isPlaying()) {
            cfuyan.pause();
            bypass.setChecked(false);

        }
        if (cfuyna.isPlaying()) {
            cfuyna.pause();
            bypass.setChecked(false);

        }
        if (cfuyli.isPlaying()) {
            cfuyli.pause();
            bypass.setChecked(false);

        }
        if (capyfu.isPlaying()) {
            capyfu.pause();
            bypass.setChecked(false);

        }


        capyanb.release();
        capynab.release();
        capylib.release();
        canylib.release();
        cnayanb.release();
        cnaylib.release();
        cfuyna.release();
        cfuyan.release();
        capyfu.release();
        cfuyli.release();

        apyan.release();
        apyfu.release();
        apyna.release();
        apyli.release();
        fuyli.release();
        fuyna.release();
        fuyan.release();
        nayli.release();
        nayan.release();
        liyan.release();



    }  ///////////////////////////////////////SOUNDPOOL audio intro



    private void initializeSoundPool() {
        box = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        box.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
                loaded = true;
            }
        });
        sonido = box.load(this, R.raw.box, 1);
    }

    private void playFile() {
        AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
        float actualVolume = (float) audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        float maxVolume = (float) audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        float volume = actualVolume / maxVolume;
        if (loaded) {
            box.play(sonido, volume, volume, 1, 0, 1f);
            Log.e("Test", "Played sound");
        }

///// F U N C I O N E S  DEL MENU BARRA SUPERIOR (TOOLBAR)
    }public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;

    } public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id == R.id.Apocalipsis){
            Intent ap = new Intent(this, overdrive.class);
            startActivity(ap);

        }if (id == R.id.Nautilus){
            Intent na = new Intent(this, Nautilus.class);
            startActivity(na);

        }if (id == R.id.Andromeda){
            Intent an = new Intent(this, andromeda.class);
            startActivity(an);

        }if (id == R.id.Lighthouse){
            Intent li = new Intent(this, lighthouse.class);
            startActivity(li);

        }if (id == R.id.Fuzzilla){
            Intent fu = new Intent(this, fuzzilla.class);
            startActivity(fu);


        }if (id == R.id.saturno){
        Intent s = new Intent(this, saturno.class);
        startActivity(s);

        }if (id == R.id.Home){
        Intent h = new Intent(this, segunda.class);
        startActivity(h);
        }
        return true;
    }

///////////////////////////////////////////////////////////////////////////




    ///////////////////   A P O C A L I P S Y S /////////////////////////////////////////
    public void apocalipsis(View v) {

        plugin.play(sound, 1, 1, 1, 0, 0);

        if(bypass.isChecked()){
            bp++;
        }

        if (lia.isShown() & ana.isShown() || fua.isShown() & ana.isShown() || fua.isShown() & lia.isShown()
            || naa.isShown() & lia.isShown() || naa.isShown() & fua.isShown() || naa.isShown() & ana.isShown()){

            if (ana.getVisibility() == View.VISIBLE) {
                pan = 0;

            }
            if (naa.getVisibility() == View.VISIBLE) {
                pna = 0;

            }
            if (lia.getVisibility() == View.VISIBLE) {
                pli = 0;

            }
            if (fua.getVisibility() == View.VISIBLE) {
                pfu = 0;
            }


            if (lia.isShown()) {
                visli++;
                lia.setVisibility(View.GONE);
                li.setAlpha(255);

            }
            if (fua.isShown()) {
                visfu++;
                fua.setVisibility(View.GONE);
                fu.setAlpha(255);

            }
            if (ana.isShown()) {
                visan++;
                ana.setVisibility(View.GONE);
                an.setAlpha(255);

            }
            if (naa.isShown()) {
                visna++;
                naa.setVisibility(View.GONE);
                na.setAlpha(255);

            }
            /////////////////// A U D I O //////////////////////////////
            if (nayli.isPlaying()) {
                nayli.pause();

            }if (nayan.isPlaying()) {
                nayan.pause();

            }if (fuyna.isPlaying()) {
                fuyna.pause();

            }if (liyan.isPlaying()) {
                liyan.pause();

            }if (apyfu.isPlaying()) {
                apyfu.pause();

            }if (fuyan.isPlaying()) {
                fuyan.pause();

            }if (fuyli.isPlaying()) {
                fuyli.pause();

            }if (apyli.isPlaying()) {
                apyli.pause();

            }if (apyna.isPlaying()) {
                apyna.pause();

            }if (apyan.isPlaying()) {
                apyan.pause();

            }if (cnaylib.isPlaying()) {
                cnaylib.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));


            }if (cnayanb.isPlaying()) {
                cnayanb.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if(canylib.isPlaying()) {
                canylib.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if(capylib.isPlaying()) {
                capylib.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (capynab.isPlaying()) {
                capynab.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (capyanb.isPlaying()) {
                capyanb.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (cfuyli.isPlaying()) {
                cfuyli.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (cfuyan.isPlaying()) {
                cfuyan.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (cfuyna.isPlaying()) {
                cfuyna.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (capyfu.isPlaying()) {
                capyfu.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }
            //////▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄A U D I O ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄////////

        }

        if (pap % 2 == 0) {
            apa.setVisibility(View.VISIBLE);
            apa.setAlpha(100);
            ap.setAlpha(180);


                   if (lia.isShown() & ana.isShown() || fua.isShown() & ana.isShown() || fua.isShown() & lia.isShown()
                    || naa.isShown() & lia.isShown() || naa.isShown() & fua.isShown() || naa.isShown() & ana.isShown()
                    || lia.isShown() & apa.isShown() || fua.isShown() & apa.isShown() || naa.isShown() & apa.isShown()
                    || ana.isShown() & apa.isShown()) {

                playb.setAlpha(255);
                playb.setEnabled(true);


            } else {
                playb.setAlpha(130);

                if (ana.getVisibility() == View.VISIBLE) {
                    pan = 1;
                    ana.setAlpha(100);

                }
                if (naa.getVisibility() == View.VISIBLE) {
                    naa.setAlpha(100);

                }
                if (lia.getVisibility() == View.VISIBLE) {
                    lia.setAlpha(100);

                }
                if (fua.getVisibility() == View.VISIBLE) {
                    fua.setAlpha(100);

                }if (apa.getVisibility() == View.VISIBLE) {
                    apa.setAlpha(100);
                }
            }

        } else {
            ap.setAlpha(255);
            apa.setVisibility(View.GONE);

            if (ana.getVisibility() == View.VISIBLE) {
                pan = 1;
                ana.setAlpha(100);

            }
            if (naa.getVisibility() == View.VISIBLE) {
                naa.setAlpha(100);

            }
            if (lia.getVisibility() == View.VISIBLE) {
                lia.setAlpha(100);

            }
            if (fua.getVisibility() == View.VISIBLE) {
                fua.setAlpha(100);
            }

                   if (lia.isShown() & ana.isShown() || fua.isShown() & ana.isShown() || fua.isShown() & lia.isShown()
                    || naa.isShown() & lia.isShown() || naa.isShown() & fua.isShown() || naa.isShown() & ana.isShown()
                    || lia.isShown() & apa.isShown() || fua.isShown() & apa.isShown() || naa.isShown() & apa.isShown()
                    || ana.isShown() & apa.isShown()) {

                playb.setAlpha(255);
                       playb.setEnabled(true);


                   } else {
                playb.setAlpha(130);
            }

        }

        ////// A U D I O //////////
        pap++;
        if (nayli.isPlaying()) {
            nayli.pause();

        }
        if (nayan.isPlaying()) {
            nayan.pause();

        }
        if (fuyna.isPlaying()) {
            fuyna.pause();

        }
        if (liyan.isPlaying()) {
            liyan.pause();

        }
        if (apyfu.isPlaying()) {
            apyfu.pause();

        }
        if (fuyan.isPlaying()) {
            fuyan.pause();

        }
        if (fuyli.isPlaying()) {
            fuyli.pause();

        }
        if (apyli.isPlaying()) {
            apyli.pause();

        }
        if (apyna.isPlaying()) {
            apyna.pause();

        }
        if (apyan.isPlaying()) {
            apyan.pause();

        }if (cnaylib.isPlaying()) {
            cnaylib.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if (cnayanb.isPlaying()) {
            cnayanb.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if(canylib.isPlaying()) {
            canylib.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if(capylib.isPlaying()) {
            capylib.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if (capynab.isPlaying()) {
            capynab.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if (capyanb.isPlaying()) {
            capyanb.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if (cfuyli.isPlaying()) {
            cfuyli.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if (cfuyan.isPlaying()) {
            cfuyan.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if (cfuyna.isPlaying()) {
            cfuyna.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if (capyfu.isPlaying()) {
            capyfu.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }

    //////▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄////////
    if(apa.isShown() || ana.isShown() || lia.isShown()
            || naa.isShown() || fua.isShown()){
        stop.setAlpha(255);
        stop.setEnabled(true);
    }else {
        stop.setAlpha(130);
        stop.setEnabled(false);

    } if(playb.getAlpha() != 255 & stop.getAlpha() != 255) {
            pausa.setEnabled(false);

        }else {
            pausa.setEnabled(true);
        }
    }
    ///////////////////   A N D R O M E D A /////////////////////////////////////////


    public void andromeda(View v) {

        plugin.play(sound, 1, 1, 1, 0, 0);


        if (bypass.isChecked()) {
            bp++;
        }

                      if (lia.isShown() & apa.isShown() || fua.isShown() & apa.isShown() || fua.isShown() & lia.isShown()
                       || naa.isShown() & lia.isShown() || naa.isShown() & apa.isShown() || fua.isShown() & naa.isShown()) {


            if (lia.getVisibility() == View.VISIBLE) {
                pli = 0;

            }
            if (naa.getVisibility() == View.VISIBLE) {
                pna = 0;

            }
            if (apa.getVisibility() == View.VISIBLE) {
                pap = 0;

            }
            if (fua.getVisibility() == View.VISIBLE) {
                pfu = 0;
            }

            if (lia.isShown()) {
                visli++;
                lia.setVisibility(View.GONE);
                li.setAlpha(255);

            }
            if (fua.isShown()) {
                visfu++;
                fua.setVisibility(View.GONE);
                fu.setAlpha(255);

            }
            if (apa.isShown()) {
                visap++;
                apa.setVisibility(View.GONE);
                ap.setAlpha(255);

            }
            if (naa.isShown()) {
                visna++;
                naa.setVisibility(View.GONE);
                na.setAlpha(255);

            }/////////////////// A U D I O //////////////////////////////
            if (nayli.isPlaying()) {
                nayli.pause();

            }
            if (nayan.isPlaying()) {
                nayan.pause();

            }
            if (fuyna.isPlaying()) {
                fuyna.pause();

            }
            if (liyan.isPlaying()) {
                liyan.pause();

            }
            if (apyfu.isPlaying()) {
                apyfu.pause();

            }
            if (fuyan.isPlaying()) {
                fuyan.pause();

            }
            if (fuyli.isPlaying()) {
                fuyli.pause();

            }
            if (apyli.isPlaying()) {
                apyli.pause();

            }
            if (apyna.isPlaying()) {
                apyna.pause();

            }
            if (apyan.isPlaying()) {
                apyan.pause();

            }
            if (cnaylib.isPlaying()) {
                cnaylib.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }
            if (cnayanb.isPlaying()) {
                cnayanb.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }
            if (canylib.isPlaying()) {
                canylib.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }
            if (capylib.isPlaying()) {
                capylib.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }
            if (capynab.isPlaying()) {
                capynab.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }
            if (capyanb.isPlaying()) {
                capyanb.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }
            if (cfuyli.isPlaying()) {
                cfuyli.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }
            if (cfuyan.isPlaying()) {
                cfuyan.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }
            if (cfuyna.isPlaying()) {
                cfuyna.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }
            if (capyfu.isPlaying()) {
                capyfu.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }
            //////▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄A U D I O ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄////////

        }

        if (pan % 2 == 0) {
            ana.setVisibility(View.VISIBLE);
            ana.setAlpha(130);
            an.setAlpha(130);
            pan++;

                   if (lia.isShown() & ana.isShown() || fua.isShown() & ana.isShown() || fua.isShown() & lia.isShown()
                    || naa.isShown() & lia.isShown() || naa.isShown() & fua.isShown() || naa.isShown() & ana.isShown()
                    || lia.isShown() & apa.isShown() || fua.isShown() & apa.isShown() || naa.isShown() & apa.isShown()
                    || ana.isShown() & apa.isShown()) {

                playb.setAlpha(255);
                playb.setEnabled(true);

                   } else {
                playb.setAlpha(130);

            }


        } else {
            an.setAlpha(255);
            ana.setVisibility(View.GONE);
            pan++;

            if (naa.getVisibility() == View.VISIBLE) {
                naa.setAlpha(100);

            }
            if (apa.getVisibility() == View.VISIBLE) {
                apa.setAlpha(100);

            }
            if (lia.getVisibility() == View.VISIBLE) {
                lia.setAlpha(100);

            }
            if (fua.getVisibility() == View.VISIBLE) {
                fua.setAlpha(100);

            }
                   if (lia.isShown() & ana.isShown() || fua.isShown() & ana.isShown() || fua.isShown() & lia.isShown()
                    || naa.isShown() & lia.isShown() || naa.isShown() & fua.isShown() || naa.isShown() & ana.isShown()
                    || lia.isShown() & apa.isShown() || fua.isShown() & apa.isShown() || naa.isShown() & apa.isShown()
                    || ana.isShown() & apa.isShown()) {
                playb.setAlpha(255);
                playb.setEnabled(true);

                   } else {
                playb.setAlpha(130);

            }

        } ////// A U D I O //////////

        if (nayli.isPlaying()) {
            nayli.pause();

        }
        if (nayan.isPlaying()) {
            nayan.pause();

        }
        if (fuyna.isPlaying()) {
            fuyna.pause();

        }
        if (liyan.isPlaying()) {
            liyan.pause();

        }
        if (apyfu.isPlaying()) {
            apyfu.pause();

        }
        if (fuyan.isPlaying()) {
            fuyan.pause();

        }
        if (fuyli.isPlaying()) {
            fuyli.pause();

        }
        if (apyli.isPlaying()) {
            apyli.pause();

        }
        if (apyna.isPlaying()) {
            apyna.pause();

        }
        if (apyan.isPlaying()) {
            apyan.pause();

        }
        if (cnaylib.isPlaying()) {
            cnaylib.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }
        if (cnayanb.isPlaying()) {
            cnayanb.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }
        if (canylib.isPlaying()) {
            canylib.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }
        if (capylib.isPlaying()) {
            capylib.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }
        if (capynab.isPlaying()) {
            capynab.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }
        if (capyanb.isPlaying()) {
            capyanb.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }
        if (cfuyli.isPlaying()) {
            cfuyli.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }
        if (cfuyan.isPlaying()) {
            cfuyan.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }
        if (cfuyna.isPlaying()) {
            cfuyna.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }
        if (capyfu.isPlaying()) {
            capyfu.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }
        //////▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄////////

               if (apa.isShown() || ana.isShown() || lia.isShown()
                || naa.isShown() || fua.isShown()) {
                   stop.setAlpha(255);
                   stop.setEnabled(true);
               }else {
                   stop.setAlpha(130);
                   stop.setEnabled(false);
        }
        ///////////////////  L I G H T H O U S E  /////////////////////////////////////////
    }


    public void lighthouse(View v) {

        plugin.play(sound, 1, 1, 1, 0, 0);

        if(bypass.isChecked()){
            bp++;
        }

               if (apa.isShown() & ana.isShown() || fua.isShown() & ana.isShown() || fua.isShown() & apa.isShown() || naa.isShown() & apa.isShown()
                || naa.isShown() & fua.isShown() || naa.isShown() & ana.isShown()) {

            if (ana.getVisibility() == View.VISIBLE) {
                pan = 0;

            }
            if (naa.getVisibility() == View.VISIBLE) {
                pna = 0;

            }
            if (apa.getVisibility() == View.VISIBLE) {
                pap = 0;

            }
            if (fua.getVisibility() == View.VISIBLE) {
                pfu = 0;
            }

            if (apa.isShown()) {
                visap++;
                apa.setVisibility(View.GONE);
                ap.setAlpha(255);

            }
            if (fua.isShown()) {
                visfu++;
                fua.setVisibility(View.GONE);
                fu.setAlpha(255);

            }
            if (ana.isShown()) {
                visan++;
                ana.setVisibility(View.GONE);
                an.setAlpha(255);

            }
            if (naa.isShown()) {
                visna++;
                naa.setVisibility(View.GONE);
                na.setAlpha(255);

            }/////////////////// A U D I O //////////////////////////////
            if (nayli.isPlaying()) {
                nayli.pause();

            }
            if (nayan.isPlaying()) {
                nayan.pause();

            }
            if (fuyna.isPlaying()) {
                fuyna.pause();

            }
            if (liyan.isPlaying()) {
                liyan.pause();

            }
            if (apyfu.isPlaying()) {
                apyfu.pause();

            }
            if (fuyan.isPlaying()) {
                fuyan.pause();

            }
            if (fuyli.isPlaying()) {
                fuyli.pause();

            }
            if (apyli.isPlaying()) {
                apyli.pause();

            }
            if (apyna.isPlaying()) {
                apyna.pause();

            }
            if (apyan.isPlaying()) {
                apyan.pause();

            }if (cnaylib.isPlaying()) {
                cnaylib.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (cnayanb.isPlaying()) {
                cnayanb.pause();
                bypass.setChecked(false);
                       bypass.setTextColor(getResources().getColor(R.color.gris));

            }if(canylib.isPlaying()) {
                canylib.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (capylib.isPlaying()) {
                capylib.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (capynab.isPlaying()) {
                capynab.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (capyanb.isPlaying()) {
                capyanb.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (cfuyli.isPlaying()) {
                cfuyli.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (cfuyan.isPlaying()) {
                cfuyan.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (cfuyna.isPlaying()) {
                cfuyna.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (capyfu.isPlaying()) {
                capyfu.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

                   }
            //////▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄A U D I O ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄////////

        }
        if (pli % 2 == 0) {
            lia.setVisibility(View.VISIBLE);
            lia.setAlpha(130);
            li.setAlpha(180);
            pli++;

            if (lia.isShown() & ana.isShown() || fua.isShown() & ana.isShown() || fua.isShown() & lia.isShown()
                    || naa.isShown() & lia.isShown() || naa.isShown() & fua.isShown() || naa.isShown() & ana.isShown()
                    || lia.isShown() & apa.isShown() || fua.isShown() & apa.isShown() || naa.isShown() & apa.isShown()
                    || ana.isShown() & apa.isShown()) {

                playb.setAlpha(255);
                playb.setEnabled(true);

            } else {
                playb.setAlpha(130);

            }

        } else {
            li.setAlpha(255);
            lia.setVisibility(View.GONE);
            pli++;

            if (lia.isShown() & ana.isShown() || fua.isShown() & ana.isShown() || fua.isShown() & lia.isShown()
                    || naa.isShown() & lia.isShown() || naa.isShown() & fua.isShown() || naa.isShown() & ana.isShown()
                    || lia.isShown() & apa.isShown() || fua.isShown() & apa.isShown() || naa.isShown() & apa.isShown()
                    || ana.isShown() & apa.isShown()) {

                playb.setAlpha(255);
                playb.setEnabled(true);

            } else {
                playb.setAlpha(130);

            }

            if (ana.getVisibility() == View.VISIBLE) {
                ana.setAlpha(100);

            }
            if (apa.getVisibility() == View.VISIBLE) {
                apa.setAlpha(100);

            }
            if (naa.getVisibility() == View.VISIBLE) {
                naa.setAlpha(100);

            }
            if (fua.getVisibility() == View.VISIBLE) {
                fua.setAlpha(100);
            }

        } ////// A U D I O //////////

        if (nayli.isPlaying()) {
            nayli.pause();

        }
        if (nayan.isPlaying()) {
            nayan.pause();

        }
        if (fuyna.isPlaying()) {
            fuyna.pause();

        }
        if (liyan.isPlaying()) {
            liyan.pause();

        }
        if (apyfu.isPlaying()) {
            apyfu.pause();

        }
        if (fuyan.isPlaying()) {
            fuyan.pause();

        }
        if (fuyli.isPlaying()) {
            fuyli.pause();

        }
        if (apyli.isPlaying()) {
            apyli.pause();

        }
        if (apyna.isPlaying()) {
            apyna.pause();

        }
        if (apyan.isPlaying()) {
            apyan.pause();

        }if (cnaylib.isPlaying()) {
            cnaylib.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if (cnayanb.isPlaying()) {
            cnayanb.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if(canylib.isPlaying()) {
            canylib.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if(capylib.isPlaying()) {
            capylib.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if (capynab.isPlaying()) {
            capynab.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if (capyanb.isPlaying()) {
            capyanb.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if (cfuyli.isPlaying()) {
            cfuyli.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if (cfuyan.isPlaying()) {
            cfuyan.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if (cfuyna.isPlaying()) {
            cfuyna.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if (capyfu.isPlaying()) {
            capyfu.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }
        //////▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄////////

    if(apa.isShown() || ana.isShown() || lia.isShown()
            || naa.isShown() || fua.isShown()){
        stop.setAlpha(255);
        stop.setEnabled(true);
    }else {
        stop.setAlpha(130);
        stop.setEnabled(false);
    }
        /////////////////// F U Z Z I L L A  /////////////////////////////////////////

    }

    public void fuzzilla(View v) {

        plugin.play(sound, 1, 1, 1, 0, 0);

        if(bypass.isChecked()){
            bp++;
        }

               if (lia.isShown() & ana.isShown() || apa.isShown() & ana.isShown() || apa.isShown() & lia.isShown() || naa.isShown() & lia.isShown()
                || naa.isShown() & apa.isShown() || naa.isShown() & ana.isShown() || ana.isShown() & lia.isShown()) {

            if (ana.getVisibility() == View.VISIBLE) {
                pan = 0;

            }
            if (naa.getVisibility() == View.VISIBLE) {
                pna = 0;

            }
            if (lia.getVisibility() == View.VISIBLE) {
                pli = 0;

            }
            if (apa.getVisibility() == View.VISIBLE) {
                pap = 0;
            }

            if (lia.isShown()) {
                visli++;
                lia.setVisibility(View.GONE);
                li.setAlpha(255);

            }
            if (apa.isShown()) {
                visap++;
                apa.setVisibility(View.GONE);
                ap.setAlpha(255);

            }
            if (ana.isShown()) {
                visan++;
                ana.setVisibility(View.GONE);
                an.setAlpha(255);

            }
            if (naa.isShown()) {
                visna++;
                naa.setVisibility(View.GONE);
                na.setAlpha(255);

            }/////////////////// A U D I O //////////////////////////////
            if (nayli.isPlaying()) {
                nayli.pause();

            }
            if (nayan.isPlaying()) {
                nayan.pause();

            }
            if (fuyna.isPlaying()) {
                fuyna.pause();

            }
            if (liyan.isPlaying()) {
                liyan.pause();

            }
            if (apyfu.isPlaying()) {
                apyfu.pause();

            }
            if (fuyan.isPlaying()) {
                fuyan.pause();

            }
            if (fuyli.isPlaying()) {
                fuyli.pause();

            }
            if (apyli.isPlaying()) {
                apyli.pause();

            }
            if (apyna.isPlaying()) {
                apyna.pause();

            }
            if (apyan.isPlaying()) {
                apyan.pause();

           }if (cnaylib.isPlaying()) {
                cnaylib.pause();
                bypass.setChecked(false);
                       bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (cnayanb.isPlaying()) {
                cnayanb.pause();
                bypass.setChecked(false);
                       bypass.setTextColor(getResources().getColor(R.color.gris));

            }if(canylib.isPlaying()) {
                canylib.pause();
                bypass.setChecked(false);
                       bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (capylib.isPlaying()) {
                capylib.pause();
                bypass.setChecked(false);
                       bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (capynab.isPlaying()) {
                capynab.pause();
                bypass.setChecked(false);
                       bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (capyanb.isPlaying()) {
                capyanb.pause();
                bypass.setChecked(false);
                       bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (cfuyli.isPlaying()) {
                cfuyli.pause();
                bypass.setChecked(false);
                       bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (cfuyan.isPlaying()) {
                cfuyan.pause();
                bypass.setChecked(false);
                       bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (cfuyna.isPlaying()) {
                cfuyna.pause();
                bypass.setChecked(false);
                       bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (capyfu.isPlaying()) {
                capyfu.pause();
                bypass.setChecked(false);
                       bypass.setTextColor(getResources().getColor(R.color.gris));

                   }
            //////▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄A U D I O ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄////////
        if(apa.isShown() || ana.isShown() || lia.isShown()
                || naa.isShown() || fua.isShown()){
            stop.setAlpha(255);
        }else {
            stop.setAlpha(130);
        }
        }
        if (pfu % 2 == 0) {
            fua.setVisibility(View.VISIBLE);
            fua.setAlpha(130);
            fu.setAlpha(180);
            pfu++;

                   if (lia.isShown() & ana.isShown() || fua.isShown() & ana.isShown() || fua.isShown() & lia.isShown()
                    || naa.isShown() & lia.isShown() || naa.isShown() & fua.isShown() || naa.isShown() & ana.isShown()
                    || lia.isShown() & apa.isShown() || fua.isShown() & apa.isShown() || naa.isShown() & apa.isShown()
                    || ana.isShown() & apa.isShown()) {

                playb.setAlpha(255);
                playb.setEnabled(true);

            } else {
                playb.setAlpha(130);

            }

        } else {
            fua.setVisibility(View.GONE);
            fu.setAlpha(255);
            pfu++;

                   if (lia.isShown() & ana.isShown() || fua.isShown() & ana.isShown() || fua.isShown() & lia.isShown()
                    || naa.isShown() & lia.isShown() || naa.isShown() & fua.isShown() || naa.isShown() & ana.isShown()
                    || lia.isShown() & apa.isShown() || fua.isShown() & apa.isShown() || naa.isShown() & apa.isShown()
                    || ana.isShown() & apa.isShown()) {

                playb.setAlpha(255);
                playb.setEnabled(true);

            } else {
                playb.setAlpha(130);

            }

            if (ana.getVisibility() == View.VISIBLE) {
                ana.setAlpha(100);

            }
            if (apa.getVisibility() == View.VISIBLE) {
                apa.setAlpha(100);

            }
            if (lia.getVisibility() == View.VISIBLE) {
                lia.setAlpha(100);

            }
            if (naa.getVisibility() == View.VISIBLE) {
                naa.setAlpha(100);
            }

        } ////// A U D I O //////////
        if (nayli.isPlaying()) {
            nayli.pause();

        }
        if (nayan.isPlaying()) {
            nayan.pause();

        }
        if (fuyna.isPlaying()) {
            fuyna.pause();

        }
        if (liyan.isPlaying()) {
            liyan.pause();

        }
        if (apyfu.isPlaying()) {
            apyfu.pause();

        }
        if (fuyan.isPlaying()) {
            fuyan.pause();

        }
        if (fuyli.isPlaying()) {
            fuyli.pause();

        }
        if (apyli.isPlaying()) {
            apyli.pause();

        }
        if (apyna.isPlaying()) {
            apyna.pause();

        }
        if (apyan.isPlaying()) {
            apyan.pause();

        }if (cnaylib.isPlaying()) {
            cnaylib.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if (cnayanb.isPlaying()) {
            cnayanb.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if(canylib.isPlaying()) {
            canylib.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if(capylib.isPlaying()) {
            capylib.pause();
            bypass.setTextColor(getResources().getColor(R.color.gris));
            bypass.setChecked(false);

        }if (capynab.isPlaying()) {
            capynab.pause();
            bypass.setTextColor(getResources().getColor(R.color.gris));
            bypass.setChecked(false);

        }if (capyanb.isPlaying()) {
            capyanb.pause();
            bypass.setTextColor(getResources().getColor(R.color.gris));
            bypass.setChecked(false);

        }if (cfuyli.isPlaying()) {
            cfuyli.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if (cfuyan.isPlaying()) {
            cfuyan.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if (cfuyna.isPlaying()) {
            cfuyna.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if (capyfu.isPlaying()) {
            capyfu.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }
            //////▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄////////

        if(apa.isShown() || ana.isShown() || lia.isShown()
                || naa.isShown() || fua.isShown()){
            stop.setAlpha(255);
            stop.setEnabled(true);
        }else {
            stop.setAlpha(130);
            stop.setEnabled(false);
        }

        ///////////////////  N A U T I L U S   /////////////////////////////////////////

    }

    public void Nautilus(View v) {

        plugin.play(sound, 1, 1, 1, 0, 0);

        if(bypass.isChecked()){
            bp++;
        }

        if (lia.isShown() & ana.isShown() || fua.isShown() & ana.isShown() || fua.isShown() & lia.isShown() || apa.isShown() & lia.isShown()
                || apa.isShown() & fua.isShown() || apa.isShown() & ana.isShown() || ana.isShown() & lia.isShown()) {

            if (ana.getVisibility() == View.VISIBLE) {
                pan = 0;

            }
            if (apa.getVisibility() == View.VISIBLE) {
                pap = 0;

            }
            if (lia.getVisibility() == View.VISIBLE) {
                pli = 0;

            }
            if (fua.getVisibility() == View.VISIBLE) {
                pfu = 0;
            }


            if (ana.getVisibility() == View.VISIBLE) {
                pan = 0;

            }
            if (apa.getVisibility() == View.VISIBLE) {
                pap = 0;

            }
            if (lia.getVisibility() == View.VISIBLE) {
                pli = 0;

            }
            if (fua.getVisibility() == View.VISIBLE) {
                pfu = 0;
            }

            if (lia.isShown()) {
                visli++;
                lia.setVisibility(View.GONE);
                li.setAlpha(255);

            }
            if (fua.isShown()) {
                visfu++;
                fua.setVisibility(View.GONE);
                fu.setAlpha(255);

            }
            if (ana.isShown()) {
                visan++;
                ana.setVisibility(View.GONE);
                an.setAlpha(255);

            }
            if (apa.isShown()) {
                visap++;
                apa.setVisibility(View.GONE);
                ap.setAlpha(255);

            }/////////////////// A U D I O //////////////////////////////
            if (nayli.isPlaying()) {
                nayli.pause();

            }
            if (nayan.isPlaying()) {
                nayan.pause();

            }
            if (fuyna.isPlaying()) {
                fuyna.pause();

            }
            if (liyan.isPlaying()) {
                liyan.pause();

            }
            if (apyfu.isPlaying()) {
                apyfu.pause();

            }
            if (fuyan.isPlaying()) {
                fuyan.pause();

            }
            if (fuyli.isPlaying()) {
                fuyli.pause();

            }
            if (apyli.isPlaying()) {
                apyli.pause();

            }
            if (apyna.isPlaying()) {
                apyna.pause();

            }
            if (apyan.isPlaying()) {
                apyan.pause();

            }if (cnaylib.isPlaying()) {
                cnaylib.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (cnayanb.isPlaying()) {
                cnayanb.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            } if(canylib.isPlaying()) {
                canylib.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (capylib.isPlaying()) {
                capylib.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (capynab.isPlaying()) {
                capynab.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (capyanb.isPlaying()) {
                capyanb.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (cfuyli.isPlaying()) {
                cfuyli.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (cfuyan.isPlaying()) {
                cfuyan.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (cfuyna.isPlaying()) {
                cfuyna.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (capyfu.isPlaying()) {
                capyfu.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }
            //////▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄A U D I O ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄////////

        }
        if (pna % 2 == 0) {
            naa.setVisibility(View.VISIBLE);
            na.setAlpha(130);
            naa.setAlpha(130);
            pna++;

            if (lia.isShown() & ana.isShown() || fua.isShown() & ana.isShown() || fua.isShown() & lia.isShown()
                    || naa.isShown() & lia.isShown() || naa.isShown() & fua.isShown() || naa.isShown() & ana.isShown()
                    || lia.isShown() & apa.isShown() || fua.isShown() & apa.isShown() || naa.isShown() & apa.isShown()
                    || ana.isShown() & apa.isShown()) {

                playb.setAlpha(255);
                playb.setEnabled(true);

            } else {
                playb.setAlpha(130);

            }

        } else {
            na.setAlpha(255);
            naa.setVisibility(View.GONE);

                   if (lia.isShown() & ana.isShown() || fua.isShown() & ana.isShown() || fua.isShown() & lia.isShown()
                    || naa.isShown() & lia.isShown() || naa.isShown() & fua.isShown() || naa.isShown() & ana.isShown()
                    || lia.isShown() & apa.isShown() || fua.isShown() & apa.isShown() || naa.isShown() & apa.isShown()
                    || ana.isShown() & apa.isShown()) {

                playb.setAlpha(255);
                playb.setEnabled(true);

            } else {
                playb.setAlpha(130);

            }

            ////// A U D I O //////////
            if (nayli.isPlaying()) {
                nayli.pause();

            }
            if (nayan.isPlaying()) {
                nayan.pause();

            }
            if (fuyna.isPlaying()) {
                fuyna.pause();

            }
            if (liyan.isPlaying()) {
                liyan.pause();

            }
            if (apyfu.isPlaying()) {
                apyfu.pause();

            }
            if (fuyan.isPlaying()) {
                fuyan.pause();

            }
            if (fuyli.isPlaying()) {
                fuyli.pause();

            }
            if (apyli.isPlaying()) {
                apyli.pause();

            }
            if (apyna.isPlaying()) {
                apyna.pause();

            }
            if (apyan.isPlaying()) {
                apyan.pause();

            }if (cnaylib.isPlaying()) {
                cnaylib.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (cnayanb.isPlaying()) {
                cnayanb.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if(canylib.isPlaying()) {
                canylib.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if(capylib.isPlaying()) {
                capylib.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (capynab.isPlaying()) {
                capynab.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (capyanb.isPlaying()) {
                capyanb.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (cfuyli.isPlaying()) {
                cfuyli.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (cfuyan.isPlaying()) {
                cfuyan.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (cfuyna.isPlaying()) {
                cfuyna.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }if (capyfu.isPlaying()) {
                capyfu.pause();
                bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));

            }

            if (ana.getVisibility() == View.VISIBLE) {
                ana.setAlpha(100);

            }
            if (apa.getVisibility() == View.VISIBLE) {
                apa.setAlpha(100);

            }
            if (lia.getVisibility() == View.VISIBLE) {
                lia.setAlpha(100);

            }
            if (fua.getVisibility() == View.VISIBLE) {
                fua.setAlpha(100);
            }

            //////▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄////////

            pna++;
        } if(apa.isShown() || ana.isShown() || lia.isShown()
            || naa.isShown() || fua.isShown()){
        stop.setAlpha(255);
        stop.setEnabled(true);
        }else {
        stop.setAlpha(130);
        stop.setEnabled(false);
    }
    }

    @Override
    protected void onStart() {
        super.onStart();



    }

    @Override
    protected void onResume() {
        super.onResume();

        playFile();


        playb.setAlpha(130);
        pausa.setAlpha(130);
        stop.setAlpha(130);

        ana.setVisibility(View.GONE);
        apa.setVisibility(View.GONE);
        fua.setVisibility(View.GONE);
        lia.setVisibility(View.GONE);
        naa.setVisibility(View.GONE);

        ap.setAlpha(255);
        an.setAlpha(255);
        li.setAlpha(255);
        na.setAlpha(255);
        fu.setAlpha(255);

        apyan = MediaPlayer.create(this, raw.apyan);
        apyna = MediaPlayer.create(this, raw.apyna);
        apyli = MediaPlayer.create(this, raw.apyli);
        apyfu = MediaPlayer.create(this, raw.apyfu);
        fuyli = MediaPlayer.create(this, raw.fuyli);
        fuyna = MediaPlayer.create(this, raw.fuyna);
        fuyan = MediaPlayer.create(this, raw.fuyan);
        nayli = MediaPlayer.create(this, raw.nayli);
        nayan = MediaPlayer.create(this, raw.nayanb);
        liyan = MediaPlayer.create(this, raw.anyli);
        cnaylib = MediaPlayer.create(this, raw.cnayli);
        cnayanb = MediaPlayer.create(this, raw.cnayanb);
        canylib = MediaPlayer.create(this, raw.canyli);
        capylib = MediaPlayer.create(this, raw.capyli);
        capynab = MediaPlayer.create(this, raw.capyna);
        capyanb = MediaPlayer.create(this, raw.capyan);
        capyfu = MediaPlayer.create(this, raw.capyfu);
        cfuyli = MediaPlayer.create(this, raw.cfuylib);
        cfuyna = MediaPlayer.create(this, raw.cfuyna);
        cfuyan = MediaPlayer.create(this, raw.cfuyan);



        nayli.start();
        nayan.start();
        fuyna.start();
        apyna.start();
        apyan.start();
        apyfu.start();
        fuyli.start();
        apyli.start();
        liyan.start();
        fuyan.start();

        cnaylib.start();
        cnayanb.start();
        canylib.start();
        capylib.start();
        capynab.start();
        capyanb.start();
        cfuyan.start();
        cfuyli.start();
        cfuyna.start();
        capyfu.start();


        fuyan.pause();
        apyan.pause();
        apyfu.pause();
        fuyli.pause();
        apyli.pause();
        fuyna.pause();
        apyna.pause();
        nayli.pause();
        nayan.pause();
        liyan.pause();

        cnaylib.pause();
        cnayanb.pause();
        canylib.pause();
        capylib.pause();
        capynab.pause();
        capyanb.pause();
        cfuyan.pause();
        cfuyli.pause();
        cfuyna.pause();
        capyfu.pause();

        if(pausa.getAlpha() != 255){
            pausa.setEnabled(false);
        }else{
            pausa.setEnabled(true);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();


        nayli = MediaPlayer.create(this, raw.nayli);
        nayli.release();

        nayan = MediaPlayer.create(this, raw.nayanb);
        nayan.release();

        fuyna = MediaPlayer.create(this, raw.fuyna);
        fuyna.release();

        apyna = MediaPlayer.create(this, raw.apyna);
        apyna.release();

        fuyli = MediaPlayer.create(this, raw.fuyli);
        fuyli.release();

        fuyan = MediaPlayer.create(this, raw.fuyan);
        fuyan.release();

        apyan = MediaPlayer.create(this, raw.apyan);
        apyan.release();

        apyfu = MediaPlayer.create(this, raw.apyfu);
        apyfu.release();

        apyli = MediaPlayer.create(this, raw.nayl);
        apyli.release();

        liyan = MediaPlayer.create(this, raw.anyli);
        liyan.release();

        cnaylib = MediaPlayer.create(this, raw.cnayli);
        cnaylib.release();

        cnayanb = MediaPlayer.create(this, raw.cnayanb);
        cnayanb.release();

        canylib = MediaPlayer.create(this, raw.canyli);
        canylib.release();

        capylib = MediaPlayer.create(this, raw.capyli);
        capylib.release();

        capynab = MediaPlayer.create(this, raw.capyna);
        capynab.release();

        capyanb = MediaPlayer.create(this, raw.capyan);
        capyanb.release();

        capyfu = MediaPlayer.create(this, raw.capyfu);
        capyfu.release();

        cfuyli = MediaPlayer.create(this, raw.cfuylib);
        cfuyli.release();

        cfuyna = MediaPlayer.create(this, raw.cfuyna);
        cfuyna.release();

        cfuyan = MediaPlayer.create(this, raw.cfuyan);
        cfuyan.release();

        nayli.release();
        apyan.release();
        apyli.release();
        fuyli.release();
        fuyan.release();
        apyfu.release();
        fuyna.release();
        apyna.release();
        nayan.release();
        liyan.release();

        cnaylib.release();
        cnayanb.release();
        canylib.release();
        capylib.release();
        capynab.release();
        capyanb.release();
        cfuyan.release();
        cfuyli.release();
        cfuyna.release();
        capyfu.release();


        if (ana.isShown()) {
            visan++;
            ana.setVisibility(View.GONE);

        }
        if (naa.isShown()) {
            pna++;
            naa.setVisibility(View.GONE);

        }
        if (apa.isShown()) {
            pap++;
            apa.setVisibility(View.GONE);

        }
        if (fua.isShown()) {
            pfu++;
            fua.setVisibility(View.GONE);

        }
        if (lia.isShown()) {
            pli++;
            lia.setVisibility(View.GONE);

        }
        if (pausa.getAlpha() != 255) {
            pausa.setEnabled(false);
        } else {
            pausa.setEnabled(true);

        }
        if (pausa.getAlpha() != 255) {
            pausa.setEnabled(false);

        }
        if (pausa.getAlpha() != 130) {
            pausa.setEnabled(true);

        }
    }
    @Override
    protected void onPause() {
        super.onPause();

        if (nayli.isPlaying()) {
            nayli.pause();

        }
        if (nayan.isPlaying()) {
            nayan.pause();

        }
        if (fuyna.isPlaying()) {
            fuyna.pause();

        }
        if (liyan.isPlaying()) {
            liyan.pause();

        }
        if (apyfu.isPlaying()) {
            apyfu.pause();

        }
        if (fuyan.isPlaying()) {
            fuyan.pause();

        }
        if (fuyli.isPlaying()) {
            fuyli.pause();

        }
        if (apyli.isPlaying()) {
            apyli.pause();

        }
        if (apyna.isPlaying()) {
            apyna.pause();

        }
        if (apyan.isPlaying()) {
            apyan.pause();

        }

        if (cnaylib.isPlaying()) {
            cnaylib.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if (cnayanb.isPlaying()) {
            cnayanb.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

         }if (canylib.isPlaying()) {
              canylib.pause();
              bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

         }if (capylib.isPlaying()) {
            capylib.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if (capynab.isPlaying()) {
            capynab.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if (capyanb.isPlaying()) {
            capyanb.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if (cfuyan.isPlaying()) {
            cfuyan.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if (cfuyna.isPlaying()) {
            cfuyna.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if (cfuyli.isPlaying()) {
            cfuyli.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }if (capyfu.isPlaying()) {
            capyfu.pause();
            bypass.setChecked(false);
            bypass.setTextColor(getResources().getColor(R.color.gris));

        }

        capyanb.release();
        capynab.release();
        capylib.release();
        canylib.release();
        cnayanb.release();
        cnaylib.release();
        cfuyan.release();
        cfuyli.release();
        cfuyna.release();
        capyfu.release();

        apyan.release();
        apyfu.release();
        apyna.release();
        apyli.release();
        fuyli.release();
        fuyna.release();
        fuyan.release();
        nayli.release();
        nayan.release();
        liyan.release();

///////////////////// P L A Y ////////////////////////////////////////

    }

    public void playb(View v) {

///////////////////// A U D I O /////////////////////

        if (naa.getVisibility() == View.INVISIBLE || ana.getVisibility() == View.INVISIBLE || apa.getVisibility() == View.INVISIBLE
                || fua.getVisibility() == View.INVISIBLE || lia.getVisibility() == View.INVISIBLE) {


            if (nayli.isPlaying()) {
                nayli.release();

            }
            if (nayan.isPlaying()) {
                nayan.release();

            }
            if (fuyna.isPlaying()) {
                fuyna.release();

            }
            if (liyan.isPlaying()) {
                liyan.release();

            }
            if (apyfu.isPlaying()) {
                apyfu.release();

            }
            if (fuyan.isPlaying()) {
                fuyan.release();

            }
            if (fuyli.isPlaying()) {
                fuyli.release();

            }
            if (apyli.isPlaying()) {
                apyli.release();

            }
            if (apyna.isPlaying()) {
                apyna.release();

            }
            if (apyan.isPlaying()) {
                apyan.release();

            }
            if (cnaylib.isPlaying()) {
                cnaylib.release();

            }
            if (cnayanb.isPlaying()) {
                cnayanb.release();

            }
            if (canylib.isPlaying()) {
                canylib.release();

            }
            if (capylib.isPlaying()) {
                capylib.release();

            }
            if (capynab.isPlaying()) {
                capynab.release();

            }
            if (capyanb.isPlaying()) {
                capyanb.release();

            }
            if (cfuyli.isPlaying()) {
                cfuyli.release();

            }
            if (cfuyan.isPlaying()) {
                cfuyan.release();

            }
            if (cfuyna.isPlaying()) {
                cfuyna.release();

            }
            if (capyfu.isPlaying()) {
                capyfu.release();

            }
        }
        // NAUTILUS - ANDROMEDA
        if (naa.getAlpha() != 130 & ana.getAlpha() != 130 & naa.isShown() & ana.isShown() & bypass.isChecked() == false) {
            nayan.start();
            nayan.setVolume(1, 1);
            cnayanb.start();
            cnayanb.setVolume(0, 0);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        }
        if (naa.getAlpha() != 130 & ana.getAlpha() != 130 & naa.isShown() & ana.isShown() & bypass.isChecked() == true) {
            nayan.start();
            nayan.setVolume(0, 0);
            cnayanb.start();
            cnayanb.setVolume(1, 1);
        }
        //
        //NAUTILUS - LIGHTHOUSE
        if (naa.getAlpha() != 130 & lia.getAlpha() != 130 & naa.isShown() & lia.isShown() & bypass.isChecked() == false) {
            nayli.start();
            nayli.setVolume(1, 1);
            cnaylib.start();
            cnaylib.setVolume(0, 0);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        }
        if (naa.getAlpha() != 255 & lia.getAlpha() != 255 & naa.isShown() & lia.isShown() & bypass.isChecked() == true) {
            nayli.start();
            nayli.setVolume(0, 0);
            cnaylib.start();
            cnaylib.setVolume(1, 1);
            //
            // ANDROMEDA - LIGHTHOUSE
        }
        if (ana.getAlpha() != 130 & lia.getAlpha() != 130 & ana.isShown() & lia.isShown() & bypass.isChecked() == false) {
            liyan.start();
            liyan.setVolume(1, 1);
            canylib.start();
            canylib.setVolume(0, 0);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        }
        if (ana.getAlpha() != 130 & lia.getAlpha() != 130 & ana.isShown() & lia.isShown() & bypass.isChecked() == true) {
            liyan.start();
            liyan.setVolume(0, 0);
            canylib.start();
            canylib.setVolume(1, 1);


            /// FUZZILLA - LIGHTHOUSE
        }
        if (fua.getAlpha() != 130 & lia.getAlpha() != 130 & fua.isShown() & lia.isShown() & bypass.isChecked() == false) {
            fuyli.start();
            fuyli.setVolume(0, 0);
            cfuyli.start();
            cfuyli.setVolume(1, 1);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        }
        if (fua.getAlpha() != 130 & lia.getAlpha() != 130 & fua.isShown() & lia.isShown() & bypass.isChecked() == true) {
            fuyli.start();
            fuyli.setVolume(1, 1);
            cfuyli.start();
            cfuyli.setVolume(0, 0);

            ///APOCALIPSIS - LIGHTHOUSE
        }
        if (apa.getAlpha() != 130 & lia.getAlpha() != 130 & apa.isShown() & lia.isShown() & bypass.isChecked() == false) {
            apyli.start();
            apyli.setVolume(1, 1);
            capylib.start();
            capylib.setVolume(0, 0);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        }
        if (apa.getAlpha() != 130 & lia.getAlpha() != 130 & apa.isShown() & lia.isShown() & bypass.isChecked() == true) {
            apyli.start();
            apyli.setVolume(0, 0);
            capylib.start();
            capylib.setVolume(1, 1);

            // APOCALIPSIS - NAUTILUS
        }
        if (apa.getAlpha() != 130 & naa.getAlpha() != 130 & apa.isShown() & naa.isShown() & bypass.isChecked() == false) {
            apyna.start();
            apyna.setVolume(1, 1);
            capynab.start();
            capynab.setVolume(0, 0);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        }
        if (apa.getAlpha() != 130 & naa.getAlpha() != 130 & apa.isShown() & naa.isShown() & bypass.isChecked() == true) {
            apyna.start();
            apyna.setVolume(0, 0);
            capynab.start();
            capynab.setVolume(1, 1);

            ///APOCALIPSIS - ANDROMEDA
        }
        if (apa.getAlpha() != 130 & ana.getAlpha() != 130 & apa.isShown() & ana.isShown() & bypass.isChecked() == false) {
            apyan.start();
            apyan.setVolume(1, 1);
            capyanb.start();
            capyanb.setVolume(0, 0);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        }
        if (apa.getAlpha() != 130 & ana.getAlpha() != 130 & apa.isShown() & ana.isShown() & bypass.isChecked() == true) {
            apyan.start();
            apyan.setVolume(0, 0);
            capyanb.start();
            capyanb.setVolume(1, 1);

            //FUZZILLA - ANDROMEDA
        }
        if (fua.getAlpha() != 130 & ana.getAlpha() != 130 & fua.isShown() & ana.isShown() & bypass.isChecked() == false) {
            fuyan.start();
            fuyan.setVolume(1, 1);
            cfuyan.start();
            cfuyan.setVolume(0, 0);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        }
        if (fua.getAlpha() != 130 & ana.getAlpha() != 130 & fua.isShown() & ana.isShown() & bypass.isChecked() == true) {
            fuyan.start();
            fuyan.setVolume(0, 0);
            cfuyan.start();
            cfuyan.setVolume(1, 1);

            //FUZZILLA - NAUTILUS
        }
        if (fua.getAlpha() != 130 & naa.getAlpha() != 130 & fua.isShown() & naa.isShown() & bypass.isChecked() == false) {
            fuyna.start();
            fuyna.setVolume(1, 1);
            cfuyna.start();
            cfuyna.setVolume(0, 0);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);


        }
        if (fua.getAlpha() != 130 & naa.getAlpha() != 130 & fua.isShown() & naa.isShown() & bypass.isChecked() == true) {
            fuyna.start();
            fuyna.setVolume(0, 0);
            cfuyna.start();
            cfuyna.setVolume(1, 1);

            //FUZZILLA - APOCALIPSIS
        }
        if (fua.getAlpha() != 130 & apa.getAlpha() != 130 & fua.isShown() & apa.isShown() & bypass.isChecked() == false) {
            apyfu.start();
            apyfu.setVolume(1, 1);
            capyfu.start();
            capyfu.setVolume(0, 0);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        }
        if (fua.getAlpha() != 130 & apa.getAlpha() != 130 & fua.isShown() & apa.isShown() & bypass.isChecked() == true) {
            apyfu.start();
            apyfu.setVolume(0, 0);
            capyfu.start();
            capyfu.setVolume(1, 1);


        }

        //
        //

///////////////////// OPACIDAD PEDALES /////////////////////


        if (ana.isShown() & lia.isShown()) {
            if (bypass.isChecked()) {
                ana.setAlpha(130);
                lia.setAlpha(130);

            } else {
                ana.setAlpha(255);
                lia.setAlpha(255);
            }

        }
        if (apa.isShown() & lia.isShown()) {
            if (bypass.isChecked()) {
                apa.setAlpha(130);
                lia.setAlpha(130);
            } else {
                apa.setAlpha(255);
                lia.setAlpha(255);
            }

        }
        if (apa.isShown() & ana.isShown()) {
            if (bypass.isChecked()) {
                apa.setAlpha(130);
                ana.setAlpha(130);
            } else {
                apa.setAlpha(255);
                ana.setAlpha(255);
            }

        }
        if (apa.isShown() & naa.isShown()) {
            if (bypass.isChecked()) {
                apa.setAlpha(130);
                naa.setAlpha(130);
            } else {
                apa.setAlpha(255);
                naa.setAlpha(255);
            }

        }
        if (apa.isShown() & fua.isShown()) {
            if (bypass.isChecked()) {
                apa.setAlpha(130);
                fua.setAlpha(130);
            } else {
                apa.setAlpha(255);
                fua.setAlpha(255);
            }

        }
        if (naa.isShown() & fua.isShown()) {
            if (bypass.isChecked()) {
                naa.setAlpha(130);
                fua.setAlpha(130);
            } else {
                naa.setAlpha(255);
                fua.setAlpha(255);
            }

        }
        if (naa.isShown() & lia.isShown()) {
            if (bypass.isChecked()) {
                naa.setAlpha(130);
                lia.setAlpha(130);
            } else {
                naa.setAlpha(255);
                lia.setAlpha(255);
            }

        }
        if (naa.isShown() & ana.isShown()) {
            if (bypass.isChecked()) {
                naa.setAlpha(130);
                ana.setAlpha(130);
            } else {
                naa.setAlpha(255);
                ana.setAlpha(255);
            }

        }
        if (fua.isShown() & ana.isShown()) {

            if (bypass.isChecked()) {
                fua.setAlpha(130);
                ana.setAlpha(130);

            } else {
                fua.setAlpha(255);
                ana.setAlpha(255);
            }

        }
        if (fua.isShown() & lia.isShown()) {
            if (bypass.isChecked()) {
                fua.setAlpha(130);
                lia.setAlpha(130);

            } else {
                fua.setAlpha(255);
                lia.setAlpha(255);
            }
        }
        if (apyfu.isPlaying() || apyan.isPlaying() || apyna.isPlaying() || apyli.isPlaying() || liyan.isPlaying()
                || nayan.isPlaying() || nayli.isPlaying() || fuyan.isPlaying() || fuyli.isPlaying() || fuyna.isPlaying()) {
            playb.setAlpha(130);
            pausa.setAlpha(255);
            stop.setAlpha(255);

        }
        if (apa.isShown() || ana.isShown() || lia.isShown() || naa.isShown() || fua.isShown()) {

            stop.setAlpha(255);

        } else {
            stop.setAlpha(130);

        }
        if (pausa.getAlpha() != 130) {
            pausa.setEnabled(true);

        }
        if (playb.getAlpha() != 255 & stop.getAlpha() != 255) {
            pausa.setEnabled(false);

        }
        if (apyfu.isPlaying() || apyan.isPlaying() || apyna.isPlaying() || apyli.isPlaying() || liyan.isPlaying()
                || nayan.isPlaying() || nayli.isPlaying() || fuyan.isPlaying() || fuyli.isPlaying() || fuyna.isPlaying()) {
            pausa.setEnabled(true);

        }
        if (apa.getVisibility() == View.INVISIBLE || ana.getVisibility() == View.INVISIBLE || naa.getVisibility() == View.INVISIBLE
                || lia.getVisibility() == View.INVISIBLE || fua.getVisibility() == View.INVISIBLE) {
            stop.setEnabled(false);
        } else {
            stop.setEnabled(true);

        }
        if (pausa.getAlpha() != 255) {
            pausa.setEnabled(false);

        }
        if (pausa.getAlpha() != 130) {
            pausa.setEnabled(true);

        }
        if (bypass.isChecked()) {

            if (nayli.isPlaying()) {
                nayli.setVolume(0, 0);
                cnaylib.setVolume(1, 1);

            }
            if (nayan.isPlaying()) {
                nayan.setVolume(0, 0);
                cnayanb.start();
                cnayanb.setVolume(1, 1);

            }
            if (liyan.isPlaying()) {
                liyan.setVolume(0, 0);
                canylib.start();
                canylib.setVolume(1, 1);

            }
            if (apyli.isPlaying()) {
                apyli.setVolume(0, 0);
                capylib.start();
                capylib.setVolume(1, 1);

            }
            if (apyna.isPlaying()) {
                apyna.setVolume(0, 0);
                capynab.start();
                capynab.setVolume(1, 1);

            }
            if (apyan.isPlaying()) {
                apyan.setVolume(0, 0);
                capyanb.start();
                capyanb.setVolume(1, 1);

            }
            if (apyfu.isPlaying()) {
                apyfu.setVolume(0, 0);
                capyfu.start();
                capyfu.setVolume(1, 1);

            }
            if (fuyli.isPlaying()) {
                fuyli.setVolume(0, 0);
                cfuyli.start();
                cfuyli.setVolume(1, 1);

            }
            if (fuyna.isPlaying()) {
                fuyna.setVolume(0, 0);
                cfuyna.start();
                cfuyna.setVolume(1, 1);

            }
            if (fuyan.isPlaying()) {
                fuyan.setVolume(0, 0);
                cfuyan.start();
                cfuyan.setVolume(1, 1);

            }

        }
        if (bypass.isChecked() == false) {
            if (nayan.isPlaying()) {
                nayan.setVolume(1, 1);
                cnayanb.setVolume(0, 0);

            }
            if (nayli.isPlaying()) {
                nayli.setVolume(1, 1);
                cnaylib.setVolume(0, 0);

            }
            if (liyan.isPlaying()) {
                liyan.setVolume(1, 1);
                canylib.setVolume(0, 0);

            }
            if (apyli.isPlaying()) {
                apyli.setVolume(1, 1);
                capylib.setVolume(0, 0);

            }
            if (apyna.isPlaying()) {
                apyna.setVolume(1, 1);
                capynab.setVolume(0, 0);

            }
            if (apyan.isPlaying()) {
                apyan.setVolume(1, 1);
                capyanb.setVolume(0, 0);

            }
            if (apyfu.isPlaying()) {
                apyfu.setVolume(1, 1);
                capyfu.setVolume(0, 0);

            }
            if (fuyna.isPlaying()) {
                fuyna.setVolume(1, 1);
                cfuyna.setVolume(0, 0);

            }
            if (fuyan.isPlaying()) {
                fuyan.setVolume(1, 1);
                cfuyan.setVolume(0, 0);

            }
            if (fuyli.isPlaying()) {
                fuyli.setVolume(1, 1);
                cfuyli.setVolume(0, 0);

            }
        }

        ///////////////////////////// METODO PARA RESETEAR MENU REPRODUCCION AL FINALIZAR AUDIO-----
        fuyna.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer fuyna) {
                // Do something when media player end playing
                playb.setAlpha(255);
                playb.setEnabled(true);
                pausa.setAlpha(130);
                pausa.setEnabled(false);
                stop.setAlpha(130);
                stop.setEnabled(false);
                fua.setAlpha(130);
                naa.setAlpha(130);
                getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

                if (bypass.isChecked()) {
                    bypass.setChecked(false);
                    bypass.setTextColor(getResources().getColor(R.color.gris));
                    bp++;

                }
            }
        });

        fuyli.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer fuyli) {
                // Do something when media player end playing
                playb.setAlpha(255);
                playb.setEnabled(true);
                pausa.setAlpha(130);
                pausa.setEnabled(false);
                stop.setAlpha(130);
                stop.setEnabled(false);
                fua.setAlpha(130);
                lia.setAlpha(130);
                getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

                if (bypass.isChecked()) {
                    bypass.setChecked(false);
                    bypass.setTextColor(getResources().getColor(R.color.gris));
                    bp++;
                }
            }
        });

        fuyan.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer fuyan) {
                // Do something when media player end playing
                playb.setAlpha(255);
                playb.setEnabled(true);
                pausa.setAlpha(130);
                pausa.setEnabled(false);
                stop.setAlpha(130);
                stop.setEnabled(false);
                fua.setAlpha(130);
                ana.setAlpha(130);
                getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

                if (bypass.isChecked()) {
                    bypass.setChecked(false);
                    bypass.setTextColor(getResources().getColor(R.color.gris));
                    bp++;
                }

            }
        });

        apyfu.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer apyfu) {
                // Do something when media player end playing
                playb.setAlpha(255);
                playb.setEnabled(true);
                pausa.setAlpha(130);
                pausa.setEnabled(false);
                stop.setAlpha(130);
                stop.setEnabled(false);
                fua.setAlpha(130);
                apa.setAlpha(130);
                getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

                if (bypass.isChecked()) {
                    bypass.setChecked(false);
                    bypass.setTextColor(getResources().getColor(R.color.gris));
                    bp++;
                }
            }
        });

        apyna.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer apyna) {
                // Do something when media player end playing
                playb.setAlpha(255);
                playb.setEnabled(true);
                pausa.setAlpha(130);
                pausa.setEnabled(false);
                stop.setAlpha(130);
                stop.setEnabled(false);
                naa.setAlpha(130);
                apa.setAlpha(130);
                getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

                if (bypass.isChecked()) {
                    bypass.setChecked(false);
                    bypass.setTextColor(getResources().getColor(R.color.gris));
                    bp++;
                }
            }
        });

        apyan.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer apyan) {
                // Do something when media player end playing
                playb.setAlpha(255);
                playb.setEnabled(true);
                pausa.setAlpha(130);
                pausa.setEnabled(false);
                stop.setAlpha(130);
                stop.setEnabled(false);
                ana.setAlpha(130);
                apa.setAlpha(130);
                getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

                if (bypass.isChecked()) {
                    bypass.setChecked(false);
                    bypass.setTextColor(getResources().getColor(R.color.gris));
                    bp++;
                }
            }
        });

        apyli.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer apyli) {
                // Do something when media player end playing
                playb.setAlpha(255);
                playb.setEnabled(true);
                pausa.setAlpha(130);
                pausa.setEnabled(false);
                stop.setAlpha(130);
                stop.setEnabled(false);
                lia.setAlpha(130);
                apa.setAlpha(130);
                getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

                if (bypass.isChecked()) {
                    bypass.setChecked(false);
                    bypass.setTextColor(getResources().getColor(R.color.gris));
                    bp++;
                }
            }
        });

        liyan.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer liyan) {
                // Do something when media player end playing
                playb.setAlpha(255);
                playb.setEnabled(true);
                pausa.setAlpha(130);
                pausa.setEnabled(false);
                stop.setAlpha(130);
                stop.setEnabled(false);
                lia.setAlpha(130);
                ana.setAlpha(130);
                getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

                if (bypass.isChecked()) {
                    bypass.setChecked(false);
                    bypass.setTextColor(getResources().getColor(R.color.gris));
                    bp++;
                }
            }
        });

        nayli.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer nayli) {
                // Do something when media player end playing
                playb.setAlpha(255);
                playb.setEnabled(true);
                pausa.setAlpha(130);
                pausa.setEnabled(false);
                stop.setAlpha(130);
                stop.setEnabled(false);
                naa.setAlpha(130);
                lia.setAlpha(130);
                getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

                if (bypass.isChecked()) {
                    bypass.setChecked(false);
                    bypass.setTextColor(getResources().getColor(R.color.gris));
                    bp++;
                }
            }
        });

        nayan.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer nayan) {
                // Do something when media player end playing
                playb.setAlpha(255);
                playb.setEnabled(true);
                pausa.setAlpha(130);
                pausa.setEnabled(false);
                stop.setAlpha(130);
                stop.setEnabled(false);
                naa.setAlpha(130);
                ana.setAlpha(130);
                getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

                if (bypass.isChecked()) {
                    bypass.setChecked(false);
                    bypass.setTextColor(getResources().getColor(R.color.gris));
                    bp++;
                }
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        //////▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄////////


        ////////////////////////// P A U S A ///////////////////////////////

      ///////////////////////////////////////////////////////////////////////////////////
    }

    public void pausa(View v) {

        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);


        if(bypass.isChecked()){
            bp++;
        }

        if (naa.isShown()) {
            naa.setAlpha(100);

        }
        if (ana.isShown()) {
            ana.setAlpha(100);

        }
        if (apa.isShown()) {
            apa.setAlpha(100);

        }
        if (lia.isShown()) {
            lia.setAlpha(100);

        }
        if (fua.isShown()) {
            fua.setAlpha(100);

        }
        if (nayli.isPlaying()) {
            nayli.pause();

        }
        if (nayan.isPlaying()) {
            nayan.pause();

        }
        if (fuyna.isPlaying()) {
            fuyna.pause();

        }
        if (liyan.isPlaying()) {
            liyan.pause();

        }if (apyfu.isPlaying()) {
            apyfu.pause();

        }if (fuyan.isPlaying()) {
            fuyan.pause();

        }if (fuyli.isPlaying()) {
            fuyli.pause();

        }if (apyli.isPlaying()) {
            apyli.pause();

        }if (apyna.isPlaying()) {
            apyna.pause();

        }if (apyan.isPlaying()) {
            apyan.pause();

        }
        if(cnaylib.isPlaying()) {
            cnaylib.pause();

        } if(cnayanb.isPlaying()) {
            cnayanb.pause();

        } if(canylib.isPlaying()) {
            canylib.pause();

        }if(capylib.isPlaying()) {
            capylib.pause();

        }if(capyanb.isPlaying()) {
           capyanb.pause();

        }if(capynab.isPlaying()) {
            capynab.pause();

       }if(cfuyli.isPlaying()) {
            cfuyli.pause();

        }if(capyfu.isPlaying()) {
            capyfu.pause();

        }if(cfuyan.isPlaying()) {
            cfuyan.pause();

        }if(cfuyna.isPlaying()) {
            cfuyna.pause();
        }

        if(pausa.getAlpha() == 255){
            playb.setAlpha(130);

        }if(playb.getAlpha() == 255){
            pausa.setAlpha(130);
        }

                if(apyfu.isPlaying() || apyan.isPlaying() || apyna.isPlaying() || apyli.isPlaying() || liyan.isPlaying()
                || nayan.isPlaying() || nayli.isPlaying() || fuyan.isPlaying() || fuyli.isPlaying() || fuyna.isPlaying()){
            playb.setAlpha(130);

            pausa.setAlpha(255);
            stop.setAlpha(255);

            if(pausa.getAlpha() == 255){
                playb.setAlpha(130);

            }if(playb.getAlpha() == 255){
                pausa.setAlpha(130);
            }

        }else{
            playb.setAlpha(255);
            pausa.setAlpha(130);
        }

                if(apa.isShown() || ana.isShown() || lia.isShown() || naa.isShown() || fua.isShown()){
            stop.setAlpha(255);
        }else {
            stop.setAlpha(130);

               }if(apyfu.isPlaying() || apyan.isPlaying() || apyna.isPlaying() || apyli.isPlaying() || liyan.isPlaying()
                || nayan.isPlaying() || nayli.isPlaying() || fuyan.isPlaying() || fuyli.isPlaying() || fuyna.isPlaying()){
            pausa.setEnabled(true);

                }if(apa.getVisibility() == View.INVISIBLE || ana.getVisibility() == View.INVISIBLE || naa.getVisibility() == View.INVISIBLE
                 || lia.getVisibility() == View.INVISIBLE || fua.getVisibility() == View.INVISIBLE){
            stop.setEnabled(false);
        }else{
            stop.setEnabled(true);

        }if(pausa.getAlpha() != 255){
            pausa.setEnabled(false);
        }else{
            pausa.setEnabled(true);


        } bypass.setChecked(false);
                bypass.setTextColor(getResources().getColor(R.color.gris));
        //////▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄////////

    }

    ///////////////////////////// S T O P //////////////////
    public void stop(View v) {

        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        playb.setEnabled(false);
        pausa.setEnabled(false);

        bp = 0;

                if(apa.getVisibility() == View.INVISIBLE || ana.getVisibility() == View.INVISIBLE || naa.getVisibility() == View.INVISIBLE
                || lia.getVisibility() == View.INVISIBLE || fua.getVisibility() == View.INVISIBLE){
            stop.setEnabled(false);
        }else{
            stop.setEnabled(true);
        }

        if (naa.isShown()) {
            naa.setVisibility(View.GONE);
            pna++;
        }
        if (ana.isShown()) {
            ana.setVisibility(View.GONE);
            pan++;
        }
        if (apa.isShown()) {
            apa.setVisibility(View.GONE);
            pap++;
        }
        if (lia.isShown()) {
            lia.setVisibility(View.GONE);
            pli++;
        }
        if (fua.isShown()) {
            fua.setVisibility(View.GONE);
            pfu++;

        }
        if (nayli.isPlaying()) {
            nayli.pause();

        }
        if (nayan.isPlaying()) {
            nayan.pause();

        }
        if (fuyna.isPlaying()) {
            fuyna.pause();

        }
        if (liyan.isPlaying()) {
            liyan.pause();

        }
        if (apyfu.isPlaying()) {
            apyfu.pause();

        }
        if (fuyan.isPlaying()) {
            fuyan.pause();

        }
        if (fuyli.isPlaying()) {
            fuyli.pause();

        }
        if (apyli.isPlaying()) {
            apyli.pause();

        }
        if (apyna.isPlaying()) {
            apyna.pause();

        }
        if (apyan.isPlaying()) {
            apyan.pause();

        }  if(cnaylib.isPlaying()) {
            cnaylib.pause();

        } if(canylib.isPlaying()) {
            canylib.pause();

        } if(cnayanb.isPlaying()) {
            cnayanb.pause();

        }if(capylib.isPlaying()) {
            capylib.pause();

        }if(capynab.isPlaying()) {
            capynab.pause();

        }if(capyanb.isPlaying()) {
            capyanb.pause();

        }if(cfuyli.isPlaying()) {
            cfuyli.pause();

        }if(capyfu.isPlaying()) {
            capyfu.pause();

        }if(cfuyan.isPlaying()) {
            cfuyan.pause();

        }if(cfuyna.isPlaying()) {
            cfuyna.pause();

        }if (ana.isShown()) {
            visan++;
            ana.setVisibility(View.GONE);

        }
        if (naa.isShown()) {
            pna++;
            naa.setVisibility(View.GONE);

        }
        if (apa.isShown()) {
            pap++;
            apa.setVisibility(View.GONE);

        }
        if (fua.isShown()) {
            pfu++;
            fua.setVisibility(View.GONE);

        }
        if (lia.isShown()) {
            pli++;
            lia.setVisibility(View.GONE);
        }

        apyli.seekTo(0);
        capylib.seekTo(0);

        nayan.seekTo(0);
        cnayanb.seekTo(0);

        apyan.seekTo(0);
        capyanb.seekTo(0);

        fuyna.seekTo(0);
        fuyan.seekTo(0);

        nayli.seekTo(0);
        cnaylib.seekTo(0);

        liyan.seekTo(0);
        canylib.seekTo(0);

        apyfu.seekTo(0);
        capyfu.seekTo(0);

        fuyna.seekTo(0);
        cfuyna.seekTo(0);

        fuyan.seekTo(0);
        cfuyan.seekTo(0);

        fuyli.seekTo(0);
        cfuyli.seekTo(0);

        ap.setAlpha(255);
         an.setAlpha(255);
         li.setAlpha(255);
         na.setAlpha(255);
         fu.setAlpha(255);

         playb.setAlpha(130);
         pausa.setAlpha(130);

         if(apyfu.isPlaying() || apyan.isPlaying() || apyna.isPlaying() || apyli.isPlaying() || liyan.isPlaying()
         || nayan.isPlaying() || nayli.isPlaying() || fuyan.isPlaying() || fuyli.isPlaying() || fuyna.isPlaying()){
             playb.setAlpha(130);

             pausa.setAlpha(255);
             stop.setAlpha(255);

         }if(apa.isShown() == false & ana.isShown() == false & lia.isShown() == false
           & naa.isShown() == false & fua.isShown() == false){
             stop.setAlpha(130);
        }else {
             stop.setAlpha(255);
        }       if(apyfu.isPlaying() || apyan.isPlaying() || apyna.isPlaying() || apyli.isPlaying() || liyan.isPlaying()
                || nayan.isPlaying() || nayli.isPlaying() || fuyan.isPlaying() || fuyli.isPlaying() || fuyna.isPlaying()){
            pausa.setEnabled(true);

        }if(pausa.getAlpha() != 255){
            pausa.setEnabled(false);

        }
         bypass.setChecked(false);
        bypass.setTextColor(getResources().getColor(R.color.gris));

        //////▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄////////


    } public void bypass (View v){

        plugin.play(sound, 1, 1, 1, 0, 0);

        if(bypass.isChecked()){

            bypass.setText("CLEAN");

         if(nayli.isPlaying()){
             nayli.setVolume(0,0);
             cnaylib.setVolume(1,1);

         }if(nayan.isPlaying()){
                nayan.setVolume(0,0);
                cnayanb.setVolume(1,1);

         }if(liyan.isPlaying()){
                liyan.setVolume(0,0);
                canylib.setVolume(1,1);

         }if(apyli.isPlaying()){
                apyli.setVolume(0,0);
                capylib.setVolume(1,1);

            }if(apyna.isPlaying()){
                apyna.setVolume(0,0);
                capynab.setVolume(1,1);

            }if(apyan.isPlaying()){
                apyan.setVolume(0,0);
                capyanb.setVolume(1,1);

         }if(apyfu.isPlaying()){
                apyfu.setVolume(0,0);
                capyfu.setVolume(1,1);

         }if(fuyli.isPlaying()){
                fuyli.setVolume(0,0);
                cfuyli.setVolume(1,1);

            }if(fuyan.isPlaying()){
                fuyan.setVolume(0,0);
                cfuyan.setVolume(1,1);

            }if(fuyna.isPlaying()){
                fuyna.setVolume(0,0);
                cfuyna.setVolume(1,1);

            }

        }if(bypass.isChecked() == false){

            bypass.setText("Bypass");

            if(nayan.isPlaying()){
                nayan.setVolume(1,1);
                cnayanb.setVolume(0,0);

            } if(nayli.isPlaying()){
                nayli.setVolume(1,1);
                cnaylib.setVolume(0,0);

            }if(liyan.isPlaying()){
                liyan.setVolume(1,1);
                canylib.setVolume(0,0);

            }if(apyli.isPlaying()) {
                apyli.setVolume(1, 1);
                capylib.setVolume(0, 0);

            }if(apyna.isPlaying()) {
                apyna.setVolume(1, 1);
                capynab.setVolume(0, 0);

            }if(apyan.isPlaying()) {
                apyan.setVolume(1, 1);
                capyanb.setVolume(0, 0);

            }if(apyfu.isPlaying()){
                apyfu.setVolume(1,1);
                capyfu.setVolume(0,0);

            }if(fuyli.isPlaying()){
                fuyli.setVolume(1,1);
                cfuyli.setVolume(0,0);

            }if(fuyan.isPlaying()){
                fuyan.setVolume(1,1);
                cfuyan.setVolume(0,0);

            }if(fuyna.isPlaying()){
                fuyna.setVolume(1,1);
                cfuyna.setVolume(0,0);

            }
            }
    }
}


