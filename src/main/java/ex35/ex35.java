/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Phi-Hung Tran
 */

package ex35;

import java.util.*;

public class ex35 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>(); //array list of names
        String randomName = null;
        do{
            System.out.println("Enter a name: ");
            randomName = input.nextLine();  //stores name
            if(!randomName.isBlank() && !randomName.isEmpty())
                nameList.add(randomName);   //puts name into list
        }while(!randomName.isBlank() && !randomName.isEmpty());

        Random pickWinner = new Random();
        int randomIndex = pickWinner.nextInt(nameList.size());  //picks name randomly from the array

        System.out.println("The winner is.. "+nameList.get(randomIndex));
    }
}
