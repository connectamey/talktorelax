package com.example.talktorelax;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MoodStatusActivity extends AppCompatActivity {
ImageView moodstatusImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_status);

        moodstatusImageView = findViewById(R.id.moodstatuslogoimageview);
        moodstatusImageView.setImageDrawable(getDrawable(R.drawable.talktorelax_logo));
    }
}