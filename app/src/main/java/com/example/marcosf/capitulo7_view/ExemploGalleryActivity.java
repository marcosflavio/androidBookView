package com.example.marcosf.capitulo7_view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by marcosf on 26/07/2016.
 */
public class ExemploGalleryActivity extends Activity {

    //Planetas
    private int [] imagens = {R.drawable.mercurio,R.drawable.venu, R.drawable.terra,
            R.drawable.marte,R.drawable.jupiter, R.drawable.saturno,
            R.drawable.urano,R.drawable.netuno, R.drawable.smile};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_gallery);

        Gallery g = (Gallery) findViewById(R.id.gallery);
        g.setAdapter(new ImagemAdapter(this, imagens));
        g.setOnItemClickListener(onGalleryItemClick(this));

    }

    private AdapterView.OnItemClickListener onGalleryItemClick(final Context context){

        return new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Exemplo de alerta com Toast com uma view dentro
                //Geralmente o Toast é apenas um texto
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(imagens[position]);
                Toast t = new Toast(context);
                t.setView(imageView);
                t.show();
            }
        };
    }


}
