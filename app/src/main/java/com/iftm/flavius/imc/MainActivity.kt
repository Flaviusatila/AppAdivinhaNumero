package com.iftm.flavius.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcular(view: View) {
        val p: Double = (peso.text.toString().toDouble())
        val a: Double = (altura.text.toString().toDouble())
        val imc: Double = p/(a*a)
        valorImc.text = imc.toString()
        Toast.makeText(this, "Imc Calculado com sucesso", Toast.LENGTH_LONG).show();

    }
}