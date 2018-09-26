package com.example.samarth.careertest1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class work_experience extends AppCompatActivity {
    DatabaseReference databaseReference;
    Button btn,btn2;
    EditText nameoforg,address,city,state,zipcode,telephone,designation,payrate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_experience);
        databaseReference= FirebaseDatabase.getInstance().getReference("Work Experience");
        btn=(Button)findViewById(R.id.btn);
        btn2=(Button)findViewById(R.id.btn2);
        nameoforg=(EditText)findViewById(R.id.nameoforg);
        address=(EditText)findViewById(R.id.address);
        city=(EditText)findViewById(R.id.city);
        state=(EditText)findViewById(R.id.state);
        zipcode=(EditText)findViewById(R.id.zipcode);
        telephone=(EditText)findViewById(R.id.telephone);
        designation=(EditText)findViewById(R.id.designation);
        payrate=(EditText)findViewById(R.id.payrate);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                workExperience();
            }
        });

    }

    public void workExperience()
    {
        String nameoforg1=nameoforg.getText().toString().trim();
        String address1=address.getText().toString().trim();
        String city1=city.getText().toString().trim();
        String state1=state.getText().toString().trim();
        String zipcode1=zipcode.getText().toString().trim();
        String telephone1=telephone.getText().toString().trim();
        String designation1=designation.getText().toString().trim();
        String payrate1=payrate.getText().toString().trim();


        if(!TextUtils.isEmpty(nameoforg1)){
            String id=databaseReference.push().getKey();

            WorkExperience workExperience=new WorkExperience(id,nameoforg1,address1,city1,state1,zipcode1,telephone1,designation1,payrate1);

            databaseReference.child(id).setValue(workExperience);

            Toast.makeText(this,"Details Added",Toast.LENGTH_LONG).show();

        }
        else
        {
            Toast.makeText(this,"Details Not Added",Toast.LENGTH_LONG).show();
        }

    }
    public void education_intent(View view)
    {
        Intent intent=new Intent(this,education.class);
        startActivity(intent);
    }
}
