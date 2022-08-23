package com.example.multimidiasons
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_animation.*

class AnimationActivity : AppCompatActivity() {
    //ARRANJO COM AS ANIMAÇÕES
    internal var animations = arrayOf(
        "Fade In",
        "Fade Out",
        "Zoom In",
        "Zoom Out",
        "Blink",
        "Rotate",
        "Move",
        "Slide Up",
        "Slide Down",
        "Bounce"
    )
    //FOI CRIADO UMA PASTA ANIM, É REFERENCIADO DE LÁ
    internal var animationIDs = intArrayOf(
        R.anim.fade_in,
        R.anim.fade_out,
        R.anim.zoom_in,
        R.anim.zoom_out,
        R.anim.blink,
        R.anim.rotate,
        R.anim.move,
        R.anim.slide_up,
        R.anim.slide_down,
        R.anim.bounce
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)
        lv.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, animations)
        //INICIA A ANIMAÇÃO
        lv.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val animation = AnimationUtils.loadAnimation(
                this,
                animationIDs[position]
            )
            tv.startAnimation(animation)
        }
    }
}