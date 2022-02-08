package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public abstract class Employee {
    private String name;
    private String surname;
    private int id;
    private Date dateOfBirth;
    private Date dateOfEmployment;


    Employee(String name, String surname, int id, Date dateOfBirth, Date dateOfEmployment) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.dateOfEmployment = dateOfEmployment;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Date getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void display() {
        System.out.println("id:" + getId() + " name: " + getName() + "  surname:" + getSurname());
    }

    public long retrieveNumberOfWorkingYears() throws ParseException {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        LocalDate localDate = this.dateOfEmployment.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        long diff = currentYear - localDate.getYear();
        return diff;
    }
}
