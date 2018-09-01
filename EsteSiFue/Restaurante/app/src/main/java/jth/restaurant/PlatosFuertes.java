package jth.restaurant;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ListView;

import java.util.ArrayList;

public class PlatosFuertes extends Activity {
    private ListView lvItems;
    private Adaptador adaptador;
    ArrayList<Entidad> lista = new ArrayList<>();
    Entidad item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_platos_fuertes);

        lvItems = (ListView)findViewById(R.id.lv_itemsPlatosFuertes);

        item = new Entidad("Sancocho..........$18.000", "Cargado con diferentes ingredientes");
        lista.add(item);
        item = new Entidad("Filete de Res.......$15.000", "Acompañado de papas a la francesa y ensalada");
        lista.add(item);
        item = new Entidad("Opcion del dia.........$15.000", "Pregunte al mesero!");
        lista.add(item);

        adaptador = new Adaptador(lista, this);
        lvItems.setAdapter(adaptador);
    }

}
