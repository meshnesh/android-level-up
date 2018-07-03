package com.example.antonyng.level_up.service;

import com.example.antonyng.level_up.model.Data;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GithubUsersApi {
    @GET("user")
    Call<Data> getResults();
}
