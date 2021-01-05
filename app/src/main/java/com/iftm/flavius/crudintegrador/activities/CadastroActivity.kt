package com.iftm.flavius.crudintegrador.activities

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.iftm.flavius.crudintegrador.R
import com.iftm.flavius.crudintegrador.dto.UserDTO
import com.iftm.flavius.crudintegrador.service.RetrofitService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
    }


    fun cadastrar(view: View?) {
        val nome = (findViewById<EditText>(R.id.et_cadastro_nome)).text.toString()
        val telefone = (findViewById<EditText>(R.id.et_cadastro_phone)).text.toString()
        val email = (findViewById<EditText>(R.id.et_cadastro_email)).text.toString()
        val senha = (findViewById<EditText>(R.id.et_cadastro_password)).text.toString()

        var user: UserDTO = UserDTO(email, nome, senha, telefone)

        RetrofitService().api?.cadastroUsuario(user)?.enqueue(object : Callback<UserDTO?> {
            override fun onResponse(call: Call<UserDTO?>, response: Response<UserDTO?>) {
                if (response.code() == 200){
                    Toast.makeText(this@CadastroActivity,"Usuario Cadastrado com Sucesso",Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this@CadastroActivity,"Erro ao Cadastrar Usuario",Toast.LENGTH_LONG).show()
                }
            }

            override fun onFailure(call: Call<UserDTO?>, t: Throwable) {
                Log.e("Erro", "************** erro **********\n"+t?.message.toString())
            }

        })
    }
}




