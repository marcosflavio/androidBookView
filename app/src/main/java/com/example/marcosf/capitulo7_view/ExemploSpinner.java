package com.example.marcosf.capitulo7_view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

/**
 * Created by marcosf on 25/04/2016.
 */
public class ExemploSpinner extends AppCompatActivity {

    //Planetas
    private int [] imagens = {R.drawable.jupiter,R.drawable.marte, R.drawable.mercurio, R.drawable.netuno, R.drawable.saturno
    , R.drawable.terra, R.drawable.urano, R.drawable.venu};

    private String [] planetas= new String[]{"Júpiter","Marte", "Mercúrio", "Netuno", "Saturno", "Terra", "Urano", "Venûs"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exemplo_spinner);
        final ImageView imagem = (ImageView) findViewById(R.id.imagePlanetas);
        final Spinner combo = (Spinner) findViewById(R.id.comboPlanetas);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, planetas);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo.setAdapter(adapter);

        //Se selecionar algum planeta atualia a imagem
        combo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Atualiza a imagem
                imagem.setImageResource(imagens[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}
