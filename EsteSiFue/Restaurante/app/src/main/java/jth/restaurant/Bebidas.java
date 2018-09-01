package jth.restaurant;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ListView;

import java.util.ArrayList;

public class Bebidas extends Activity {
    private ListView lvItems;
    private Adaptador adaptador;
    ArrayList<Entidad> lista = new ArrayList<>();
    Entidad item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebidas);

        lvItems = (ListView)findViewById(R.id.lv_itemsBebidas);

        item = new Entidad("Gaseosa.....$3.000", "Solo productos Postobon");
        lista.add(item);
        item = new Entidad("Limonadas...........$4.500", "Limon, Cerezada, Lulada");
        lista.add(item);

        adaptador = new Adaptador(lista, this);
        lvItems.setAdapter(adaptador);
    }

}
