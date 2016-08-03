package com.example.marcosf.capitulo7_view;

import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by marcosf on 25/07/2016.
 */
public class ExemploProgressDialogActivity extends Activity {


    private  static final String URL = "https://scontent-gru2-1.xx.fbcdn.net/v/t1.0-9/13620037_1463404270352007_5599516235329758740_n.jpg?oh=fffbff551cba0163c73a0b31c7fa8989&oe=58319FD2";

    //Crio o meu objeto ProgressDialog
    private ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_progress_dialog);
        //Abre a janela com a barra de progresso
        //Passo o objeto, O título do progress, A msg que será exibida, se o tempo é indeterminado, se pode ser cancelado
        dialog = ProgressDialog.show(this, "Aguarde","Buscando imagem, por favor, aguarde..",false, true);
        downloadImagem(URL);
    }

    //Método responsável por fazer o download da imagem em uma nova thread
    private void downloadImagem(final String urlImg){
        new Thread(){
            @Override
            public void run() {

                try {
                    //Faz o download da imagem
                    URL url = new URL(urlImg);
                    InputStream in = url.openStream();
                    //Converte o inputStream do java para bitmap
                    final Bitmap imagem = BitmapFactory.decodeStream(in);
                    in.close();
                    //atualiza a tela
                    atualizaImagem(imagem);
                }catch (IOException e){
                    //Uma aplicação real deveria tratar esse erro
                    e.getMessage();
                }

            }
        }.start();
    }

    //método responsável por atualizar a imagem
    private  void atualizaImagem(final Bitmap imagem ){
        runOnUiThread(new Runnable() { //Esse código é necessário, pois foi aberta uma thread
            @Override
            public void run() {
                //fecha a janela de progresso
                dialog.dismiss();
                ImageView imageView = (ImageView) findViewById(R.id.img);
                imageView.setImageBitmap(imagem);
            }
        });
    }
}
