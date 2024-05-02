package gcom.example.gumoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.gumoc.R;

public class andromeda extends AppCompatActivity {

    ImageView a, l, pb,n,f,s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andromeda);

        setTitle("Andromeda \uD83D\uDE80");

        a = findViewById(R.id.a);
        l = findViewById(R.id.l);
        n = findViewById(R.id.n);
        pb = findViewById(R.id.pb);

        ///opciones de la parte inferior///

        Animation aparecer = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.aparecer);
        a.startAnimation(aparecer);
        l.startAnimation(aparecer);
        n.startAnimation(aparecer);
        pb.startAnimation(aparecer);


        Toast.makeText(this,"Preciona el Andromeda para acceder a los seteos", Toast.LENGTH_LONG).show();


    }
    ///// F U N C I O N E S  DEL MENU BARRA SUPERIOR (TOOLBAR)
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow, menu);
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
        }
        return true;

    }

    public void anapocalipsis(View view){

        Intent napocalipsis = new Intent(this, overdrive.class);
        startActivity(napocalipsis);

    }public void anlighthouse(View view){

        Intent nlighthouse = new Intent(this, lighthouse.class);
        startActivity(nlighthouse);

    }public void annautilus(View view){

        Intent nnautilus = new Intent(this, Nautilus.class);
        startActivity(nnautilus);

    }public void anpedalboard(View view){

        Intent anpedalboard = new Intent(this, box.class);
        startActivity(anpedalboard);


    }public void anreverb(View view){

        Intent anreverb = new Intent(this, reverb.class);
        startActivity(anreverb);

    }public void fuzzilla(View view) {

        Intent f = new Intent(this, fuzzilla.class);
        startActivity(f);

    }public void s(View view) {

        Intent s = new Intent(this, saturno.class);
        startActivity(s);

    }
}

