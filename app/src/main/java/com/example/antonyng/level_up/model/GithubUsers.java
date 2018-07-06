package com.example.antonyng.level_up.model;

import com.google.gson.annotations.SerializedName;

public class GithubUsers {

    @SerializedName("login")
    private String login;

    @SerializedName("avatar_url")
    private String avatar_url;

    @SerializedName("company")
    private String company;

    public String getLogin() {
        return login;
    }

    public String getAvatarUrl() {
        return avatar_url;
    }

}
