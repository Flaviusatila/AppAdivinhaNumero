package com.iftm.flavius.crudintegrador.activities

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.iftm.flavius.crudintegrador.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
          R.id.action_alteracao ->startActivity(Intent(this,AlteracaoActivity::class.java))
          R.id.action_cadastro ->startActivity(Intent(this,CadastroActivity::class.java))
          R.id.action_excluir ->startActivity(Intent(this,ExcluirActivity::class.java))
          R.id.action_lista ->startActivity(Intent(this,ListagemActivity::class.java))
          R.id.action_loguin ->startActivity(Intent(this,LoguinActivity::class.java))
        }
    return super.onOptionsItemSelected(item)
    }


}