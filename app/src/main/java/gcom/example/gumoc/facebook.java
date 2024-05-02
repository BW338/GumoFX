package gcom.example.gumoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.gumoc.R;

public class facebook extends AppCompatActivity {

    WebView facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.fb3);
        setTitle("Facebook");

        facebook = findViewById(R.id.face);

        facebook.getSettings().setBuiltInZoomControls(true);
        facebook.getSettings().setSupportZoom(true);
        facebook.saveState(savedInstanceState);
        facebook.getSettings().setJavaScriptEnabled(true);



        facebook.setWebViewClient(new WebViewClient());
        facebook.loadUrl("https://www.facebook.com/gumofx");


    ///// F U N C I O N E S  DEL MENU BARRA SUPERIOR (TOOLBAR)
}public boolean onCreateOptionsMenu(Menu menu){
    getMenuInflater().inflate(R.menu.menu_redes, menu);
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

    }if (id == R.id.pedalboard){
            Intent p = new Intent(this, box.class);
            startActivity(p);
        }
    return true;
}
}