package com.example.marcosf.capitulo7_view;

import android.nfc.Tag;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by marcosf on 24/04/2016.
 */
public class ExemploCheckRadioForm extends AppCompatActivity {
    private static final String TAG = "livro";

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exemplo_check_radio_form);
        final EditText textNome = (EditText) findViewById(R.id.textNome);
        final RadioGroup group = (RadioGroup) findViewById(R.id.group1);

        if (group != null) {
            group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){

                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    boolean sim = R.id.radioSim == checkedId;
                    boolean nao = R.id.radioNao == checkedId;
                    if(sim){
                        Log.i(TAG, "Marcou radio Sim: " + checkedId);
                    } else if(nao){
                        Log.i(TAG, "Marcou radio Não: " + checkedId);
                    }
                }
            });

            final CheckBox check = (CheckBox) findViewById(R.id.checkReceberEmail);
            //Define um listener para executar quando alterar o check
            if (check != null) {
                check.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener(){

                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        Log.i(TAG, "check: " + isChecked);
                    }
                });

                Button b = (Button) findViewById(R.id.buttonEnviar);

                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.i(TAG, "OK");
                        //Compara o id do radioSim
                        boolean concorda = R.id.radioSim == group.getCheckedRadioButtonId();
                        boolean receberEmail = check.isChecked();
                        StringBuffer sb = new StringBuffer();
                        sb.append("Nome: ").append(textNome.getText()).append("\nReceber Email: ").append(receberEmail ? "Sim":"Não")
                                .append("\nConcorda: ").append(concorda ? "Sim" : "Não");

                        Toast.makeText(ExemploCheckRadioForm.this, sb.toString(), Toast.LENGTH_SHORT).show();

                    }
                });
            }
        }


    }
}
