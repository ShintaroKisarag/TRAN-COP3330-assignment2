/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Phi-Hung Tran
 */

package ex31;
import java.util.*;
import java.lang.*;
import java.io.*;


public class ex31 {
    public static void main(String[] args){
        int restingHeartRate;
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("What is your resting Heart Rate? ");
        restingHeartRate = input.nextInt();    //stores resting heartrate
        System.out.println("What is your age? ");
        age = input.nextInt();  //stores age

        System.out.println("Resting Pulse: "+restingHeartRate+ " Age: " +age);

        int intensity = 55; //sets intensity to 55
        System.out.println("Intensity | Rate");
        System.out.println("-------------------------");

        while(intensity<96){    //intensity is less than 96
            int Target = (((220-age)-restingHeartRate)*intensity/100)+restingHeartRate; //formula
            System.out.println(intensity+"% |"+Target+"bpm");
            intensity+=5; //creates table with intensity increasing by 5
        }
    }
}
