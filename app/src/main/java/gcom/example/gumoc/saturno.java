package gcom.example.gumoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.gumoc.R;

public class saturno extends AppCompatActivity {

    public ImageView a,an,ap,na,fu, saturno;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saturno);
        setTitle("Saturno\uD83D\uDEF0");

        a = findViewById(R.id.a50);
        an = findViewById(R.id.an50);
        na = findViewById(R.id.n50);
        fu = findViewById(R.id.f50);
        ap = findViewById(R.id.a50);
        saturno = findViewById(R.id.saturno);

        Toast.makeText(this, "Presiona el Saturno para acceder a los seteos.", Toast.LENGTH_SHORT).show();

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

    public void saturno(View v){
            Intent s = new Intent(this, tremolo.class);
            startActivity(s);

    }public void fuzzilla(View v){
            Intent f = new Intent(this, fuzzilla.class);
            startActivity(f);

        }public void apocalipsis(View v){
        Intent a = new Intent(this, overdrive.class);
        startActivity(a);

    }public void nautilus(View v){
        Intent n = new Intent(this, Nautilus.class);
        startActivity(n);

    }public void andromeda(View v){
        Intent an = new Intent(this, andromeda.class);
        startActivity(an);

    }public void lighthouse(View v){
        Intent l = new Intent(this, lighthouse.class);
        startActivity(l);

    }public void box(View v){
        Intent b = new Intent(this, box.class);
        startActivity(b);
    }


    }



