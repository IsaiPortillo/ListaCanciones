package com.example.appclon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public ArrayList<plantillaMenu> plan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView ls = (ListView)findViewById(R.id.list);

        plan = new ArrayList<plantillaMenu>();

        plan.add(new plantillaMenu("Favoritos","Lista de Favoritos", R.drawable.fav));

        adaptador ad = new adaptador(plan, this);

        ls.setAdapter(ad);

        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                plantillaMenu pl = plan.get(position);

                Intent in = new Intent(getApplicationContext(), detalleMenu.class);

                in.putExtra("TIPO", pl.tipo);

                 startActivity(in);
            }
        });




    }
}