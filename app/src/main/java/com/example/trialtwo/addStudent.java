package com.example.trialtwo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class addStudent extends AppCompatActivity {

    EditText studentName, studentEmail, studentNum, studentCourse;
    Button button7;
    FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);

        studentName = findViewById(R.id.studentName);
        studentEmail = findViewById(R.id.studentEmail);
        studentNum = findViewById(R.id.studentNum);
        studentCourse = findViewById(R.id.studentCourse);
        button7 = findViewById(R.id.button7);
        db = FirebaseFirestore.getInstance();


        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String StudentName = studentName.getText().toString();
                String StudentEmail = studentEmail.getText().toString();
                String StudentNum = studentNum.getText().toString();
                String StudentCourse = studentCourse.getText().toString();

                Map<String, Object> student = new HashMap<>();
                student.put("FullName", StudentName);
                student.put("Email", StudentEmail);
                student.put("MobileNo", StudentNum);
                student.put("Course", StudentCourse);


                //Add a new document with a generated ID
                db.collection("Students")
                        .add(student)
                        .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                            @Override
                            public void onSuccess(DocumentReference documentReference) {
                                Toast.makeText(addStudent.this, "Student Details Added Successfully", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(addStudent.this, "Submission Failed", Toast.LENGTH_SHORT).show();
                            }
                        });


            }
        });



    }
}