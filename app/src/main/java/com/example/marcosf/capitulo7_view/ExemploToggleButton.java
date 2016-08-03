package com.example.marcosf.capitulo7_view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.ToggleButton;

/**
 * Created by marcosf on 24/04/2016.
 */
public class ExemploToggleButton extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exemplo_toogle_button);
        final ToggleButton tgbtn = (ToggleButton) findViewById(R.id.toggle1);
        Button btn = (Button) findViewById(R.id.btn2);
        final CheckBox check1 = (CheckBox) findViewById(R.id.checkbox1);


        if (btn != null) {
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    boolean check = check1.isChecked();
                    boolean selecionado = tgbtn.isChecked();
                    Toast.makeText(ExemploToggleButton.this, "Toggle Selecionado: " + selecionado +
                            "CheckBox1 Selecionado: " + check, Toast.LENGTH_SHORT).show();
                }
            });
        }

    }
}
