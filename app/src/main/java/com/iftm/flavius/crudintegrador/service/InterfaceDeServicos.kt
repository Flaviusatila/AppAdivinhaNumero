package com.iftm.flavius.crudintegrador.service

import com.iftm.flavius.crudintegrador.dto.UserDTO
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface InterfaceDeServicos {
    @POST("/users")
    fun cadastroUsuario(@Body user: UserDTO?): Call<UserDTO?>?
}