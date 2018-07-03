package com.example.antonyng.level_up;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started");

        initImageBitmaps();
    }

    private void initImageBitmaps() {
        Log.d(TAG, "initImageBitmaps: preparing  bitmaps");

        mImageUrls.add("https://avatars2.githubusercontent.com/u/15978054?s=460&v=4");
        mNames.add("Christopher Kiilu\n@kiiluchris");

        mImageUrls.add("https://avatars1.githubusercontent.com/u/13870224?s=460&v=4");
        mNames.add("David Kezi\n@Mrkezii");

        mImageUrls.add("https://avatars0.githubusercontent.com/u/33759757?s=460&v=4");
        mNames.add("@Kalela");

        mImageUrls.add("https://avatars3.githubusercontent.com/u/26790578?s=460&v=4");
        mNames.add("strongestavenger\n@mutoromike");

        mImageUrls.add("https://avatars2.githubusercontent.com/u/15923109?s=460&v=4");
        mNames.add("Antony\n@meshnesh");

        mImageUrls.add("https://avatars3.githubusercontent.com/u/30075861?s=460&v=4");
        mNames.add("betsy\n@betsybeth");

        initRecyclerView();
    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: init recyclerview");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager( this));
    }

}
