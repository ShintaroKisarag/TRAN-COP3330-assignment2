/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Phi-Hung Tran
 */

package ex30;

import java.util.Scanner;

public class ex30 {

    public static void main(String[] args) {
        int table = 12;
        multiplicationTable(table);
    }

    public static void multiplicationTable(int table) {
        // first print the top header row
        System.out.format("      ");
        for(int i = 1; i<=table;i++ ) {
            System.out.format("%4d",i);
        }
        System.out.println();   //moves bar down
        System.out.println("------------------------------------------");

        for(int i = 1 ;i<=table;i++) {
            // print left most column first
            System.out.format("%4d |",i);
            for(int j=1;j<=table;j++) { //multiply top row and left column
                System.out.format("%4d",i*j);
            }
            System.out.println();
        }
    }

}