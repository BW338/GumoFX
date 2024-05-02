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

public class lighthouse extends AppCompatActivity {

    ImageView a, n, an, pb, lighthouse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lighthouse);

        setTitle("Lighthouse \uD83C\uDF0A");

        n = findViewById(R.id.a);
        an = findViewById(R.id.an);
        pb = findViewById(R.id.pb);
        a = findViewById(R.id.a);

        ///opciones de la parte inferior///

        Animation aparecer = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.aparecer);
        a.startAnimation(aparecer);
        n.startAnimation(aparecer);
        an.startAnimation(aparecer);
        pb.startAnimation(aparecer);


        Toast.makeText(this,"Preciona LIGHTHOUSE para acceder a los seteos", Toast.LENGTH_LONG).show();

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
    public void lapocalipsis(View view){

        Intent loverdrive = new Intent(this, overdrive.class);
        startActivity(loverdrive);

    }public void lnautilus(View view){

        Intent lnautilus = new Intent(this, Nautilus.class);
        startActivity(lnautilus);

    }public void landromeda(View view){

        Intent landromeda = new Intent(this, andromeda.class);
        startActivity(landromeda);

    }public void lpedalboard(View view) {

        Intent lpedalboard = new Intent(this, box.class);
        startActivity(lpedalboard);

    }public void fuzzilla(View view) {

            Intent f = new Intent(this, fuzzilla.class);
            startActivity(f);


    }public void lseteos(View view){
        Intent lseteos = new Intent(this, lseteos.class);
        startActivity(lseteos);

    }public void s(View view) {

        Intent s = new Intent(this, saturno.class);
        startActivity(s);

    }
    }
