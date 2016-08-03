package com.example.marcosf.capitulo7_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;

/**
 * Created by marcosf on 26/07/2016.
 */
public class ImagemAdapter extends BaseAdapter {

    private Context context;
    private final int[] imagens;


    public ImagemAdapter(Context c, int[] imagens) {
        this.context = c;
        this.imagens = imagens;
    }

    @Override
    public int getCount() {
        return imagens.length;
    }

    @Override
    public Object getItem(int position) {
        return imagens[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Infla a view que est´´a no xml
        View view = LayoutInflater.from(this.context).inflate(R.layout.adapter_planeta, parent, false);

        ImageView img = (ImageView) view.findViewById(R.id.imgPlaneta);
        img.setImageResource((imagens[position]));

        return view;
    }
}
