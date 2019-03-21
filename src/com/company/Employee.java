package com.company;

public class Employee {

    //Employee Attributes.
    private String FirstName;
    private String LastName;
    private int Id;

    //Constructor.
    public Employee(String firstName, String lastName, int id){
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Id = id;
    }

    //Getters.
    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getId() {
        return Id;
    }


}
