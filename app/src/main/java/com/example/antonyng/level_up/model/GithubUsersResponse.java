package com.example.antonyng.level_up.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GithubUsersResponse {
<<<<<<< HEAD
<<<<<<< HEAD
    @SerializedName("items")
    public List<GithubUsers> users;

    public List<GithubUsers> getUsers() {
        return users;
=======
    @SerializedName("messages")
    private List<String> messages;

    @SerializedName("result")
    private List<GithubUsers> result;

    public List<GithubUsers> getResult() {
        return result;
    }

    public List<String> getMessages() {
        return messages;
>>>>>>> [Feature] Create Model directory to user modela classes
=======
    @SerializedName("items")
    public List<GithubUsers> users;

    public List<GithubUsers> getUsers() {
        return users;
>>>>>>> 1940d665a301988893b437557b65e9158558efee
    }
}
