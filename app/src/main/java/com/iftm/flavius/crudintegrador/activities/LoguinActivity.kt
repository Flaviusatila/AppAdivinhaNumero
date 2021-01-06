package com.iftm.flavius.crudintegrador.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.iftm.flavius.crudintegrador.R
import com.iftm.flavius.crudintegrador.dto.DtoLogin
import com.iftm.flavius.crudintegrador.service.RetrofitService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class LoguinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loguin)
    }

    fun login(view: View) {
        var email= (findViewById<EditText>(R.id.et_tela_login_email)).text.toString()
        var password = (findViewById<EditText>(R.id.et_tela_login_password)).text.toString()

        var login: DtoLogin = DtoLogin(email,password)

        RetrofitService().api?.login(login)?.enqueue(object : Callback<DtoLogin?>{
            override fun onFailure(call: Call<DtoLogin?>, t: Throwable) {
                Log.e("Erro", "************** erro **********\n"+t?.message.toString())
            }

            override fun onResponse(call: Call<DtoLogin?>, response: Response<DtoLogin?>) {
                if (response.code() == 200){
                    Toast.makeText(this@LoguinActivity,"Usuario Logado com Sucesso", Toast.LENGTH_LONG).show()
                    val sp = getSharedPreferences("dados", 0)
                    val editor = sp.edit()
                    editor.putString("token", response.body()?.token)
                    startActivity(Intent(this@LoguinActivity,MainActivity::class.java))

                }else{
                    Toast.makeText(this@LoguinActivity,"Erro ao Logar Usuario", Toast.LENGTH_LONG).show()
                }
            }
        })


    }
}