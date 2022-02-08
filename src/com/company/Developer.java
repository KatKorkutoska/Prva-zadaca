package com.company;

import java.util.Date;

public class Developer extends Employee{

    private String languages;

    Developer(String name, String surname, int id, Date dateOfBirth, Date dateOfEmployment, String languages) {
        super(name, surname, id, dateOfBirth, dateOfEmployment);
        this.languages=languages;
    }

    public String getLanguages(){
        return languages;
    }

    @Override
    public void display(){
        super.display();
        System.out.println(" languages:"+getLanguages());

    }
}
