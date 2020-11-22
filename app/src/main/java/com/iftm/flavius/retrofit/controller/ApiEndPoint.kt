package com.iftm.flavius.retrofit.controller

import com.iftm.flavius.retrofit.domain.Users
import retrofit2.Call
import retrofit2.http.GET

interface ApiEndPoint {

    @GET("users")
    fun obterUsuario(): Call<List<Users>>

}