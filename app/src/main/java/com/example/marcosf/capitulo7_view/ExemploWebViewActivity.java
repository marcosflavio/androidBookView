package com.example.marcosf.capitulo7_view;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by marcosf on 26/07/2016.
 */
public class ExemploWebViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_webview);
        final WebView webView = (WebView) findViewById(R.id.webview);
        final View progress = (findViewById(R.id.progress));
        progress.setVisibility(View.INVISIBLE);
        webView.loadUrl("http://www.livroandroid.com.br");
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                //Pagina começou a ser carregada
                progress.setVisibility(View.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                //Página foi carregada
                progress.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                //Erro ao carregar a página do WebView (endereço errado, erro de conexao)
                super.onReceivedError(view, request, error);
            }
        });
    }
}
