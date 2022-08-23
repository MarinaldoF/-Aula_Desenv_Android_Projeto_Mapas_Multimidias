package com.example.multimidiasons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_usando_web_view.*

class usandoWebViewActivity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usando_web_view)

        webview!!.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                // IF QUE VERIFICA SE URL É NULA
                if (url != null) {
                    view?.loadUrl(url)
                }
                return true
            }
        }
        //COLOCANDO O JABASCRIPT
        webview!!.getSettings().setJavaScriptEnabled(true)
        //COLOCANDO O URL NA WEBVIEW
        webview!!.loadUrl("https://www.fiap.com.br/")
    }
}