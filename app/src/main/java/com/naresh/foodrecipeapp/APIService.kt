package com.naresh.foodrecipeapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET



private val retrofit = Retrofit.Builder().baseUrl("www.themealdb.com/api/json/v1/1/").addConverterFactory(GsonConverterFactory.create()).build()

val recipeServices = retrofit.create(APIService::class.java)


interface APIService{
    @GET("Categories.php")
    suspend fun getCategories():CategoriesResponse

}