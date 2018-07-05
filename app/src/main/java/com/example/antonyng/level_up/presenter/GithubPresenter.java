package com.example.antonyng.level_up.presenter;

import com.example.antonyng.level_up.MainActivity;
import com.example.antonyng.level_up.model.Data;
import com.example.antonyng.level_up.model.GithubUsers;
import com.example.antonyng.level_up.service.GithubService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GithubPresenter {

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
    }
}
