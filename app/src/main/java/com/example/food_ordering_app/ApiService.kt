package com.example.food_ordering_app

import androidx.recyclerview.widget.RecyclerView
import retrofit2.http.Body
import retrofit2.http.POST
import java.net.CacheRequest

interface ApiService {
    @POST(Constants.Register_URL)
    suspend fun Register(@Body request: RegisterUser)

    @POST(Constants.LOGIN_URL)
    suspend fun Login(@Body request: RegisterUser):LoginResponse
}