package com.example.antonyng.level_up;

import android.content.Intent;
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.antonyng.level_up.github_user_profile.view.DetailActivity;
import com.example.antonyng.level_up.home.home.model.GithubUsers;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * UI test for the Detail Activty class.
 */
@RunWith(AndroidJUnit4.class)
public class DetailActivityTest {
    private static final GithubUsers MOCKUSER = new GithubUsers("avatar_url", "login", "html_url");

    @Rule
    public IntentsTestRule<DetailActivity> detailActivityIntentsTestRule =
            new IntentsTestRule<>(DetailActivity.class, true, false);

    /**
     * Setup for the UI test that caters to the User class instance created.
     */
    @Before
    public void intentWithUser() {
        Intent mockIntent = new Intent();
        mockIntent.putExtra("avatar_url", MOCKUSER.getAvatarUrl());
        mockIntent.putExtra("login", MOCKUSER.getLogin());
        mockIntent.putExtra("html_url", MOCKUSER.getHtmlUrl());
        detailActivityIntentsTestRule.launchActivity(mockIntent);
    }

    /**
     * Method to check that the assert created actually contains the created data.
     */
    @Test
    public void userDetailsDisplayed() {
        onView(withId(R.id.UserNameLocation)).check(matches(withText("Meshnesh")));
        onView(withId(R.id.github_url)).check(matches(withText("http://github.io/menshesh")));
    }

}
