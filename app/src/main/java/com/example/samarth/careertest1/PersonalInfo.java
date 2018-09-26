package com.example.samarth.careertest1;

public class PersonalInfo {
    String fname;
    String mname;
    String lname;
    String email;
    String aadhar;
    String pan;
    String id;

    public PersonalInfo(){

    }

    public PersonalInfo(String fname, String mname, String lname, String email,String id, String aadhar, String pan) {
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.email = email;
        this.aadhar = aadhar;
        this.pan = pan;
        this.id=id;
    }

    public String getFname() {
        return fname;
    }
    public String getId() {
        return id;
    }


    public String getMname() {
        return mname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public String getAadhar() {
        return aadhar;
    }

    public String getPan() {
        return pan;
    }
}
