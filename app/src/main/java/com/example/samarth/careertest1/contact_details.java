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

public class contact_details extends AppCompatActivity {

    Button btn,btn2;
    EditText addline1,addline2,city,state,zipcode,telephone,mobile;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details);
        databaseReference= FirebaseDatabase.getInstance().getReference("Contact Details");
        btn=(Button)findViewById(R.id.btn);
        btn2=(Button)findViewById(R.id.btn2);
        addline1=(EditText)findViewById(R.id.addline1);
        addline2=(EditText)findViewById(R.id.addline2);
        city=(EditText)findViewById(R.id.city);
        state=(EditText)findViewById(R.id.state);
        zipcode=(EditText)findViewById(R.id.zipcode);
        telephone=(EditText)findViewById(R.id.telephone);
        mobile=(EditText)findViewById(R.id.mobile);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contact_details_firebase();
            }
        });
    }

    public void contact_details_firebase()
    {
        String addline11=addline1.getText().toString().trim();
        String addline21=addline2.getText().toString().trim();
        String city1=city.getText().toString().trim();
        String state1=state.getText().toString().trim();
        String zipcode1=zipcode.getText().toString().trim();
        String telephone1=telephone.getText().toString().trim();
        String mobile1=mobile.getText().toString().trim();


        if(!TextUtils.isEmpty(addline11)){
            String id=databaseReference.push().getKey();

            ContactDetails contactDetails=new ContactDetails(id,addline11,addline21,city1,state1,zipcode1,telephone1,mobile1);

            databaseReference.child(id).setValue(contactDetails);

            Toast.makeText(this,"Details Added",Toast.LENGTH_LONG).show();

        }
        else
        {
            Toast.makeText(this,"Details Not Added",Toast.LENGTH_LONG).show();
        }
    }
    public void work_experience_intent(View view)
    {
        Intent intent=new Intent(this,work_experience.class);
        startActivity(intent);
    }
}
