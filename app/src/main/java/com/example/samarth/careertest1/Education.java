package com.example.samarth.careertest1;

class Education {
    String id,nameofuni,major,cgpa,year;

    public Education()
    {

    }

    public Education(String id, String nameofuni, String major, String cgpa, String year) {
        this.id = id;
        this.nameofuni = nameofuni;
        this.major = major;
        this.cgpa = cgpa;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public String getNameofuni() {
        return nameofuni;
    }

    public String getMajor() {
        return major;
    }

    public String getCgpa() {
        return cgpa;
    }

    public String getYear() {
        return year;
    }
}
