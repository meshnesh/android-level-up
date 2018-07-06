package com.example.antonyng.level_up.service;

<<<<<<< HEAD
<<<<<<< HEAD
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
=======
>>>>>>> [Feature] Create 'GithubService' to handle api base URL && 'GithubUsersApi' to handle HTTP methods
=======
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
>>>>>>> [Feature] Change BASE_URL && Implement OKHTTP and logger to view api call
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GithubService {

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> [Feature] Change BASE_URL && Implement OKHTTP and logger to view api call
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

=======
    private Retrofit retrofit = null;

    public GithubApi getAPI() {
        String BASE_URL = "https://api.github.com/";
>>>>>>> [Feature] Create 'GithubService' to handle api base URL && 'GithubUsersApi' to handle HTTP methods
=======

>>>>>>> [Feature] Change BASE_URL && Implement OKHTTP and logger to view api call

        if (retrofit == null) {
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
<<<<<<< HEAD
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
=======
                    .client(okHttp.build())
                    .build();
        }
>>>>>>> [Feature] Change BASE_URL && Implement OKHTTP and logger to view api call
        return retrofit.create(GithubApi.class);
>>>>>>> [Feature] Update endpoint for accesing multiple users and single user by username
    }
}
