package com.demo.login

import com.google.gson.annotations.SerializedName

data class LoginModel
    (
    val name: String,
    val description: String?,
    val html_url: String
)
