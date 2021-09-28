/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Phi-Hung Tran
 */


package ex34;

import java.util.*;

public class ex34 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String>employees = new ArrayList<String>(Arrays.asList("John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"));    //array of employees
        System.out.println("There are "+employees.size()+" employees"); //looks at employee size from array
        for(String employee:employees){
            System.out.println(employee);
        }

        System.out.println("Enter an employee name to remove: ");
        String removal = input.nextLine();//stores removal of an employee
        employees.remove(removal);  //removes the name of the employee
        System.out.println("There are "+employees.size()+" employees"); //prints new size
        for(String employee:employees){
            System.out.println(employee);   //prints employees
        }
    }
}
