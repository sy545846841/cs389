package com.example.checkzip;

public class UserProfile {
    public String firstName;
    public String lastName;
    public String username;
    public String email;
    public Integer zipcode;


    public UserProfile(String firstName, String lastName, String username, String email, Integer zipcode){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.zipcode = zipcode;
    }
}
