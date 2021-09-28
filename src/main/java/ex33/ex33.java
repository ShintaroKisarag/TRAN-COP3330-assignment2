/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Phi-Hung Tran
 */

package ex33;

import java.util.*;

public class ex33 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] responses = {"Yes","No","Maybe","Ask again later"};    //list of responses the magic8ball can use
        Random Magic8Ball = new Random();

        System.out.println("What is your question? ");
        String question = input.nextLine(); //stores question

        int randomResponse = Magic8Ball.nextInt(responses.length);  //gets a random response from the list
        String response = responses[randomResponse];    //stores the random response
        System.out.println(response);   //prints out random response

    }
}
