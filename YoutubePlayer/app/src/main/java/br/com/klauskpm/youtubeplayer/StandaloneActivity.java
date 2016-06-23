package br.com.klauskpm.youtubeplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class StandaloneActivity extends AppCompatActivity
    implements View.OnClickListener
{

    private String GOOGLE_API_KEY = "AIzaSyC4Q-IMQdv7JWKmBQAtFaB2awSU3wBpeNg";
    private String YOUTUBE_VIDEO_ID = "u7iUoxqKaKU";
    private String YOUTUBE_PLAYLIST = "TBA";

    private Button btnPlayVideo;
    private Button btnPlayPlaylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnPlayVideo = (Button) findViewById(R.id.btnPlayVideo);
        btnPlayPlaylist = (Button) findViewById(R.id.btnPlaylist);

        btnPlayVideo.setOnClickListener(this);
        btnPlayPlaylist.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;

        switch(v.getId()) {
            case R.id.btnPlayVideo:
                break;

            case R.id.btnPlaylist:
                break;

            default:
        }
    }
}
