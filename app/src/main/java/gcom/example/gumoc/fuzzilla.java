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
import android.widget.TextView;
import android.widget.Toast;

import com.example.gumoc.R;

public class fuzzilla extends AppCompatActivity {

    TextView Nautilus;
    ImageView set1,a, l, an, pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuzzilla);
        setTitle("FUZZILLA \uD83E\uDD8E");



        a = findViewById(R.id.a);
        l = findViewById(R.id.l);
        an = findViewById(R.id.an);
        pb = findViewById(R.id.pb);

        ///opciones de la parte inferior///

        Animation aparecer = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.aparecer);
        a.startAnimation(aparecer);
        l.startAnimation(aparecer);
        an.startAnimation(aparecer);
        pb.startAnimation(aparecer);


        Toast.makeText(this,"Preciona el FUZZILLA para acceder a los seteos", Toast.LENGTH_LONG).show();


    }  ///// F U N C I O N E S  DEL MENU BARRA SUPERIOR (TOOLBAR)
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;

    } public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.ig) {
            Intent ig = new Intent(this, instagram.class);
            startActivity(ig);

        }
        if (id == R.id.fb) {
            Intent fb = new Intent(this, facebook.class);
            startActivity(fb);

        }
        if (id == R.id.yt) {
            Intent yt = new Intent(this, youtube.class);
            startActivity(yt);

        }
        if (id == R.id.Home) {
            Intent h = new Intent(this, segunda.class);
            startActivity(h);
        }
        return true;

    }
    public void fapocalipsis(View view){

        Intent napocalipsis = new Intent(this, overdrive.class);
        startActivity(napocalipsis);

    }public void flighthouse(View view){

        Intent nlighthouse = new Intent(this, lighthouse.class);
        startActivity(nlighthouse);

    }public void fandromeda(View view){

        Intent nandromeda = new Intent(this, andromeda.class);
        startActivity(nandromeda);

    }public void fpedalboard(View view){

        Intent npedalboard = new Intent(this, box.class);
        startActivity(npedalboard);


    }public void fseteos(View view){

        Intent nseteos = new Intent(this, fuzz.class);
        startActivity(nseteos);

    }public void fnautilus(View view){

        Intent fseteos = new Intent(this, Nautilus.class);
        startActivity(fseteos);

    }public void s(View view) {

        Intent s = new Intent(this, saturno.class);
        startActivity(s);

    }
}