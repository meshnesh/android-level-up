
package com.example.antonyng.level_up.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.antonyng.level_up.R;
import com.example.antonyng.level_up.adapter.GithubUsersAdapter;
import com.example.antonyng.level_up.contract.MainContract;
import com.example.antonyng.level_up.model.GithubUsers;
import com.example.antonyng.level_up.presenter.GithubPresenter;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements MainContract.MainView {

    ArrayList<GithubUsers> users;

    /**
     * The Github presenter.
     */
    MainContract.MainPresenter presenter = new GithubPresenter(this);

    private static final String TAG = "MainActivity";

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;

    static final  String USERS_LIST = "list_state";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            users = savedInstanceState.getParcelableArrayList(USERS_LIST);
            displayGithubUsers(users);
        } else presenter.getUserList();
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putParcelableArrayList(USERS_LIST, users);
    }

    @Override
    public void displayGithubUsers(ArrayList<GithubUsers> usersList) {
        users = usersList;

        Log.d(TAG, "onCreate: Started");
        mRecyclerView =findViewById(R.id.recycler_view);
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        RecyclerView.Adapter adapter = new GithubUsersAdapter(this, users);
        mRecyclerView.setAdapter(adapter);
    }

}