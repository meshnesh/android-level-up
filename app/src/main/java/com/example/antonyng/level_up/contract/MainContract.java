package com.example.antonyng.level_up.contract;

import com.example.antonyng.level_up.model.GithubUsers;

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
    }
}