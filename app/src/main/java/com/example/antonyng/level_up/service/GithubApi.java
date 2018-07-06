package com.example.antonyng.level_up.service;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1940d665a301988893b437557b65e9158558efee
import com.example.antonyng.level_up.model.GithubUsersResponse;

import retrofit2.Call;
import retrofit2.http.GET;
<<<<<<< HEAD
 
import retrofit2.http.Query;
public interface GithubApi {

    @GET("search/users?q=language:Android+location:nairobi                                                                                                                                                                                                                                                  ")
    Call<GithubUsersResponse> getUserResults();
=======
import com.example.antonyng.level_up.model.Data;
=======
import com.example.antonyng.level_up.model.GithubUsersResponse;
>>>>>>> [Chore] Get user based on location and language

import retrofit2.Call;
import retrofit2.http.GET;
=======
>>>>>>> 1940d665a301988893b437557b65e9158558efee

public interface GithubApi {

    @GET("search/users?q=language:Android+location:nairobi                                                                                                                                                                                                                                                  ")
    Call<GithubUsersResponse> getUserResults();

<<<<<<< HEAD
<<<<<<< HEAD
    @GET("users/:username")
    Call<Data> getUserResults();
>>>>>>> [Chore] Refactor the file name
=======
>>>>>>> [Chore] Remove unused endpoint
=======
>>>>>>> 1940d665a301988893b437557b65e9158558efee
}
