package com.demo.guru99.automation.models;




public class Data {


    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    private String address;
    private String city;
    private String state;
    private String postalCode;

    private String userName;
    private String password;
    private String confirmPassword;

    public Data(String firstName, String lastName, String email,
                String phoneNumber, String address, String city,
                String state, String postalCode, String userName, String password,
                String confirmPassword){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;

        this.address = address;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;

        this.userName = userName;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getEmail(){
        return email;
    }

    public String getAddress(){return address;}
    public String getCity(){return city;}
    public String getState(){return state;}
    public String getPostalCode(){return postalCode;}

    public String getPassword(){return password;}
    public String getUserName(){return userName;}
    public String getConfirmPassword(){return confirmPassword;}
}
