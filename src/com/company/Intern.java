package com.company;

import java.util.Date;

public class Intern extends Employee {

    private String education;

    Intern(String name, String surname, int id, Date dateOfBirth, Date dateOfEmployment, String education) {
        super(name, surname, id, dateOfBirth, dateOfEmployment);
        this.education=education;
    }

    public String getEducation(){
        return education;
    }

    @Override
    public void display(){
        super.display();
        System.out.println(" education:"+getEducation());
    }
}
