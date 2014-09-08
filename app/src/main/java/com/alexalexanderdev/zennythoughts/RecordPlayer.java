package com.alexalexanderdev.zennythoughts;

import android.content.Context;
import android.media.MediaPlayer;

import java.util.Random;

public class RecordPlayer {


    // Member variables

    int[] mRecords = {
            R.raw.guit1,
            R.raw.guit2,
            R.raw.guit3,
            R.raw.guit4
    };


    // Methods
    public int getRandomRecord() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(mRecords.length);
    }

    public void playMusic(Context context) {
        MediaPlayer player;
        player = MediaPlayer.create(context, mRecords[getRandomRecord()]);
        player.start();
        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
    }
}
