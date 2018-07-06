package com.example.antonyng.level_up.service;

import com.example.antonyng.level_up.model.Data;

import retrofit2.Call;
import retrofit2.http.GET;
<<<<<<< HEAD
<<<<<<< HEAD
=======
import retrofit2.http.Query;
>>>>>>> [Chore] Refactor the file name
=======
>>>>>>> [Chore] Remove unused endpoint

public interface GithubApi {

    @GET("users?")
<<<<<<< HEAD
<<<<<<< HEAD
    Call<Data> getUserList();

=======
    Call<Data> doGetUserList(@Query("page") String page);

    @GET("users/:username")
    Call<Data> getUserResults();
>>>>>>> [Chore] Refactor the file name
=======
    Call<Data> getUserList();

>>>>>>> [Chore] Remove unused endpoint
}
