package com.example.multimidiasons
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class RecuperaFotosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recupera_fotos)
        //BUSCANDO PELO ID
        var textView1 = findViewById<TextView>(R.id.textView1)
        var imageView1 = findViewById<ImageView>(R.id.imageView1)
        var textView2 = findViewById<TextView>(R.id.textView2)
        var imageView2 = findViewById<ImageView>(R.id.imageView2)
        var textView3 = findViewById<TextView>(R.id.textView3)
        var imageView3 = findViewById<ImageView>(R.id.imageView3)
        var textView4 = findViewById<TextView>(R.id.textView4)
        var imageView4 = findViewById<ImageView>(R.id.imageView4)
        var textView5 = findViewById<TextView>(R.id.textView5)
        var imageView5 = findViewById<ImageView>(R.id.imageView5)
        var textView6 = findViewById<TextView>(R.id.textView6)
        var imageView6 = findViewById<ImageView>(R.id.imageView6)

        //ARRANJO COM OS RESPECTIVOS ANIMAIS
        var animais = arrayOf("Leão", "Pinguim", "Urso", "Girafa", "Tigre", "Rato")
        //COLOCANDO CADA ANIMAL EM SUA POSIÇÃO NO TEXTO
        textView1.text = animais[0]
        textView2.text = animais[1]
        textView3.text = animais[2]
        textView4.text = animais[3]
        textView5.text = animais[4]
        textView6.text = animais[5]

        //COLOCANDO O LINK NAS VARIÁVEIS
        var i1 = "https://www.infoescola.com/wp-content/uploads/2017/04/leao-126767138.jpg"
        var i2 = "https://www.infoescola.com/wp-content/uploads/2010/11/pinguim-real_103683425.jpg"
        var i3 = "https://ichef.bbci.co.uk/news/640/cpsprodpb/14A4B/production/_123355548_273225536_5387239747969927_3174953441515970260_n.jpg"
        var i4 = "https://www.infoescola.com/wp-content/uploads/2008/04/girafa-336x450.jpg"
        var i5 = "https://www.cnnbrasil.com.br/wp-content/uploads/sites/12/2021/12/tigrenaples.jpg?w=1024"
        var i6 = "https://www.biomax-mep.com.br/wp-content/uploads/2017/09/ratazana-rato-diferenca.jpeg"
        //IMAGENS DENTO DE UM IMAGEVIEW
        Glide.with(this).load(i1).into(imageView1)
        Glide.with(this).load(i2).into(imageView2)
        Glide.with(this).load(i3).into(imageView3)
        Glide.with(this).load(i4).into(imageView4)
        Glide.with(this).load(i5).into(imageView5)
        Glide.with(this).load(i6).into(imageView6)
    }

}