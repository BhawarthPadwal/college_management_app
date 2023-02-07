package com.example.trialtwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class home extends AppCompatActivity {

    FloatingActionButton floatingActionButton;
    TextView textAcademics,textLibrary,textData,textAchievement;
    FirebaseAuth mAuth;
    FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        floatingActionButton = findViewById(R.id.floatingActionButton);
        textAcademics = findViewById(R.id.textAcademics);
        textLibrary = findViewById(R.id.textLibrary);
        textData = findViewById(R.id.textData);
        textAchievement = findViewById(R.id.textAchievement);
        mAuth = FirebaseAuth.getInstance();
        user = mAuth.getCurrentUser();

        // Logout Page
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(home.this, "Logout", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(home.this,Core1.class);
                startActivity(intent);
            }
        });

        // Academic Section
        textAcademics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(home.this, "Academic Section", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(home.this,academic2.class);
                startActivity(intent);

            }
        });

        // Library Section
        textLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(home.this, "Library Section", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(home.this,library.class);
                startActivity(intent);
            }
        });

        // Data Section
        textData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(home.this, "Data Section", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(home.this,data.class);
//                startActivity(intent);
                if (user == null) {
                    Toast.makeText(home.this, "Data Section", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(home.this,data.class);
                    startActivity(intent);

                }
                else {
                    Toast.makeText(home.this, "Data Section", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(home.this,studentData.class);
                    startActivity(intent);
                }
            }
        });

        // Achievement Section
        textAchievement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(home.this, "Achievement Section", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(home.this,achievement.class);
                startActivity(intent);
            }
        });


    }
}