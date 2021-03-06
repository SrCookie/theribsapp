package com.theribssh.www;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by biiac on 23/10/2017.
 */

public class NossosRestaurantesAdapter extends BaseAdapter {

    private final List<NossosRestaurantesListView> nossos_rest;
    private final Activity activity;

    public NossosRestaurantesAdapter(List<NossosRestaurantesListView> nossos_rest, Activity activity){
        this.nossos_rest = nossos_rest;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return nossos_rest.size();
    }

    @Override
    public Object getItem(int position) {
        return nossos_rest.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        NossosRestaurantesListView nossos_restaurantes = nossos_rest.get(position);

        View view = activity.getLayoutInflater().inflate(R.layout.list_view_nossos_restaurantes, parent, false);

        TextView unidade_restaurante = (TextView)view.findViewById(R.id.text_view_unidade_restaurante);
        unidade_restaurante.setText(nossos_restaurantes.getUnidade_restaurante());

        TextView endereco_restaurante = (TextView)view.findViewById(R.id.text_view_endereco_restaurante);
        endereco_restaurante.setText(nossos_restaurantes.getEndereco_restaurante());

        TextView desc_restaurante = (TextView)view.findViewById(R.id.text_view_desc_restaurante);
        desc_restaurante.setText(nossos_restaurantes.getDesc_restaurante());

        ImageView foto_restaurante = (ImageView)view.findViewById(R.id.image_view_restaurante);

        //Guardando o nome da imagem
        String nameImage = nossos_restaurantes.getFoto_restaurante();

        try {
            //Colocando Imagem de fundo
            Glide.with(view).load(String.format("%s%s", activity.getResources().getString(R.string.url_serverFotoFuncionario), nameImage)).thumbnail(Glide.with(view).load(R.drawable.loading)).into(foto_restaurante);

        }catch (Exception e){
            e.printStackTrace();
        }


        return view;
    }
}
