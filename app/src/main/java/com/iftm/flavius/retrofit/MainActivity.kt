package com.iftm.flavius.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.iftm.flavius.navegacaoentreactive.R
import com.iftm.flavius.retrofit.domain.Users
import com.iftm.flavius.retrofit.service.RetrofitService
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buscaDados()

    }

    private fun buscaDados() {
        val serviceRetrofit = RetrofitService()
        serviceRetrofit.api?.obterUsuario()?.enqueue(object : Callback<List<Users>> {
            override fun onResponse(call: Call<List<Users>?>?, response: Response<List<Users>?>?) {
                val lista = response?.body();
                if (lista != null) {
                    for (user in lista) {
                        Log.d("Resposta", user.name.toString())
                        name.text = lista?.get(0)?.name
                        name1.text = lista?.get(1)?.name
                        name2.text = lista?.get(2)?.name
                        name3.text = lista?.get(3)?.name
                        name4.text = lista?.get(4)?.name
                        name5.text = lista?.get(5)?.name
                        name6.text = lista?.get(6)?.name
                        name7.text = lista?.get(7)?.name

                        email.text = lista?.get(0)?.email
                        email1.text = lista?.get(1)?.email
                        email2.text = lista?.get(2)?.email
                        email3.text = lista?.get(3)?.email
                        email4.text = lista?.get(4)?.email
                        email5.text = lista?.get(5)?.email
                        email6.text = lista?.get(6)?.email
                        email7.text = lista?.get(7)?.email
                    }
                }

            }

            override fun onFailure(call: Call<List<Users>?>?, t: Throwable?) {
                Log.e("Erro", "************** erro **********\n"+t?.message.toString())
            }
        })

}
}