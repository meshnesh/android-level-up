package com.example.antonyng.level_up.model;

import com.google.gson.annotations.SerializedName;

public class Data {
    @SerializedName("RestResponse")
    private GithubUsersResponse restResponse;

    public GithubUsersResponse getRestResponse() {
        return restResponse;
    }
}
