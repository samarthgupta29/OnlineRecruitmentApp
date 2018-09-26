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

public class personal_info extends AppCompatActivity {
    DatabaseReference databaserefernce ;
    Button btn,btn2;
    EditText fname,mname,lname,email,aadhar,pan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);
        databaserefernce=FirebaseDatabase.getInstance().getReference("personal info");
        btn=(Button)findViewById(R.id.btn);
        btn2=(Button)findViewById(R.id.btn2);
        fname=(EditText)findViewById(R.id.fname);
        mname=(EditText)findViewById(R.id.mname);
        lname=(EditText)findViewById(R.id.lname);
        email=(EditText)findViewById(R.id.email);
        aadhar=(EditText)findViewById(R.id.aadhar);
        pan=(EditText)findViewById(R.id.pan);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contact_details();
            }
        });

    }





    public void contact_details()
    {
        String fname1=fname.getText().toString().trim();
        String mname1=mname.getText().toString().trim();
        String lname1=lname.getText().toString().trim();
        String email1=email.getText().toString().trim();
        String aadhar1=aadhar.getText().toString().trim();
        String pan1=pan.getText().toString().trim();


        if(!TextUtils.isEmpty(fname1)){
            String id=databaserefernce.push().getKey();

            PersonalInfo personalInfo=new PersonalInfo(id,fname1,mname1,lname1,email1,aadhar1,pan1);

            databaserefernce.child(id).setValue(personalInfo);

            Toast.makeText(this,"Details Added",Toast.LENGTH_LONG).show();

        }
        else
        {
            Toast.makeText(this,"Details Not Added",Toast.LENGTH_LONG).show();
        }

    }

    public void contact_details_intent(View view)
    {
        Intent intent=new Intent(this,contact_details.class);
        startActivity(intent);
    }
}
