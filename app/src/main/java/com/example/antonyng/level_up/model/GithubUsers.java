package com.example.antonyng.level_up.model;

import com.google.gson.annotations.SerializedName;

public class GithubUsers {

    @SerializedName("id")
    private String id;

    @SerializedName("login")
    private String login;

    @SerializedName("avatar_url")
    private String avatar_url;

    public String getId() {
        return id;
    }
    
    public String getLogin() {
        return login;
    }

    public String getAvatarUrl() {
        return avatar_url;
    }

}
