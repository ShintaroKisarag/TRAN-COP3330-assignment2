/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Phi-Hung Tran
 */

package ex26;

import java.util.*;
import java.lang.Math;

class PaymentCalculator {
    public static void calculateMonthsUntilPaidOff(double i, double temp) {
        //break down the equation
        double temp1 = Math.pow((1 + i), 30);
        double temp2 = Math.log(1 + i);
        double temp3 = Math.log(1 + temp * (1 - temp1));
        int n = (int) Math.ceil((-1 * temp3) / (temp2 * 30));

        System.out.println("It will take you " + n + " months to pay off this card");
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is your balance? ");
        double balance = Double.parseDouble(input.nextLine());

        System.out.print("What is the APR in the card (As a percent)? ");
        double apr = Double.parseDouble(input.nextLine());

        System.out.print("What is the monthly payment you can make? ");
        double payment = Double.parseDouble(input.nextLine());
        double i = apr / (365 * 100);   //daily rate
        double temp = balance / payment;
        calculateMonthsUntilPaidOff(i,temp);
    }
}


