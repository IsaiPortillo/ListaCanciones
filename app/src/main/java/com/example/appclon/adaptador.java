package com.example.appclon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class adaptador extends BaseAdapter {
    public ArrayList<plantillaMenu> dato1;
    private Context context;



    public adaptador(ArrayList<plantillaMenu> dato1, Context context) {
        this.dato1 = dato1;
        this.context = context;
    }

    @Override
    public int getCount() {
        return dato1.size();
    }

    @Override
    public Object getItem(int position) {
        return dato1.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        plantillaMenu p = (plantillaMenu)getItem(position);
        convertView = LayoutInflater.from(context).inflate(R.layout.itemlistview, null);

        ImageView im = (ImageView)convertView.findViewById(R.id.imageView);
        TextView txt1 = (TextView)convertView.findViewById(R.id.textView);
        TextView txt2 =(TextView)convertView.findViewById(R.id.textView2);
        im.setImageResource(p.img);
        txt1.setText(p.Descripcion);
        txt2.setText(p.tipo);
        return convertView;
    }
}
