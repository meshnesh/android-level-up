package com.example.antonyng.level_up.home.home.view;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Color;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.antonyng.level_up.R;
import com.example.antonyng.level_up.home.home.adapter.GithubUsersAdapter;
import com.example.antonyng.level_up.home.home.contract.MainContract;
import com.example.antonyng.level_up.home.home.model.GithubUsers;
import com.example.antonyng.level_up.home.home.presenter.GithubPresenter;

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

    private SwipeRefreshLayout swipeRefreshLayout;


    /**
     * The Progress dialog.
     */
    ProgressDialog progressDialog;

    Snackbar snackbar;

    static final  String USERS_LIST = "list_state";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipeRefreshLayout = findViewById(R.id.swipe_container);

        if (savedInstanceState != null) {
            users = savedInstanceState.getParcelableArrayList(USERS_LIST);
            displayGithubUsers(users);
        } else {
            if (presenter.getNetworkConnectionState()) {
                presenter.getUserList();
            } else {
                displaySnackBar(false);
            }
        }
        setSwipeRefreshLayout();
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putParcelableArrayList(USERS_LIST, users);
    }

    @Override
    public void displayGithubUsers(ArrayList<GithubUsers> usersList) {
        users = usersList;

        mRecyclerView =findViewById(R.id.recycler_view);
        mLayoutManager = new GridLayoutManager(this, 2);
        mRecyclerView.setLayoutManager(mLayoutManager);
        RecyclerView.Adapter adapter = new GithubUsersAdapter(this, users);
        mRecyclerView.setAdapter(adapter);

        dismissDialog("success");
    }

    /**
     * Dismisses/closes any running dialogs (progress dialog or swipeRefresh) after api queries
     * Also displays toast message or snack bar depending on 'success' or 'failure' of api queries
     *
     */
    @Override
    public void dismissDialog(String fetchStatus) {

        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }

        if (swipeRefreshLayout.isRefreshing()) {
            if ("success".equalsIgnoreCase(fetchStatus)) {
                swipeRefreshLayout.setRefreshing(false);
                Toast.makeText(this, "list refreshed",
                        Toast.LENGTH_LONG).show();
            } else {
                swipeRefreshLayout.setRefreshing(false);
            }
        }
    }


    /**
     * Display snack bar.
     */
    @Override
    public void displaySnackBar(boolean networkStatus) {
        int status = R.string.no_connection;

        if (networkStatus) {
            status = R.string.fetch_failed;
        }
        Snackbar snackbar = Snackbar
                .make(swipeRefreshLayout, status, Snackbar.LENGTH_INDEFINITE)
                .setAction("Try Again", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        hideSnackBar();
                        presenter.getUserList();
                    }
                });

        // Change text color for action button
        snackbar.setActionTextColor(Color.CYAN);

        // Change snack bar message text color
        View sbView = snackbar.getView();
        TextView textView = sbView.findViewById(android.support.design.R.id.snackbar_text);
        textView.setTextColor(Color.WHITE);

        snackbar.show();
    }

    /**
     * Hide snack bar.
     */
    public void hideSnackBar() {
        snackbar.dismiss();
    }

    @Override
    public Context getViewContext() {
        return getApplicationContext();
    }


    /**
     * Initializes the SwipeRefreshLayout and sets an onRefresh listener
     */
    private void setSwipeRefreshLayout() {
        swipeRefreshLayout.setColorSchemeResources(android.R.color.holo_blue_bright,
                android.R.color.holo_green_light);

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                queryApi();
            }
        });
    }

    /**
     * Queries github api for list of java developers
     **/
    public void queryApi() {
        String title = String.format("java developers");
            progressDialog = ProgressDialog.show(this, title,
                    "Loading... Please wait!!!", false, false);
        presenter.getUserList();
    }

    /**
     * Initializing collapsing toolbar
     * Will show and hide the toolbar title on scroll
     */
    private void initCollapsingToolbar() {
        final CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(" ");
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appbar);
        appBarLayout.setExpanded(true);

        // hiding & showing the title when toolbar expanded & collapsed
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
                    collapsingToolbar.setTitle(getString(R.string.app_name));
                    isShow = true;
                } else if (isShow) {
                    collapsingToolbar.setTitle(" ");
                    isShow = false;
                }
            }
        });
    }

}