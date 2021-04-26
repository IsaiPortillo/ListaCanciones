package com.example.appclon;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class detalleMenu extends AppCompatActivity {
    public ArrayList<plantilla> datos;
    public ListView lista;
    public Dialog pop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_menu);

        datos = new ArrayList<plantilla>();

        lista = (ListView)findViewById(R.id.listaDetalle);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        String parametro = b.getString("TIPO");

        cargarDatos(parametro);

        pop = new Dialog(this);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                plantilla modelo = datos.get(position);

                pop.setContentView(R.layout.pop_up);

                TextView txt1 = (TextView)pop.findViewById(R.id.textView3Pop);
                TextView txt2 = (TextView)pop.findViewById(R.id.textView6Pop);
                TextView txt3 = (TextView)pop.findViewById(R.id.textView7Pop);
                ImageView img = (ImageView)pop.findViewById(R.id.imageViewPop);
                Button btn = (Button) pop.findViewById(R.id.buttonPop);
                txt1.setText(modelo.TituloCancion);
                img.setImageResource(modelo.portadaImg);
                txt2.setText(modelo.cantante);
                txt3.setText(modelo.duracion);
                pop.show();
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        pop.dismiss();
                    }
                });
            }
        });
    }

    public  void cargarDatos(String tipo){

        Toast.makeText(getApplicationContext(), "Estas Escuchando: "+tipo, Toast.LENGTH_SHORT).show();
        if (tipo.equals("Favoritos")){
            datos.add(new plantilla("LA NOCHE DE ANOCHE", "BAD BUNNY x ROSALÍA", "3 Minutos", R.drawable.img1));
            datos.add(new plantilla("Dákiti", "Bad Bunny x Jhay Cortez", "3 Minutos", R.drawable.img1));
            datos.add(new plantilla("YO VISTO ASÍ", "Bad Bunny", "3.40 Minutos", R.drawable.img1));
            datos.add(new plantilla("Como Antes", "Bad Bunny", "4.30 Minutos" , R.drawable.img2));
            datos.add(new plantilla("RLNDT", "Bad Bunny", "5.50 Minutos" , R.drawable.img2));
            datos.add(new plantilla("NI BIEN NI MAL", "Bad Bunny", "2.50 Minutos" , R.drawable.img2));
        }

        adaptadorDetalle apd = new adaptadorDetalle(datos, getApplicationContext());
        lista.setAdapter(apd);


    }


}