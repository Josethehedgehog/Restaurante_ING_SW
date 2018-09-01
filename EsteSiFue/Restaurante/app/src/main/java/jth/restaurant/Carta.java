package jth.restaurant;

import android.app.ListActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
public class Carta extends ListActivity {

    String[] list = new String[]{"Entradas","Platos Fuertes","Bebidas","Snacks",} ;
    ListView vista = null;
    ListAdapter acoplar = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carta);
        vista = (ListView)findViewById(android.R.id.list);
        acoplar = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        vista.setAdapter(acoplar);
        vista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent i = new Intent(view.getContext(), Entradas.class);
                    startActivity(i);
                }
                if (position == 1){
                    Intent i = new Intent(view.getContext(), PlatosFuertes.class);
                    startActivity(i);
                }
                if (position == 2){
                    Intent i = new Intent(view.getContext(), Bebidas.class);
                    startActivity(i);
                }
                if (position == 3){
                    Intent i = new Intent(view.getContext(), Postres.class);
                    startActivity(i);
                }


            }
        });
    }

    protected void onListItemClick (ListView l, View v, int position, Long id){
        Toast.makeText(this, list[position], Toast.LENGTH_SHORT).show();
    }
}