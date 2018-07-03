package com.example.antonyng.level_up;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getIncomingIntent();
    }

    private void getIncomingIntent() {
        if(getIntent().hasExtra("image_url") && getIntent().hasExtra("dev_name")) {
            String imageUrl = getIntent().getStringExtra("image_url");
            String devName = getIntent().getStringExtra("dev_name");
            setActivityResources(imageUrl, devName);
        }
    }

    private void setActivityResources(String imageUrl, String devName) {
        TextView developerName = findViewById(R.id.UserNameLocation);
        ImageView devImage = findViewById(R.id.profilePlaceholder);

        developerName.setText(devName);
        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(devImage);
    }
}
