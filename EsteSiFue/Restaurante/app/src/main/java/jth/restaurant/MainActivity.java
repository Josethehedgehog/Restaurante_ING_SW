package jth.restaurant;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void B_GotoMap(View v){
        Intent mapActivity = new Intent(this,MapsActivity.class);
        startActivity(mapActivity);
    }

    public void B_GotoMenu(View view){
        Intent menuActivity = new Intent(this, Carta.class);
        startActivity(menuActivity);
    }

    public void B_Contact(View v){
        String phone = "3104146435";
        String msg = "Hola, Me gustaria hacer una reserva. Gracias";


        Uri envio = Uri.parse("smsto:" + phone);
        Intent contacto = new Intent(Intent.ACTION_SENDTO, envio);
        contacto.setPackage("com.whatsapp");
        contacto.putExtra(Intent.EXTRA_TEXT, msg);

        startActivity(Intent.createChooser(contacto, "Contactar"));
    }

}
