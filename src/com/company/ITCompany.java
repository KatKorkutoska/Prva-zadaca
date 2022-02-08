package com.company;

import java.util.ArrayList;
import java.util.List;

public class ITCompany {
    private ArrayList<Employee> employees = new ArrayList<>();

    ITCompany() {
    }

    ITCompany(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee emp) {
        if (this.employees.size() > 0) {
            if (getEmployeeById(emp.getId())) {
                System.out.println("Employee already exists");
            } else {
                this.employees.add(emp);
            }
        } else {
            this.employees.add(emp);
        }

    }

    public void removeEmployee(Employee emp) {
        this.employees.remove(emp);
    }

    public int getTotalEmployees() {
        return this.employees.size();
    }

    public boolean getEmployeeById(int id) {
        boolean flag = false;
        for (Employee employee : this.employees) {
            if (employee.getId() == id) {
                flag = true;
                break;
            }
        }

        return flag;
    }

    public void printEmployees(){
        for (Employee employee : this.employees) {
            employee.display();
        }
    }

    public void printDevelopers(){
        for (Employee employee : this.employees) {
            if(employee.getClass().getSimpleName().equals("Developer")){
                employee.display();
            }
        }
    }

    public void printHR(){
        for (Employee employee : this.employees) {
            if(employee.getClass().getSimpleName().equals("HR")){
                employee.display();
            }
        }
    }

    public void printInterns(){
        for (Employee employee : this.employees) {
            if(employee.getClass().getSimpleName().equals("Intern")){
                employee.display();
            }
        }
    }
}
