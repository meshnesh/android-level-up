package com.example.antonyng.level_up.presenter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.antonyng.level_up.adapter.GithubUsersAdapter;
import com.example.antonyng.level_up.model.GithubUsers;
import com.example.antonyng.level_up.model.GithubUsersResponse;
import com.example.antonyng.level_up.service.GithubService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GithubPresenter {

    View view;

    private Context context;


    public GithubPresenter(View view) {
        this.view = view;
    }

    public interface View {
        void displayGithubUsers(ArrayList<GithubUsers> users);
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
