package com.example.antonyng.level_up.service;

<<<<<<< HEAD
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
=======
>>>>>>> [Feature] Create 'GithubService' to handle api base URL && 'GithubUsersApi' to handle HTTP methods
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GithubService {

<<<<<<< HEAD
    private static Retrofit retrofit = null;
    private static final String BASE_URL = "https://api.github.com/";

    // Create logger
    private static HttpLoggingInterceptor logger =
            new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);

    // Create OkHttp Client
    private static OkHttpClient.Builder okHttp =
            new OkHttpClient.Builder().addInterceptor(logger);

    public static GithubApi getAPI() {

=======
    private Retrofit retrofit = null;

    public GithubApi getAPI() {
        String BASE_URL = "https://api.github.com/";
>>>>>>> [Feature] Create 'GithubService' to handle api base URL && 'GithubUsersApi' to handle HTTP methods

        if (retrofit == null) {
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
<<<<<<< HEAD
                    .client(okHttp.build())
                    .build();
        }
        return retrofit.create(GithubApi.class);
=======
                    .build();
        }

<<<<<<< HEAD
        return retrofit.create(GithubUsersApi.class);
>>>>>>> [Feature] Create 'GithubService' to handle api base URL && 'GithubUsersApi' to handle HTTP methods
=======
        return retrofit.create(GithubApi.class);
>>>>>>> [Feature] Update endpoint for accesing multiple users and single user by username
    }
}
