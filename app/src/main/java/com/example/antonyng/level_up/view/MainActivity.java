package com.example.antonyng.level_up.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
<<<<<<< HEAD
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
<<<<<<< HEAD

import com.example.antonyng.level_up.model.GithubUsers;
=======
>>>>>>> [Chore] Remove unused imports
=======
>>>>>>> [Test] Testing

import com.example.antonyng.level_up.R;
import com.example.antonyng.level_up.presenter.GithubPresenter;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
<<<<<<< HEAD

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import static android.provider.AlarmClock.EXTRA_MESSAGE;
=======
>>>>>>> [Chore] Add public function for listing users from api

=======
>>>>>>> [Feature] Remove RecyclerView && pass data to the layout

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started");
        mRecyclerView =findViewById(R.id.recycler_view);
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);


        GithubPresenter pres = new GithubPresenter(this);
        pres.getUserList(mRecyclerView);
    }
}
