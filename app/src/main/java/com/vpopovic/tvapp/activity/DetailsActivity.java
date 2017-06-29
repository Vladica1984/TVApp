package com.vpopovic.tvapp.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.vpopovic.tvapp.R;

/**
 * Created by Alen on 29-Jun-17.
 */

public class DetailsActivity extends AppCompatActivity {

    public static final String VIDEO_KEY = "video";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // showing details about selected movie

        Intent intent = getIntent();

        String image = intent.getStringExtra(MainActivity.IMAGE);
        String description = intent.getStringExtra(MainActivity.DESCRIPTION);
        String background = intent.getStringExtra(MainActivity.BACKGROUND);
        String actor = intent.getStringExtra(MainActivity.ACTOR);
        String movie = intent.getStringExtra(MainActivity.MOVIE_NAME);

        final String trailer = intent.getStringExtra(MainActivity.VIDEO_TRAILER);
        final String url = intent.getStringExtra(MainActivity.URL);

        ImageView movieImage = (ImageView) findViewById(R.id.iv_detail_image);
        Glide.with(this).load(image).into(movieImage);

        ImageView movieBackground = (ImageView) findViewById(R.id.iv_detail_background);
        movieBackground.getMaxHeight();
        Glide.with(this).load(background).into(movieBackground);

        TextView myMovie = (TextView) findViewById(R.id.tv_details_movie_name);
        myMovie.setText(movie);

        TextView movieDescription = (TextView) findViewById(R.id.tv_details_description);
        movieDescription.setText(description);

        TextView movieActor = (TextView) findViewById(R.id.tv_details_actor);
        movieActor.setText(actor);

        // Click on Imdb button show details about selected movie in built-in browser.
        // After launching browser, details are show IMDb search result.

        Button Imdb = (Button) findViewById(R.id.button_imdb);
        Imdb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        // Click on Play button will open PlayerActivity and show trailer for selected movie

        Button Play = (Button) findViewById(R.id.button_play);
        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(DetailsActivity.this, PlayerActivity.class);
                intent1.putExtra(VIDEO_KEY, trailer);
                startActivity(intent1);
            }
        });
    }
}
