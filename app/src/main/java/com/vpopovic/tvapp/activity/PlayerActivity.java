package com.vpopovic.tvapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

import com.vpopovic.tvapp.R;

/**
 * Created by Alen on 29-Jun-17.
 */

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        Intent intent = getIntent();
        String string = intent.getStringExtra(DetailsActivity.VIDEO_KEY);

        VideoView videoView = (VideoView) findViewById(R.id.vw_trailer);
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        videoView.setVideoPath(string);
        videoView.start();
    }
}
