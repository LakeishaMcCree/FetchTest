package com.example.fetchapp.network

import com.example.fetchapp.model.FetchListItem
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface FetchApi {

    @GET("hiring.json")

    fun getList():retrofit2.Call<List<FetchListItem>>

    companion object {
        var baseUrl = "https://fetch-hiring.s3.amazonaws.com/"

        fun create() : FetchApi {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseUrl)
                .build()

            return retrofit.create(FetchApi::class.java)
        }
    }
}