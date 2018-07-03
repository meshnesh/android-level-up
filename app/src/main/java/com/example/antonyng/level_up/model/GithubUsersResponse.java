package com.example.antonyng.level_up.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GithubUsersResponse {
    @SerializedName("messages")
    private List<String> messages;

    @SerializedName("result")
    private List<GithubUsers> result;

    public List<GithubUsers> getResult() {
        return result;
    }

    public List<String> getMessages() {
        return messages;
    }
}
