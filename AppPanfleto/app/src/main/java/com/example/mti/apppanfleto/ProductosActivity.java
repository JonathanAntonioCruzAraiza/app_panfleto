package com.example.mti.apppanfleto;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProductosActivity extends AppCompatActivity {

    TextView tvContenido;
    ImageView ivContenido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        setContentView(R.layout.activity_productos);


        tvContenido =(TextView)findViewById(R.id.tvContenido);
        ivContenido =(ImageView) findViewById(R.id.ivContenido);
        ArrayList<String> contenido = new ArrayList<String>();
        contenido.add(getResources().getString(R.string.tema_conten));
        contenido.add(getResources().getString(R.string.activs_didec));
        contenido.add(getResources().getString(R.string.eval_usuario));
        contenido.add(getResources().getString(R.string.progress_usuario));
        final Intent intent = getIntent();
        int posicion = intent.getIntExtra("OPCION",0);
        tvContenido.setText(contenido.get(posicion));

        switch (posicion){
            case 0 :
            ivContenido.setImageResource(R.drawable.historia_aguilas_80s);
            break;
            case 1 :
                ivContenido.setImageResource(R.drawable.logo_cub_america);
                break;
            case 2 :
                ivContenido.setImageResource(R.drawable.ic_launcher_background);
                break;
            case 3 :
                ivContenido.setImageResource(R.drawable.ic_launcher_background);
                break;

        }
    }
}
