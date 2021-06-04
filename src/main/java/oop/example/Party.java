package oop.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kate Ingraham
 */
import java.util.Scanner;

public class Party {
    private int people;
    private double pizza;
    private int slices;
    Scanner input = new Scanner(System.in);

    public int getPeople() {


        do {
            System.out.println("How many people? ");
            while (!input.hasNextInt()) {
                String str1 = input.next();
                System.out.println(str1 + " is not a valid number of people.");
            }
            people = input.nextInt();
        } while (people < 0);

        return people;
    }

    public double getPizza() {

        do {
            System.out.println("How many pizzas do you have? ");
            while (!input.hasNextDouble()) {
                String str2 = input.next();
                System.out.println(str2 + " is not a valid number of pizzas.");
            }
            pizza = input.nextDouble();
        } while (pizza < 0);

        return pizza;
    }

    public int getSlices() {

        do {
            System.out.println("How many slices per pizza? ");
            while (!input.hasNextInt()) {
                String str3 = input.next();
                System.out.println(str3 + " is not a valid number of slices.");
            }
            slices = input.nextInt();
        } while (slices < 0);

        return slices;
    }

    public int [] pizzaDivide(){


        double equalSplit = (slices*pizza) / people;
        int equalPieces = (int) equalSplit;
        double remainderCount = (slices*pizza)%people;
        int leftoverPieces = (int) remainderCount;

        if (people == 0){
            System.out.println("There are no people, so...");
            return new int[]{0,slices};
        }else
        return new int[]{equalPieces, leftoverPieces};

    }
}
