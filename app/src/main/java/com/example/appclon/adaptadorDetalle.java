package com.example.appclon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class adaptadorDetalle extends BaseAdapter {
    public ArrayList<plantilla> detalle;
    private Context context;

    public adaptadorDetalle(ArrayList<plantilla> detalle, Context context) {
        this.detalle = detalle;
        this.context = context;
    }

    @Override
    public int getCount() {
        return detalle.size();
    }

    @Override
    public Object getItem(int position) {
        return detalle.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        plantilla p = (plantilla)getItem(position);
        convertView = LayoutInflater.from(context).inflate(R.layout.detalle, null);

        ImageView img = (ImageView)convertView.findViewById(R.id.imageViewDetalle);
        TextView txtDetalle1 = (TextView)convertView.findViewById(R.id.textViewDetalle1);
        TextView txtDetalle2 = (TextView)convertView.findViewById(R.id.textViewDetalle2);
        TextView txtDetalle3 = (TextView)convertView.findViewById(R.id.textViewDetalle3);


        img.setImageResource(p.portadaImg);
        txtDetalle1.setText(p.TituloCancion);
        txtDetalle2.setText(p.cantante);
        txtDetalle3.setText(String.valueOf(p.duracion));
        return convertView;
    }
}
