/*
* UCF COP3330 Fall 2021 Assignment 1 Solution
* Copyright 2021 Luis Hernandez
*/

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        //create a Scanner
        Scanner input = new Scanner(System.in);
        //prompt the user to enter a noun
        System.out.print("Enter a noun: ");
        String noun = input.nextLine();
        //prompt the user to enter a verb
        System.out.print("Enter a verb: ");
        String verb = input.nextLine();
        //prompt the user to enter an adjective
        System.out.print("Enter an adjective: ");
        String adj = input.nextLine();
        //prompt the user to enter an adverb
        System.out.print("Enter an adverb: ");
        String adv = input.nextLine();
        //now output the finished mad lib
        System.out.printf("Do you %s your %s %s %s? That's hilarious!", verb, adj, noun, adv);
    }
}
