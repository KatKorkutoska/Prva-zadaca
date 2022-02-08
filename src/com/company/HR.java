package com.company;

import java.util.Date;

public class HR extends Employee{

    private String certificates;

    HR(String name, String surname, int id, Date dateOfBirth, Date dateOfEmployment, String certificates) {
        super(name, surname, id, dateOfBirth, dateOfEmployment);
        this.certificates=certificates;
    }

    public String getCertificates(){
        return certificates;
    }

    @Override
    public void display(){
        super.display();
        System.out.println(" certificates:"+getCertificates());

    }
}
