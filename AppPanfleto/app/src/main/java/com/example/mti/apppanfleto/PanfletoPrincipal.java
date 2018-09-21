package com.example.mti.apppanfleto;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * @author Jonathan Anotonio Cruz Araiza
 * @version 1.0
 * @
 */

public class PanfletoPrincipal extends AppCompatActivity {

    /**Constante que alamacenan el valor OPCION**/
    private final String OPCION = "OPCION";
    private final int    ZERO   =  0;
    private final int    UNO    =  1;
    private final int    DOS    =  2;
    private final int    TRES   =  3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panfleto_principal);
        ListView  listView;
        ArrayAdapter <String> adapter;
        listView = (ListView)findViewById(R.id.list_item);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);

        listView.setAdapter(adapter);
        adapter.add(getResources().getString(R.string.historia));
        adapter.add(getResources().getString(R.string.calendario));
        adapter.add(getResources().getString(R.string.Productos));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int option = position;
                Intent intent  = new Intent(PanfletoPrincipal.this,ProductosActivity.class);
                Intent calendario  = new Intent(PanfletoPrincipal.this,CalendarioActivity.class);
                Intent productos  = new Intent(PanfletoPrincipal.this,ProductActivity.class);
                switch (option){
                    case ZERO:
                        intent.putExtra(OPCION,option);
                        startActivity(intent);

                    break;
                    case UNO:
                        intent.putExtra(OPCION,option);
                        startActivity(calendario);

                    break;
                    case DOS:
                        intent.putExtra(OPCION,option);
                        startActivity(productos);
                        break;

                    case TRES:
                        intent.putExtra(OPCION,option);
                        startActivity(intent);
                        break;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent  = new Intent(PanfletoPrincipal.this,ProductosActivity.class);
        Intent calendario  = new Intent(PanfletoPrincipal.this,CalendarioActivity.class);
        Intent productos  = new Intent(PanfletoPrincipal.this,ProductActivity.class);

        switch (item.getItemId()){
            case R.id.itemtemas:
                intent.putExtra(OPCION,ZERO);
                startActivity(intent);
                return true;
            case R.id.itemEval:
                startActivity(productos);
                return true;
            case R.id.itemActivs:
                intent.putExtra(OPCION,DOS);
                startActivity(calendario);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
