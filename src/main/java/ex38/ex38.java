/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Phi-Hung Tran
 */

package ex38;

import java.util.*;

public class ex38 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a list of numbers, separated by spaces: ");
        int list = input.nextInt();
        System.out.print("The even numbers are " + list);
        for (int i = 1; i <= list; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}