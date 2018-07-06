package com.example.antonyng.level_up.model;

import com.google.gson.annotations.SerializedName;

public class GithubUsers {

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    @SerializedName("id")
    private String id;

=======
>>>>>>> [Feature] Create Model directory to user modela classes
=======
    @SerializedName("id")
    private String id;

>>>>>>> [Chore] Add user uid=501(antonynganga) gid=20(staff) groups=20(staff),12(everyone),61(localaccounts),79(_appserverusr),80(admin),81(_appserveradm),98(_lpadmin),701(com.apple.sharepoint.group.1),33(_appstore),100(_lpoperator),204(_developer),250(_analyticsusers),395(com.apple.access_ftp),398(com.apple.access_screensharing),399(com.apple.access_ssh) parameter
    @SerializedName("name")
    private String name;

    @SerializedName("email")
    private String email;
=======
    @SerializedName("login")
    private String login;

    @SerializedName("avatar_url")
    private String avatar_url;
>>>>>>> [Chore] Change data to get specific user data

    @SerializedName("company")
    private String company;

<<<<<<< HEAD
    @SerializedName("bio")
    private String bio;

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> [Chore] Add user uid=501(antonynganga) gid=20(staff) groups=20(staff),12(everyone),61(localaccounts),79(_appserverusr),80(admin),81(_appserveradm),98(_lpadmin),701(com.apple.sharepoint.group.1),33(_appstore),100(_lpoperator),204(_developer),250(_analyticsusers),395(com.apple.access_ftp),398(com.apple.access_screensharing),399(com.apple.access_ssh) parameter
    public String getId() {
        return id;
    }

<<<<<<< HEAD
=======
>>>>>>> [Feature] Create Model directory to user modela classes
=======
>>>>>>> [Chore] Add user uid=501(antonynganga) gid=20(staff) groups=20(staff),12(everyone),61(localaccounts),79(_appserverusr),80(admin),81(_appserveradm),98(_lpadmin),701(com.apple.sharepoint.group.1),33(_appstore),100(_lpoperator),204(_developer),250(_analyticsusers),395(com.apple.access_ftp),398(com.apple.access_screensharing),399(com.apple.access_ssh) parameter
    public String getName() {
        return name;
=======
    public String getLogin() {
        return login;
>>>>>>> [Chore] Change data to get specific user data
    }

    public String getAvatarUrl() {
        return avatar_url;
    }

}
