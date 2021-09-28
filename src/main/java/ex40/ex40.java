/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Phi-Hung Tran
 */

package ex40;

import java.util.TreeMap;
import java.util.Date;

public class ex40 {
    static TreeMap<Integer, String> employees = new TreeMap<>();

    //private variables
    private String firstName;
    private String lastName;
    private String position;
    private Date seperationDate;

    //constructors for employees
    public void Employee(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public void Employee(String firstName, String lastName, String position, Date seperationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.seperationDate = seperationDate;
    }

    //getters and setters for firstname, lastname, position, and seperationdate
    public String getFirstname() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getSeperationDate() {
        return seperationDate;
    }

    public void setSeperationDate(Date seperationDate) {
        this.seperationDate = seperationDate;
    }
}

/*    public String toString() {
        return "Employee[" + "firstName=" + firstName+ ", lastName=" + lastName + ", position=" + position + ", separationDate=" + seperationDate + "]";
    }
    public static int search(String name){
        int count = 0;
        for(int i = 0; employees.keySet(){
            if(employees.get(i).firstName().equalsIgnoreCase(name) && employees.get(i).lastName().equalsIgnoreCase(name)){
                count++;
                System.out.println(employees.get(i));
            }
        }
        return count;
    }
}
*/