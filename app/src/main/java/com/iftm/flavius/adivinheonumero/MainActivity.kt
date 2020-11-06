package com.iftm.flavius.adivinheonumero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val numero = Random(1).nextInt(100)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun verificar(view: View) {
        val palpite:Int = id_palpite.text.toString().toInt();

        if (palpite==numero){
            Toast.makeText(this,"Acertou!! Miseravi!!",Toast.LENGTH_SHORT).show();
        }else
            if (palpite> numero){
                Toast.makeText(this,"MAis Pra Cima Amor!!!",Toast.LENGTH_SHORT).show();
            }else
                Toast.makeText(this,"Mais Pra Baixo Amorzinho!!!!",Toast.LENGTH_SHORT).show();
    }
}