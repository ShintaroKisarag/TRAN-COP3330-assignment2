/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Phi-Hung Tran
 */


package ex24;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

class isAnagram {
     static boolean isAnagram(String string1, String string2) {
        String s1 = string1.replaceAll("\\s", "");
        String s2 = string2.replaceAll("\\s", "");
        boolean status = true;
        if (s1.length() != s2.length()) {   //checks if length is the same
            status = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();    //converts string to character array
            char[] ArrayS2 = s2.toLowerCase().toCharArray();    //converts string to character array
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
        }
        if (status) {
            return true;
        } else {
            return false;
        }
    }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter two strings and I'll you if they are anagrams");
            System.out.println("Enter the first string: ");
            String string1 = input.nextLine();  //store input of string1

            System.out.println("Enter the second string: ");
            String string2 = input.nextLine();  //store input of string 2
            if (isAnagram(string1, string2))
                System.out.println(string1 + " and " + string2 + " are anagrams");
            else
                System.out.println(string1 + " and " + string2 + " are not anagrams");

        }
    }



