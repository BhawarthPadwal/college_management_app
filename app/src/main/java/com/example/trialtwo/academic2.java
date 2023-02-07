package com.example.trialtwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class academic2 extends AppCompatActivity {

    TextView task1, task2;
    Dialog mDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academic2);

        task1 = findViewById(R.id.task1);
        task2 = findViewById(R.id.task2);
        mDialog = new Dialog(this);


        task1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(academic2.this, "Schedule", Toast.LENGTH_SHORT).show();
                mDialog.setContentView(R.layout.popup1); // Declare what to show
                mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                mDialog.show();
            }
        });

        task2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(academic2.this, "Syllabus", Toast.LENGTH_SHORT).show();
                mDialog.setContentView(R.layout.popup2);
                mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                mDialog.show();
            }
        });

    }
}