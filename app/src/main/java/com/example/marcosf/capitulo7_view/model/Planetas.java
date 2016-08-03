package com.example.marcosf.capitulo7_view.model;

import com.example.marcosf.capitulo7_view.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marcosf on 26/07/2016.
 */
public class Planetas {

    public String nome;
    public int img; // R.drawble.xxx

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Planetas(String nome, int img){

        this.nome = nome;
        this.img = img;
    }

    public static List<Planetas> getPlanetas(){
        List<Planetas> planetas = new ArrayList<Planetas>();
        planetas.add(new Planetas("Mercúrio", R.drawable.mercurio));
        planetas.add(new Planetas("Vênus", R.drawable.venu));
        planetas.add(new Planetas("Terra", R.drawable.terra));
        planetas.add(new Planetas("Marte", R.drawable.marte));
        planetas.add(new Planetas("Júpiter", R.drawable.jupiter));
        planetas.add(new Planetas("Saturno", R.drawable.saturno));
        planetas.add(new Planetas("Urano", R.drawable.urano));
        planetas.add(new Planetas("Netuno", R.drawable.netuno));
        planetas.add(new Planetas("Plutão", R.drawable.smile));

        return  planetas;
    }
}
