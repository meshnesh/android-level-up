package com.example.antonyng.level_up.home.home.contract;

import android.content.Context;

import com.example.antonyng.level_up.home.home.model.GithubUsers;

import java.util.ArrayList;

public interface MainContract {
    /**
     * The interface Main view.
     */
    interface MainView {

        /**
         * Display dev list.
         *
         * @param githubUsers the github users
         */
        void displayGithubUsers(ArrayList<GithubUsers> usersList);

        void dismissDialog(String fetchStatus);

        /**
         * Display snack bar.
         *
         * @param networkStatus the network status
         */
        void displaySnackBar(boolean networkStatus);

        /**
         * Gets context.
         *
         * @return the context
         */
        Context getViewContext();
    }

    /**
     * The interface Main presenter.
     */
    interface MainPresenter {
        /**
         * Query api github presenter.
         *
         */
        void getUserList();

        /**
         * Gets network state.
         *
         * @return the network state
         */
        boolean getNetworkConnectionState();
    }
}