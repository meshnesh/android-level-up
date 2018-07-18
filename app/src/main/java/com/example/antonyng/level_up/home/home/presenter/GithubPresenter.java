package com.example.antonyng.level_up.home.home.presenter;

import android.content.Context;

import com.example.antonyng.level_up.home.home.contract.MainContract;
import com.example.antonyng.level_up.home.home.model.GithubUsers;
import com.example.antonyng.level_up.home.home.model.GithubUsersResponse;
import com.example.antonyng.level_up.home.home.service.GithubService;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public final class GithubPresenter implements MainContract.MainPresenter {

    MainContract.MainView view;

    private Context context;


    public GithubPresenter(MainContract.MainView view) {
        this.view = view;
    }

    public void getUserList() {

        GithubService.getAPI().getUserResults().enqueue(new Callback<GithubUsersResponse>() {
            @Override
            public void onResponse(Call<GithubUsersResponse> call, Response<GithubUsersResponse> response) {
                ArrayList<GithubUsers> users = response.body().getUsers();
                if (users != null) {
                    view.displayGithubUsers(users);
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
    }
}