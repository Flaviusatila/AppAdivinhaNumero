package com.iftm.flavius.crudintegrador.dto

class DtoLogin {
    var email: String? = null
    var password: String? = null
    var token: String? = null

    constructor(email: String?, password: String?) {
        this.email = email
        this.password = password
    }
}