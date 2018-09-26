package com.example.samarth.careertest1;

class WorkExperience {
    String id,nameoforg,address,city,state,zipcode,telephone,designation,payrate;

    public WorkExperience(){

    }

    public WorkExperience(String id, String nameoforg, String address, String city, String state, String zipcode, String telephone, String designation, String payrate) {
        this.id = id;
        this.nameoforg = nameoforg;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.telephone = telephone;
        this.designation = designation;
        this.payrate = payrate;
    }

    public String getId() {
        return id;
    }

    public String getNameoforg() {
        return nameoforg;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getDesignation() {
        return designation;
    }

    public String getPayrate() {
        return payrate;
    }
}
