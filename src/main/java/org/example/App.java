/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Thach Vo
 */

package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("How many people? ");
        int people = scan.nextInt();

        System.out.print("How many pizzas do you have? ");
        int pizza = scan.nextInt();

        System.out.print("How many slices per pizza? ");
        int slices = scan.nextInt();

        int totalslices = slices * pizza;
        int slicesper = totalslices / people;
        int leftover = totalslices % people;

        System.out.print(""+people+" people with "+pizza+" pizzas ("+totalslices+" slices)\n");

        System.out.print("Each person gets "+slicesper+" of pizza\n");

        System.out.print("There are "+leftover+" leftover pieces.");
        
    }
}