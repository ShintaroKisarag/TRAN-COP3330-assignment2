/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Phi-Hung Tran
 */

package ex37;

import java.util.*;

public class ex37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What's the minimum length? ");
        int size = Integer.parseInt(input.nextLine());  //stores the size of password

        System.out.print("How many special characters? ");
        int special = Integer.parseInt(input.nextLine());   //stores the special characters of password

        System.out.print("How many numbers? ");
        int numbers = Integer.parseInt(input.nextLine());   //stores the numbers of password

        System.out.println("Your password is " + passwordRandomizator(size,special,numbers));   //prints random password
    }

    public static String passwordRandomizator(int length, int special, int numberz) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";  //can choose from capital and lower case alphabeet
        String specialCharacters = "!@#$%^&*";  //can choose from special characters listed
        String number = "1234567890";   //can choose from numbers
        Random password = new Random();
        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0; i < special; i++) { //selects special character adds character to a string
            chars.add(specialCharacters.charAt(password.nextInt(specialCharacters.length())));
        }
        for (int i = 0; i < numberz; i++) { //Select numbers and add character to string
            chars.add(number.charAt(password.nextInt(number.length())));
        }
        for (int i = chars.size() - 1; i < length; i++) {   //selects the length of the password
            chars.add(alphabet.charAt(password.nextInt(alphabet.length())));
        }
        Collections.shuffle(chars); //randomly picks from the lists
        String newPassword = "";
        for(Character i:chars){
            newPassword +=Character.toString(i);    //new password generated
        }
        return newPassword;
    }
}