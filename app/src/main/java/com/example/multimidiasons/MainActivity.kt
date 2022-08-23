package com.example.multimidiasons
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //FUNÇÃO PARA ACESSAR AREA
    fun usandoWebView(view: View){
        val intent = Intent(this, usandoWebViewActivity::class.java)
        startActivity(intent)
    }
    //FUNÇÃO DE RECUPERAÇÃO DE FOTOS
    fun acessarRecuperacaoFotos(view: View){
        val intent = Intent(this, RecuperaFotosActivity::class.java)
        startActivity(intent)
    }
    //FUNÇÃO DE VEDEOS
    fun acessarVideo(view: View){
        val intent = Intent(this, VideoMediaPlayerActivity::class.java)
        startActivity(intent)
    }
    //FUNÇÃO QUE ACESSA A AREA DE SONS
    fun acessarSons(view: View){
        val intent = Intent(this, SonsAudioActivity::class.java)
        startActivity(intent)
    }
    //FUNÇÃO RESPONSÉVEL PELA ANIMAÇÃO
    fun acessarAnimacao(view: View){
        val intent = Intent(this, AnimationActivity::class.java)
        startActivity(intent)
    }
}