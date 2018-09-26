package com.example.samarth.careertest1;

class ContactDetails {
    String id,addline1,addline2,city,state,zipcode,telephone,mobile;

    public ContactDetails()
    {

    }

    public ContactDetails(String id, String addline1, String addline2, String city, String state, String zipcode, String telephone, String mobile) {
        this.id = id;
        this.addline1 = addline1;
        this.addline2 = addline2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.telephone = telephone;
        this.mobile = mobile;
    }

    public String getId() {
        return id;
    }

    public String getAddline1() {
        return addline1;
    }

    public String getAddline2() {
        return addline2;
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

    public String getMobile() {
        return mobile;
    }
}
