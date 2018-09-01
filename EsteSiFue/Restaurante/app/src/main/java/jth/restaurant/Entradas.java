package jth.restaurant;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ListView;

import java.util.ArrayList;

public class Entradas extends Activity {
    private ListView lvItems;
    private Adaptador adaptador;
    ArrayList<Entidad> lista = new ArrayList<>();
    Entidad item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entradas);

        lvItems = (ListView)findViewById(R.id.lv_itemsEntradas);

        item = new Entidad("Palmitos de Cangrejo.........$6.000", "4 palmitos de fresco cangrejo");
        lista.add(item);
        item = new Entidad("Salchipapas.........$5000", "Papa francesa y salchicha ranchera");
        lista.add(item);

        adaptador = new Adaptador(lista, this);
        lvItems.setAdapter(adaptador);
    }

}
