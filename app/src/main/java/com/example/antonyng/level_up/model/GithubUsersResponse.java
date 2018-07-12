package com.example.antonyng.level_up.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class GithubUsersResponse {
    @SerializedName("items")
    public ArrayList<GithubUsers> users;

    public ArrayList<GithubUsers> getUsers() {
        return users;
    }
}
