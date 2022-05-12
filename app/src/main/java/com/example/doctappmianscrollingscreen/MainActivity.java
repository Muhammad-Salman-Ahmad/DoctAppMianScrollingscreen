package com.example.doctappmianscrollingscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
   DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        Button register=(Button) findViewById(R.id.RegisterButton);
    }
    public void AddToFirebase(View view){
        EditText nameofDoctor=(EditText) findViewById(R.id.DoctorName);
        EditText email=(EditText) findViewById(R.id.SignUpEmail);
        EditText password=(EditText) findViewById(R.id.SignUpPassword);
        EditText Specialization=(EditText) findViewById(R.id.Specialization);
        EditText education=(EditText) findViewById(R.id.education);
        EditText WorkingOrganization=(EditText) findViewById(R.id.organization);
        EditText Experience=(EditText) findViewById(R.id.experience);
        Doctor obj=new Doctor();
        obj.setName(nameofDoctor.getText().toString());
        obj.setEmail(email.getText().toString());
        obj.setPassword(password.getText().toString());
        obj.setSpecialization(Specialization.getText().toString());
        obj.setInstitutionOfStudy(education.getText().toString());
        obj.setWorkingOrganization(WorkingOrganization.getText().toString());
        obj.setExperience(Experience.getText().toString());
        reference= FirebaseDatabase.getInstance("https://doct-8e8d5-default-rtdb.firebaseio.com/").getReference("Doctors").child(obj.Name);
        reference.push().setValue(obj);
        Toast.makeText(this, "Succesfully added", Toast.LENGTH_SHORT).show();
        Intent intent= new Intent(getApplicationContext(),SignInActivity.class);
        startActivity(intent);
    }
}