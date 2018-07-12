package com.example.antonyng.level_up.presenter;

import android.content.Context;
<<<<<<< HEAD
=======
import android.support.v7.widget.RecyclerView;
import android.view.View;
>>>>>>> #156005187 Handling configuration changes  (#9)

import com.example.antonyng.level_up.contract.MainContract;
import com.example.antonyng.level_up.model.GithubUsers;
import com.example.antonyng.level_up.model.GithubUsersResponse;
import com.example.antonyng.level_up.service.GithubService;

import java.util.ArrayList;
<<<<<<< HEAD
=======
import java.util.List;
>>>>>>> #156005187 Handling configuration changes  (#9)

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

<<<<<<< HEAD
public final class GithubPresenter implements MainContract.MainPresenter {

    MainContract.MainView view;
=======
public class GithubPresenter {

    View view;
>>>>>>> #156005187 Handling configuration changes  (#9)

    private Context context;


<<<<<<< HEAD
    public GithubPresenter(MainContract.MainView view) {
        this.view = view;
=======
    public GithubPresenter(View view) {
        this.view = view;
    }

    public interface View {
        void displayGithubUsers(ArrayList<GithubUsers> users);
>>>>>>> #156005187 Handling configuration changes  (#9)
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
