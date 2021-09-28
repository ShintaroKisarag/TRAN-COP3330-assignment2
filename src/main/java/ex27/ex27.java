/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Phi-Hung Tran
 */

package ex27;

import java.util.*;
import java.util.regex.Pattern;

public class ex27 {
    static String inputs ="";
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter the last name: ");
        String lastName = input.nextLine();
        System.out.print("Enter the ZIP Code: ");
        String zipCode = input.nextLine();
        System.out.print("Enter the employee ID: ");
        String employeeID = input.nextLine();

        validateInput(firstName,lastName,zipCode,employeeID);
    }

    public static void validateInput(String firstName, String lastName, String zipCode, String employeeID){
        boolean firstNameCheck = validateFirstName(firstName);  //checks if first name was entered correctly
        boolean lastNameCheck = validateLastName(lastName); //checks if last name was entered correctly
        boolean zipCodeCheck = validateZipCode(zipCode);    //checks if zipcode was entered correctly
        boolean idCheck = validateEmployeeID(employeeID);   //checks if employeeid was entered correctly
        if(firstNameCheck && lastNameCheck && idCheck && zipCodeCheck){
            inputs = "There were no errors found";
        }
        System.out.println(inputs);
    }
    public static boolean validateFirstName(String firstName){
        boolean state = true;
        if(firstName.length()<2){   //if the first name is less than 2 characters
            inputs = inputs + "The first name must be at least 2 characters long.\n";
            state = false;
        }
        if(firstName.length() == 0){    //if there is no data entered
            inputs = inputs + "The first name must be filled in. \n";
            state = false;
        }
        return state;
    }
    public static boolean validateLastName(String lastName) {
        boolean state = true;
        if (lastName.length() < 2) {    //if the last name is less than 2 characters
            inputs = inputs + "The last name must be at least 2 characters long.\n";
            state = false;
        }
        if (lastName.length() == 0) {   //if there is no data entered
            inputs = inputs + "The first name must be filled in. \n";
            state = false;
        }
        return state;
    }
    public static boolean validateZipCode(String zipCode){
        boolean state = true;
        try {
            int number = Integer.parseInt(zipCode); //returns an integer
            if (zipCode.length() != 5) {    //if the zipcode is not a 5 digit number
                inputs = inputs + "The zipcode must be a 5 digit number.\n";
                state = false;
            }
        }catch(Exception e){
            inputs = inputs +"The zipcode must be a 5 digit number.\n";
            state = false;
        }
        return state;
    }
    public static boolean validateEmployeeID(String employeeID){
        String pattern = "[a-zA-Z]{2}[-]{1}[0-9]{4}";   //gives list to allow employee id with numbers and letters
        if(!Pattern.matches(pattern,employeeID)){   //if it matches the format
            inputs = inputs +"The employee ID must be in the format of AA-1234.\n"; //if it doesnt match the format
            return false;
        }
        return true;
    }
}

