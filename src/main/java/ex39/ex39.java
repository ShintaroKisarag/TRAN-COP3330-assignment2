/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Phi-Hung Tran
 */

package ex39;

import java.util.*;
import java.util.List;
import java.util.Comparator;
import java.util.function.Function;

public class ex39 {
    public static void main(String[] args){
        Employee[] employees = { new Employee("John","Johnson","Manager",20161231), //data given put into a list of employees
                new Employee("Tou","Xiong","Software Engineer",20161005),
                new Employee("Michaela","Michaelson","District Manager",20151219),
                new Employee("Jake","Jacobson","Programmer", 0),
                new Employee("Jaquelyn","Jackson","DBA", 0),
                new Employee("Sally","Webber","Web Developer",20151218)
        };
        List<Employee>List = Arrays.asList(employees);
        Function<Employee,String>byFirstName = Employee::getFirstName;
        Function<Employee,String>byLastName = Employee::getLastName;

        Comparator<Employee> lastThenFirst = Comparator.comparing(byLastName).thenComparing(byFirstName);   //comparing and sorting the list by last name then first name
        System.out.printf("%nEmployees in ascending order by last name then first:%n");
        List.stream()
                .sorted(lastThenFirst)
                .forEach(System.out::println);
    }
}
class Employee{
    private String firstName;
    private String lastName;
    private String department;
    private double separationDate;

    //constructor
    public Employee(String firstName, String lastName, String department, double separationDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.separationDate = separationDate;
    }
    //sets first name
    public void setFirstName(String firstName){
        this.firstName =firstName;
    }
    public String getFirstName(){   //gets firstname

        return firstName;
    }
    public void setLastName(String lastName){   //set last name

        this.lastName =lastName;
    }
    public String getLastName(){    //get last name

        return lastName;
    }
    public void setDepartment(String department){   //set department

        this.department =department;
    }
    public String getDepartment(){  //get department

        return department;
    }
    public void setSeparationDate(double separationDate){   //set separationdate

        this.separationDate =separationDate;
    }
    public double getSeparationDate(){  //get separationdate

        return separationDate;
    }
    public String getName(){    //get name

        return String.format("%s %s",getFirstName(),getLastName());
    }
    public String toString(){   //formats list strings
        return String.format("%s %s %s %8.0f",getFirstName(),getLastName(),getDepartment(),getSeparationDate());
    }
}