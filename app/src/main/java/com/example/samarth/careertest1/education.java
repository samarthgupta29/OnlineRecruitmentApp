package com.example.samarth.careertest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class education extends AppCompatActivity {
    DatabaseReference databaseReference;
    Button btn;
    EditText universityname,major,cgpa,year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);
        databaseReference= FirebaseDatabase.getInstance().getReference("Education");
        btn=(Button)findViewById(R.id.btn);
        universityname=(EditText)findViewById(R.id.universityname);
        major=(EditText)findViewById(R.id.major);
        cgpa=(EditText)findViewById(R.id.cgpa);
        year=(EditText)findViewById(R.id.year);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                education_submit();
            }
        });
    }

    public void education_submit()
    {
        String nameofuni1=universityname.getText().toString().trim();
        String major1=major.getText().toString().trim();
        String cgpa1=cgpa.getText().toString().trim();
        String year1=year.getText().toString().trim();




        if(!TextUtils.isEmpty(nameofuni1)){
            String id=databaseReference.push().getKey();

            Education education=new Education(id,nameofuni1,major1,cgpa1,year1);

            databaseReference.child(id).setValue(education);

            Toast.makeText(this,"Details Added",Toast.LENGTH_LONG).show();

        }
        else
        {
            Toast.makeText(this,"Details Not Added",Toast.LENGTH_LONG).show();
        }
    }
}
