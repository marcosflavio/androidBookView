package com.example.marcosf.capitulo7_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.marcosf.capitulo7_view.model.Planetas;

import java.util.List;

/**
 * Created by marcosf on 26/07/2016.
 */
public class PlanetaAdapter extends BaseAdapter{
    private final Context context;
    private final List<Planetas> planetas;

    public PlanetaAdapter(Context context, List<Planetas>planetas){

        this.planetas = planetas;
        this.context = context;

    }

    @Override
    public int getCount() {
        return planetas != null ? planetas.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return planetas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Infla a view
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_planeta,parent,false);
        //Faz findById das views que precisa atualizar
        TextView t = (TextView) view.findViewById(R.id.tNomePlaneta);
        ImageView img = (ImageView) view.findViewById(R.id.imgPlaneta);
        //Atualiza os valores das views
        Planetas planeta = planetas.get(position);
        t.setText(planeta.nome);
        img.setImageResource(planeta.img);

        //retorna a view desse planeta
        return view;
    }
}
