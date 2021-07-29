package com.jsstech.serviceexample;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;


public class MyService extends Service {
    MediaPlayer mediaPlayer;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        Toast.makeText(this, "Service Created",Toast.LENGTH_LONG).show();
        mediaPlayer = MediaPlayer.create(this, R.raw.song);
        mediaPlayer.setLooping(false);

    }

    @Override
    public void onStart(Intent intent,int startId) {
        Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show();
        mediaPlayer.start();
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "Service stoped", Toast.LENGTH_LONG).show();
        mediaPlayer.stop();
    }
}
