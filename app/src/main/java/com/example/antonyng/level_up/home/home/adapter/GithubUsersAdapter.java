package com.example.antonyng.level_up.home.home.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.antonyng.level_up.github_user_profile.view.DetailActivity;
import com.example.antonyng.level_up.R;
import com.example.antonyng.level_up.home.home.model.GithubUsers;

import java.util.ArrayList;

public class GithubUsersAdapter extends RecyclerView.Adapter<GithubUsersAdapter.ViewHolder> {

    private static final String TAG = "GithubUsersAdapter";

    private Context mcontext;
    private ArrayList<GithubUsers> users;

    public GithubUsersAdapter(Context mcontext, ArrayList<GithubUsers> users) {
        this.users = users;
        this.mcontext = mcontext;
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @NonNull
    @Override
    public GithubUsersAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_listitem, viewGroup, false);
        return new GithubUsersAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GithubUsersAdapter.ViewHolder viewHolder, int i) {
        final GithubUsers githubUser = users.get(i);

        Glide.with(mcontext)
                .asBitmap()
                .load(githubUser.getAvatarUrl())
                .into(viewHolder.image);

        viewHolder.imageName.setText(githubUser.getLogin());

        viewHolder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked on:" + githubUser.getLogin());

                Toast.makeText(mcontext, githubUser.getLogin(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mcontext, DetailActivity.class);
                intent.putExtra("image_url", githubUser.getAvatarUrl());
                intent.putExtra("dev_name", githubUser.getLogin());
                intent.putExtra("html_url", githubUser.getHtmlUrl());
                mcontext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView imageName;
        CardView parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            imageName = itemView.findViewById(R.id.image_name);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}
