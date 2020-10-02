package com.example.loopplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer C;
    private MediaPlayer Csus;
    private MediaPlayer D;
    private MediaPlayer Dsus;
    private MediaPlayer E;
    private MediaPlayer F;
    private MediaPlayer Fsus;
    private MediaPlayer G;
    private MediaPlayer Gsus;
    private MediaPlayer A;
    private MediaPlayer Asus;
    private MediaPlayer B;
    private MediaPlayer play;
    private MediaPlayer pause;


    private SeekBar seekVolume;
    private AudioManager audioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        C = MediaPlayer.create(getApplicationContext(),R.raw.c);
        Csus = MediaPlayer.create(getApplicationContext(),R.raw.db);
        D = MediaPlayer.create(getApplicationContext(),R.raw.d);
        Dsus = MediaPlayer.create(getApplicationContext(),R.raw.eb);
        E = MediaPlayer.create(getApplicationContext(),R.raw.e);
        F = MediaPlayer.create(getApplicationContext(),R.raw.f);
        Fsus = MediaPlayer.create(getApplicationContext(),R.raw.gb);
        G = MediaPlayer.create(getApplicationContext(),R.raw.g);
        Gsus = MediaPlayer.create(getApplicationContext(),R.raw.ab);
        A = MediaPlayer.create(getApplicationContext(),R.raw.a);
        Asus = MediaPlayer.create(getApplicationContext(),R.raw.bb);
        B = MediaPlayer.create(getApplicationContext(),R.raw.b);
        play = MediaPlayer.create(getApplicationContext(),R.raw.backingtrack);
        pause = MediaPlayer.create(getApplicationContext(),R.raw.backingtrack);

        inicializaSeekBar();

    }

    public void C (View view) {

        if (C != null) {
            C.start();
        }
    }

    public void Csus (View view) {
        if (Csus != null) {
            Csus.start();
        }

    }

    public void D (View view) {
        if (D != null) {
            D.start();
        }

    }
    public void Dsus (View view) {
        if (Dsus != null) {
            Dsus.start();
        }

    }
    public void E (View view) {
        if (E != null) {
            E.start();
        }

    }
    public void F (View view) {
        if (F != null) {
            F.start();
        }

    }
    public void Fsus (View view) {
        if (Fsus != null) {
            Fsus.start();
        }

    }
    public void G (View view) {
        if (G != null) {
            G.start();
        }

    }
    public void Gsus (View view) {
        if (Gsus != null) {
            Gsus.start();
        }

    }
    public void A (View view) {
        if (A != null) {
            A.start();
        }

    }
    public void Asus (View view) {
        if (Asus != null) {
            Asus.start();
        }

    }
    public void B (View view) {
        if (B != null) {
            B.start();
        }

    }

    public void Play (View view) {
        if (play != null) {
            play.start();
        }
    }

    public void Pause (View view) {
        if (play.isPlaying()) {
            pause.pause();
        }
    }

    private void inicializaSeekBar(){

        seekVolume = findViewById(R.id.seekBar);
        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        int volumeMaximo = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int volumeAtual = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);

        seekVolume.setMax(volumeMaximo);
        seekVolume.setProgress(volumeAtual);

        seekVolume.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0 );



            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }


}