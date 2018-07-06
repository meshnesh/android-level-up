package com.example.antonyng.level_up.model;

import com.google.gson.annotations.SerializedName;

public class GithubUsers {

    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("email")
    private String email;

    @SerializedName("login")
    private String login;

    @SerializedName("avatar_url")
    private String avatar_url;

    @SerializedName("company")
    private String company;

    @SerializedName("bio")
    private String bio;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getAvatarUrl() {
        return avatar_url;
    }

}
