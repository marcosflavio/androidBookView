package com.example.marcosf.capitulo7_view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by marcosf on 26/07/2016.
 */
public class ExemploListViewActivity extends Activity implements AdapterView.OnItemClickListener {

    protected static final String TAG = "livro";
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_list_view);
        //List view
        listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(new SimplesAdapter(this));
        listView.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //Objeto selecionado, que neste caso era de um array de strings
        String s = (String) parent.getAdapter().getItem(position);
        Toast.makeText(this,"Texto Selecionado: " + s + ", posição: " + position,Toast.LENGTH_SHORT).show();
    }
}
