package com.example.trialtwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Core1 extends AppCompatActivity {

    TextView textView6;
    Button button6;
    FirebaseAuth mAuth;
    FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_core1);

        textView6 = findViewById(R.id.textView6);
        button6 = findViewById(R.id.button6);

        mAuth = FirebaseAuth.getInstance();
        user = mAuth.getCurrentUser();
                if (user == null) {

                    textView6.setText("Admin");
        //            Intent intent = new Intent(Core1.this,MainActivity.class);
        //            startActivity(intent);
        //            finish();
                }
                else {
                    textView6.setText(user.getEmail());
                }


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(Core1.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}