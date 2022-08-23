package com.example.multimidiasons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.media.MediaPlayer

class SonsAudioActivity : AppCompatActivity() {
    var cow: MediaPlayer? = null
    var dog: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sons_audio)
        //COLOCANDO SOM NA VARIAVEL
        cow = MediaPlayer.create(this,R.raw.vaca_mugindo)
        dog = MediaPlayer.create(this,R.raw.dog)
    }
    //FUNÇÃO QUE VERIFICA SE TEM ALGO EM EXECUÇÃO, E FINALIZADO E EXECUTA O SOM DA VACA
    fun soundCow(view: View){
        if (cow!!.isPlaying()){
            cow!!.stop()
            cow!!.prepare()
        }
        if (dog!!.isPlaying()){
            dog!!.stop()
            dog!!.prepare()
        }
        cow!!.start()
    }
    //FUNÇÃO QUE VERIFICA SE TEM ALGO EM EXECUÇÃO, E FINALIZADO E EXECUTA O SOM DA VACA
    fun soundDog(view: View){
        if (dog!!.isPlaying()){
            dog!!.stop()
            dog!!.prepare()
        }
        if (cow!!.isPlaying()){
            cow!!.stop()
            cow!!.prepare()
        }
        dog!!.start()
    }
}