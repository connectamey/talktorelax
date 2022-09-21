package com.example.talktorelax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity {
Button consultATherapistButton;
Intent moodStatusActivityIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        consultATherapistButton = findViewById(R.id.consult_a_therapist_button);

        moodStatusActivityIntent = new Intent(this, MoodStatusActivity.class);

        consultATherapistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(moodStatusActivityIntent);
            }
        });
    }
}