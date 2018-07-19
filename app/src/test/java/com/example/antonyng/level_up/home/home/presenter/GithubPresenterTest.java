package com.example.antonyng.level_up.home.home.presenter;

import com.example.antonyng.level_up.home.home.contract.MainContract;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


public class GithubPresenterTest {

    @Mock
    private MainContract.MainView view;

    private GithubPresenter presenter;

    @Before
    public void SetupGithubPresenter() {
        MockitoAnnotations.initMocks(this);

        // Get a reference to the class under test
        presenter = new GithubPresenter(view);
    }
    @Test
    public void getUserListTest() {

        presenter.getUserList();

    }
}
