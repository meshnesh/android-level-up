package com.example.antonyng.level_up.presenter;

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1940d665a301988893b437557b65e9158558efee
import android.content.Context;
import android.support.v7.widget.RecyclerView;

import com.example.antonyng.level_up.adapter.GithubUsersAdapter;
import com.example.antonyng.level_up.model.GithubUsers;
import com.example.antonyng.level_up.model.GithubUsersResponse;
<<<<<<< HEAD
=======
import com.example.antonyng.level_up.MainActivity;
import com.example.antonyng.level_up.model.Data;
import com.example.antonyng.level_up.model.GithubUsers;
>>>>>>> [Feature] Create presenter package, responsible for managing data and updationg the views
=======
>>>>>>> 1940d665a301988893b437557b65e9158558efee
import com.example.antonyng.level_up.service.GithubService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GithubPresenter {
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1940d665a301988893b437557b65e9158558efee
    private Context context;


    public GithubPresenter(Context context) {
        this.context = context;
    }

    public void getUserList(final RecyclerView recyclerView) {

        GithubService.getAPI().getUserResults().enqueue(new Callback<GithubUsersResponse>() {
            @Override
            public void onResponse(Call<GithubUsersResponse> call, Response<GithubUsersResponse> response) {
                List<GithubUsers> users = response.body().getUsers();
                if (users != null) {
                    recyclerView.setAdapter(new GithubUsersAdapter(context, users));
                }
            }

            @Override
            public void onFailure(Call<GithubUsersResponse> call, Throwable t) {
                try {
                    throw new InterruptedException("Something went wrong!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
<<<<<<< HEAD
=======

    private GithubService githubService;
    private MainActivity mainActivity;

    public GithubPresenter(MainActivity view) {
        this.mainActivity = view;

        if (this.githubService == null) {
            this.githubService = new GithubService();
        }
    }

    public void getUserList() {
        githubService
                .getAPI()
                .getUserList()
                .enqueue(new Callback<Data>() {
                    @Override
                    public void onResponse(Call<Data> call, Response<Data> response) {
                        Data data = response.body();

                        if (data != null && data.getRestResponse() != null) {
                            List<GithubUsers> result = data.getRestResponse().getResult();
                            mainActivity.usersReady(result);
                        }
                    }

                    @Override
                    public void onFailure(Call<Data> call, Throwable t) {
                        try {
                            throw new InterruptedException("Something went wrong!");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                });
>>>>>>> [Feature] Create presenter package, responsible for managing data and updationg the views
=======
>>>>>>> 1940d665a301988893b437557b65e9158558efee
    }
}
