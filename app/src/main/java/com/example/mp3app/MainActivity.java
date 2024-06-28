package com.example.mp3app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button playButton, pauseButton, stopButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = findViewById(R.id.playButton);
        pauseButton = findViewById(R.id.pauseButton);
        stopButton = findViewById(R.id.stopButton);

        playButton.setOnClickListener(view -> startService(new Intent(MainActivity.this, MP3Service.class)));

        pauseButton.setOnClickListener(view -> MP3Service.pause());

        stopButton.setOnClickListener(view -> stopService(new Intent(MainActivity.this, MP3Service.class)));
    }
}