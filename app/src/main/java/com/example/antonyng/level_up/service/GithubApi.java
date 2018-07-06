package com.example.antonyng.level_up.service;

<<<<<<< HEAD
import com.example.antonyng.level_up.model.GithubUsersResponse;

import retrofit2.Call;
import retrofit2.http.GET;
 
import retrofit2.http.Query;
public interface GithubApi {

    @GET("search/users?q=language:Android+location:nairobi                                                                                                                                                                                                                                                  ")
    Call<GithubUsersResponse> getUserResults();
=======
import com.example.antonyng.level_up.model.Data;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GithubApi {

    @GET("users?")
    Call<Data> getUserList();

<<<<<<< HEAD
    @GET("users/:username")
    Call<Data> getUserResults();
>>>>>>> [Chore] Refactor the file name
=======
>>>>>>> [Chore] Remove unused endpoint
}
