package com.demo.api

import com.demo.login.LoginModel
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class GitHubApiClient {
    private val BASE_URL = "https://api.github.com/"
    private val retrofit: Retrofit

    init {
        retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getUserRepos(username: String): Call<List<LoginModel>> {
        val api = retrofit.create(RetrofitService::class.java)
        return api.getUserRepos(username)
    }
}