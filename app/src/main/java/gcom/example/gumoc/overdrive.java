package gcom.example.gumoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.gumoc.R;

public class overdrive extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overdrive);

        setTitle("Apocalipsis \uD83D\uDC80");
        Toast.makeText(this,"Preciona el Apocalipsis para acceder a los seteos", Toast.LENGTH_LONG).show();


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

    }public void aseteos(View view){
        Intent apocalipsis = new Intent(this, apocalipsis.class);
        startActivity(apocalipsis);

    }public void s(View view) {

        Intent s = new Intent(this, saturno.class);
        startActivity(s);

    }
}