package com.example.marcosf.capitulo7_view;

import android.app.Activity;
import android.nfc.Tag;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.marcosf.capitulo7_view.model.Planetas;

import java.util.List;

/**
 * Created by marcosf on 26/07/2016.
 */
public class ExemploListViewActivityCustomizada extends Activity implements AdapterView.OnItemClickListener {

    protected static final String TAG = "livro";
    private ListView listView;
    private List<Planetas> planetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_list_view_customizado);
        //ListView
        listView = (ListView) findViewById(R.id.listviewcustomizada);
        planetas = Planetas.getPlanetas();
        listView.setAdapter(new PlanetaAdapter(this,planetas));
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Planetas p = this.planetas.get(position);
        Toast.makeText(this, "Planeta: " + p.nome, Toast.LENGTH_SHORT).show();
    }
}
