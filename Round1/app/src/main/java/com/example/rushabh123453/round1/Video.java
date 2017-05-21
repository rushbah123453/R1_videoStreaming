package com.example.rushabh123453.round1;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Video extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    ProgressDialog progressDialog;
    //VideoView videoView;
   // String videoURL="http://www.html5videoplayer.net/videos/toystory.mp4";


    public static final String api_key="AIzaSyDF9dldj5NXaWdz6jDyM3vWeShMd6GdPSs";
    public static final String video_id="PhFYWDoCRIM";



    //public static final String video_id="PhFYWDoCRIM";

    //  String rtsp_link=getUrlVideoRTSP("https://www.youtube.com/watch?v=SiD77g9KfhA&feature=youtu.be");

/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        progressDialog=new ProgressDialog(this);
        videoView=(VideoView)findViewById(R.id.video_stream);


    //    System.out.println("link------>"+rtsp_link);
        progressDialog.setTitle("SpiderG");
        progressDialog.setMessage("buffering");
        progressDialog.setIndeterminate(false);
        progressDialog.setCancelable(false);
        progressDialog.show();




        try {

            MediaController mediaController=new MediaController(Video.this);
            mediaController.setMediaPlayer(videoView);
            mediaController.setAnchorView(videoView);
            Uri video=Uri.parse(videoURL);
            videoView.setMediaController(mediaController);

            videoView.setVideoURI(video);


        }
        catch (Exception e)
        {

        }

        videoView.requestFocus();
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                progressDialog.dismiss();
                videoView.start();
            }
        });

    }








*/

//here starts p2



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        //progressDialog = new ProgressDialog(this);

        YouTubePlayerView youTubePlayerView=(YouTubePlayerView)findViewById(R.id.youtbe_player);
        youTubePlayerView.initialize(api_key,this);

    }




    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean b) {


        /** add listeners to YouTubePlayer instance **/
        player.setPlayerStateChangeListener(playerStateChangeListener);
        player.setPlaybackEventListener(playbackEventListener);
/** Start buffering **/
        if (!b) {
            player.cueVideo(video_id);
        }


    }


    private YouTubePlayer.PlaybackEventListener playbackEventListener = new YouTubePlayer.PlaybackEventListener() {
        @Override
        public void onBuffering(boolean arg0) {
        }
        @Override
        public void onPaused() {
        }
        @Override
        public void onPlaying() {
        }
        @Override
        public void onSeekTo(int arg0) {
        }
        @Override
        public void onStopped() {
        }
    };
    private YouTubePlayer.PlayerStateChangeListener playerStateChangeListener = new YouTubePlayer.PlayerStateChangeListener() {
        @Override
        public void onAdStarted() {
        }
        @Override
        public void onError(YouTubePlayer.ErrorReason arg0) {
        }
        @Override
        public void onLoaded(String arg0) {
        }
        @Override
        public void onLoading() {
        }
        @Override
        public void onVideoEnded() {
        }
        @Override
        public void onVideoStarted() {
        }
    };





    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }
}
