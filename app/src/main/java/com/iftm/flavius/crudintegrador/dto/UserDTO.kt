package com.iftm.flavius.crudintegrador.dto

class UserDTO {
    var email: String? = null
    var id = 0
    var name: String? = null
    var password: String? = null
    var phone: String? = null

    constructor(email: String?, name: String?, password: String?, phone: String?) {
        this.email = email
        this.name = name
        this.password = password
        this.phone = phone
    }
}