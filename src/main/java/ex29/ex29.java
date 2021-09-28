/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Phi-Hung Tran
 */

package ex29;

import java.util.*;


public class ex29 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean answer = false;
        while(true) {
            try {
                System.out.print("What is the rate of return? "); //interest rate
                int rate = Integer.parseInt(input.next());
                System.out.println("It will take " + (72 / rate) + " years to double your initial investment");
            } catch (ArithmeticException e) {   //if it is divisor is 0
                System.out.println("Sorry. That's not a valid input");
            } catch (NumberFormatException e) { //if there is string
                System.out.println("Sorry. That's not a valid input");
            }
            if (answer) {
                break;
            }
        }
    }
}
