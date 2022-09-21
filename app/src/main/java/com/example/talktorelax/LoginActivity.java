package com.example.talktorelax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {
Button loginButton, signupButton;
ImageView logoImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginButton = findViewById(R.id.login_button);
        signupButton = findViewById(R.id.signup_button);

        logoImageView = findViewById(R.id.loginlogoimageview);

        logoImageView.setImageDrawable(getDrawable(R.drawable.talktorelax_logo));

        Intent dashboardActivityIntent = new Intent(this, DashboardActivity.class);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(dashboardActivityIntent);
            }
        });
    }
}