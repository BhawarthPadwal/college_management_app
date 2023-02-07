package com.example.trialtwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class achievement extends AppCompatActivity {

    RecyclerView recyclerView;
    Contact o1 = new Contact("Best College of the Decade","We are glad to say that our college is rewarded with this award for second time");
    Contact o2 = new Contact("Best Drama College","Congratulations");
    Contact o3 = new Contact("Education Leadership Award","It was the first edition of this award and none other than our college received it.");
    Contact o4 = new Contact("Education Leadership Award","It was the first edition of this award and none other than our college received it.");
    Contact o5 = new Contact("Education Leadership Award","It was the first edition of this award and none other than our college received it.");
    Contact o6 = new Contact("Education Leadership Award","It was the first edition of this award and none other than our college received it.");
    Contact o7 = new Contact("Education Leadership Award","It was the first edition of this award and none other than our college received it.");


    Contact [] contacts = {o1,o2,o3,o4,o5,o6,o7};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievement);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter ad = new CustomAdapter(contacts);
        recyclerView.setAdapter(ad);


    }
}