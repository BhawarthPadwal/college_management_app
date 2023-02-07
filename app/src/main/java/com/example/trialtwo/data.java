package com.example.trialtwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class data extends AppCompatActivity {

    FloatingActionButton addStudentFloat;
    Button button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        addStudentFloat = findViewById(R.id.addStudentFloat);

        button10 = findViewById(R.id.button10);

        addStudentFloat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(data.this, "Add Student", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(data.this,addStudent.class);
                startActivity(intent);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(data.this, "Data", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(data.this,studentData.class);
                startActivity(intent);
            }
        });







    }
}