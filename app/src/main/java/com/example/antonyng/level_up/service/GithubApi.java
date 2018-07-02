package com.example.antonyng.level_up.service;

import com.example.antonyng.level_up.model.Data;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GithubApi {

    @GET("users?")
    Call<Data> doGetUserList(@Query("page") String page);

    @GET("users/:username")
    Call<Data> getUserResults();
}
