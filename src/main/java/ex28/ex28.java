/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Phi-Hung Tran
 */

package ex28;

import java.util.*;

public class ex28 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int total = 0;
        for(int i =0; i<5; i++){    //goes up to 1 number
            System.out.print("Enter a number: ");
            total += input.nextInt();   //finds the total of all numbers
        }
        System.out.println("The total is " +total);
    }
}
