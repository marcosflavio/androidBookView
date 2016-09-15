package com.example.marcosf.capitulo7_view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;


/**
 * Created by marcosf on 23/04/2016.
 */
public class ExemploAutoCompleteTextViewActivity extends AppCompatActivity {

    private static final String[] ESTADOS = new String[]{"Acre", "Alagoas", "Amapá", "Amazonas"
    ,"Bahia", "Ceará", "Distrito Federal", "Espiríto Santo", "Goiás", "Maranhão", "Mato Grosso"
    ,"Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Pernambuco","Piauí","Rio de Janeiro",
    "Rio grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina",
    "São Paulo", "Sergipe", "Tocantins"};

//ll
    @Override
    protected void onCreate(Bundle iCicle) {
        super.onCreate(iCicle);
        setContentView(R.layout.exemplo_auto_complete_text_view);
        AutoCompleteTextView estados = (AutoCompleteTextView) findViewById(R.id.estados);

            //Adapter para preencher com os estados
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, ESTADOS);
        estados.setAdapter(adapter);







    }
}
