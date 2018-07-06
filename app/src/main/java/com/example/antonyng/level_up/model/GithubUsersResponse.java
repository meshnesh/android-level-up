package com.example.antonyng.level_up.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GithubUsersResponse {
    @SerializedName("items")
    public List<GithubUsers> users;

    public List<GithubUsers> getUsers() {
        return users;
    }
}
