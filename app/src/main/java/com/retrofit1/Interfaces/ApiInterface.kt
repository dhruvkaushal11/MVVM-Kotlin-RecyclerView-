package com.retrofit1.Interfaces

import com.retrofit1.Model.DataModel
import retrofit2.Call
import retrofit2.http.GET


interface ApiInterface {
    @GET("appapi/lt/category/home")
    fun getProjectList(): Call<DataModel>


}