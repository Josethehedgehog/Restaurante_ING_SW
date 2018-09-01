package jth.restaurant;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ListView;

import java.util.ArrayList;

public class Postres extends Activity {
    private ListView lvItems;
    private Adaptador adaptador;
    ArrayList<Entidad> lista = new ArrayList<>();
    Entidad item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postres);

        lvItems = (ListView)findViewById(R.id.lv_itemsPostres);

        item = new Entidad("Brownie..........$3.000", "Brownie Sencillo");
        lista.add(item);
        item = new Entidad("Helado...........$2.000", "Diferentes sabores a elegir");
        lista.add(item);


        adaptador = new Adaptador(lista, this);
        lvItems.setAdapter(adaptador);
    }

}
