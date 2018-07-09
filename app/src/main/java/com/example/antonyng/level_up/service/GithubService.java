package com.example.antonyng.level_up.service;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GithubService {

    private static Retrofit retrofit = null;
    private static final String BASE_URL = "https://api.github.com/";

    // Create logger
    private static HttpLoggingInterceptor logger =
            new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);

    // Create OkHttp Client
    private static OkHttpClient.Builder okHttp =
            new OkHttpClient.Builder().addInterceptor(logger);

    public static GithubApi getAPI() {

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public GithubApi getAPI() {
        String BASE_URL = "https://api.github.com/v3/";
<<<<<<< HEAD
=======
    public GithubUsersApi getAPI() {
=======
    public GithubApi getAPI() {
>>>>>>> [Feature] Update endpoint for accesing multiple users and single user by username
        String BASE_URL = "https://api.github.com/";
>>>>>>> [Feature] Create 'GithubService' to handle api base URL && 'GithubUsersApi' to handle HTTP methods
=======
>>>>>>> [Chore] Update API url for github
=======
>>>>>>> [Chore] Work in progress

        if (retrofit == null) {
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(okHttp.build())
                    .build();
        }
<<<<<<< HEAD

<<<<<<< HEAD
<<<<<<< HEAD
        return retrofit.create(GithubApi.class);
=======
        return retrofit.create(GithubUsersApi.class);
>>>>>>> [Feature] Create 'GithubService' to handle api base URL && 'GithubUsersApi' to handle HTTP methods
=======
=======
>>>>>>> [Chore] Work in progress
        return retrofit.create(GithubApi.class);
>>>>>>> [Feature] Update endpoint for accesing multiple users and single user by username
    }
}
