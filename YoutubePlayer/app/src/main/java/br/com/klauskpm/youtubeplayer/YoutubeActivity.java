package br.com.klauskpm.youtubeplayer;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;

public class YoutubeActivity extends YouTubeBaseActivity
    implements YouTubePlayer.OnInitializedListener
{
    private String GOOGLE_API_KEY = "TBA";
    private String YOUTUBE_VIDEO_ID = "TBA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);

    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }
}
