package com.example.trialtwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;

public class library extends AppCompatActivity {

    EditText newText, newText2;
    Button btnSubmit;
    ArrayList<listmodel> arrayList = new ArrayList<>();
    RecyclerLibrary adapter;
    RecyclerView recyclerViewLib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        newText = findViewById(R.id.newText);
        newText2 = findViewById(R.id.newText2);
        btnSubmit = findViewById(R.id.btnSubmit);
        recyclerViewLib = findViewById(R.id.recyclerViewLib);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String textView1 = newText.getText().toString();
                String textView2 = newText2.getText().toString();

                arrayList.add(new listmodel(textView1,textView2));

                adapter.notifyItemInserted(arrayList.size()-1);
                newText.getText().clear();
                newText2.getText().clear();
                recyclerViewLib.scrollToPosition(arrayList.size()-1);


            }
        });

        recyclerViewLib.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerLibrary(this,arrayList);
        recyclerViewLib.setAdapter(adapter);




    }
}