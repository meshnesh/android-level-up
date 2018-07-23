package com.example.antonyng.level_up.github_user_profile.view;

import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.antonyng.level_up.R;

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
            String profileLink = getIntent().getStringExtra("html_url");
            setActivityResources(devName, imageUrl);
        }
    }

    private void setActivityResources(String devName, String imageUrl) {
        TextView developerName = findViewById(R.id.UserNameLocation);
        ImageView devImage = findViewById(R.id.profilePlaceholder);

        developerName.setText(devName);
        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(devImage);
    }

    /**
     * Generates and return share intent.
     *
     * @return - share intent
     */
    private Intent profileShareIntent() {
        String devName = getIntent()
                .getStringExtra("dev_name");

        String profileLink = getIntent()
                .getStringExtra("html_url");

        StringBuilder profileInfo = new StringBuilder();
        profileInfo
                .append(getString(R.string.share_part_message))
                .append(devName)
                .append(", ")
                .append(profileLink);

        return ShareCompat.IntentBuilder.from(this)
                .setType(getString(R.string.share_intent_type))
                .setText(profileInfo)
                .getIntent();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.share, menu);
        MenuItem menuItem = menu.findItem(R.id.share_action_button);
        menuItem.setIntent(profileShareIntent());
        return true;
    }
}
