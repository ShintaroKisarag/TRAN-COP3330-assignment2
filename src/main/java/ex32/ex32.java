/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Phi-Hung Tran
 */


package ex32;

import java.util.*;

public class ex32 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Let's play Guess the Number!");
        int number; //number being guessed
        number = (int)(Math.random()*999+1);
        int userInput,total,diffculty;

        while(true){
            total =0;
            System.out.print("Enter the difficulty level(1, 2, or 3): ");
            diffculty = input.nextInt();    //stores diffculty
            if(diffculty == 1)  //checks if user put in 1
                number = (int)(Math.random()*10+1); //1-10
            else if(diffculty == 2) //checks if user put in 2
                number = (int)(Math.random()*100+1);//1-100
            else if(diffculty == 3) //checks if user put in 3
                number = (int)(Math.random()*1000+1);//1-1000
        System.out.print("I have my number. What is your guess?: ");
        do{
            userInput = input.nextInt();
            total++;
            if(userInput == number){    //if the user guesses the number correctly
                System.out.println("You got it in " +total+" guesses!");
            }else if(userInput<number){ //if the users guess is lower than the number
                System.out.println("Too low. Guess again: ");
            }else if(userInput>number)  //if the user guess is higher than the number
                System.out.println("Too high. Guess again: ");
        }while(userInput !=number);
        System.out.print("\nDo you wish to play again? (Y/N)? ");   //if they type y it loops and if they type n it breaks
        char playAgain = input.next().charAt(0);
            if(playAgain=='N' || playAgain == 'n')
                break;
        }

    }
}
