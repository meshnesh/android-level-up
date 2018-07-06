package com.example.antonyng.level_up.service;

<<<<<<< HEAD
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
=======
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
>>>>>>> 1940d665a301988893b437557b65e9158558efee
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GithubService {

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> [Feature] Change BASE_URL && Implement OKHTTP and logger to view api call
=======
>>>>>>> 1940d665a301988893b437557b65e9158558efee
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

=======
    private Retrofit retrofit = null;

    public GithubApi getAPI() {
        String BASE_URL = "https://api.github.com/";
>>>>>>> [Feature] Create 'GithubService' to handle api base URL && 'GithubUsersApi' to handle HTTP methods
=======

>>>>>>> [Feature] Change BASE_URL && Implement OKHTTP and logger to view api call
=======

>>>>>>> 1940d665a301988893b437557b65e9158558efee

        if (retrofit == null) {
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
<<<<<<< HEAD
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
=======
                    .client(okHttp.build())
                    .build();
        }
        return retrofit.create(GithubApi.class);
>>>>>>> 1940d665a301988893b437557b65e9158558efee
    }
}
