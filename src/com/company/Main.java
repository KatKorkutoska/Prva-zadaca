package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        Developer ana= new Developer("ana","smith", 1,
              parseDate("05/10/1998")  ,  parseDate("06/09/2020"), "C++, C, Java");
        HR chris= new HR("chris","jhonson", 2,
                parseDate("04/05/1986"),  parseDate("08/03/2020"), "Scrum, Agile");
        Intern cele= new Intern("Cele","HHHGNv", 3,
                parseDate("06/01/1969"),  parseDate("01/12/2008"), "Sredna");

        Intern miki= new Intern("Miki","Blabla", 3,
                parseDate("06/01/1969"),  parseDate("01/12/2008"), "Sredna");

        ArrayList<Employee> employees;

        ITCompany company = new ITCompany();

        company.addEmployee(ana);
        company.addEmployee(chris);
        company.addEmployee(cele);
        company.addEmployee(miki);
        company.removeEmployee(ana);


        System.out.println("Total number of employees is: "+ company.getTotalEmployees());
        System.out.println("Cele has worked here for  "+ cele.retrieveNumberOfWorkingYears()+ " years");

        company.printDevelopers();
        company.printInterns();

    }

    public static Date parseDate(String date) throws ParseException {
        return new SimpleDateFormat("dd/MM/yyyy").parse(date);
    }
}
