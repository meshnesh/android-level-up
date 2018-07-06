package com.example.antonyng.level_up.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GithubService {

    private Retrofit retrofit = null;

<<<<<<< HEAD
    public GithubApi getAPI() {
        String BASE_URL = "https://api.github.com/v3/";
=======
    public GithubUsersApi getAPI() {
        String BASE_URL = "https://api.github.com/";
>>>>>>> [Feature] Create 'GithubService' to handle api base URL && 'GithubUsersApi' to handle HTTP methods

        if (retrofit == null) {
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

<<<<<<< HEAD
        return retrofit.create(GithubApi.class);
=======
        return retrofit.create(GithubUsersApi.class);
>>>>>>> [Feature] Create 'GithubService' to handle api base URL && 'GithubUsersApi' to handle HTTP methods
    }
}
