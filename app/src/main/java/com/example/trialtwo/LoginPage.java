package com.example.trialtwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginPage extends AppCompatActivity {

    EditText editTextTextUsername;
    EditText editTextTextPassword;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        editTextTextUsername = findViewById(R.id.editTextTextUsername);
        editTextTextPassword = findViewById(R.id.editTextTextPassword);
        button3 = findViewById(R.id.button3);



        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = editTextTextUsername.getText().toString();
                String password = editTextTextPassword.getText().toString();


                if(TextUtils.isEmpty(username)){
                    Toast.makeText(LoginPage.this, "Please Enter The Email", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(password)){
                    Toast.makeText(LoginPage.this, "Please Enter The Email", Toast.LENGTH_SHORT).show();
                    return;
                }
                if ((username.equals("bhawarth")) && (password.equals("pineapple"))) {

                    Toast.makeText(LoginPage.this, "Logged in Successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginPage.this,home.class);
                    startActivity(intent);
                    finish();

                }
                else if ((username.equals("sohail")) && (password.equals("jackfruit"))) {

                    Toast.makeText(LoginPage.this, "Logged in Successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginPage.this,home.class);
                    startActivity(intent);
                    finish();
                }
                else if ((username.equals("sumita")) && (password.equals("cherry"))) {

                    Toast.makeText(LoginPage.this, "Logged in Successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginPage.this,home.class);
                    startActivity(intent);
                    finish();

                } else {
                    Toast.makeText(LoginPage.this, "Invalid Username and Password.", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}