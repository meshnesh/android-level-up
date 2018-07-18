package com.example.antonyng.level_up.home.home.service;

import com.example.antonyng.level_up.home.home.model.GithubUsersResponse;

import retrofit2.Call;
import retrofit2.http.GET;
public interface GithubApi {

    @GET("search/users?q=language:Android+location:nairobi                                                                                                                                                                                                                                                  ")
    Call<GithubUsersResponse> getUserResults();
}