package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    String firstInitial =  "";
    String lastName = "";
    String streetName = "";
    String streetType = "";
    String city = "";
    String houseNumber = "";


        Scanner keyboard = new Scanner(System.in);

        System.out.println( " Please enter your first initial ");
        firstInitial = keyboard.nextLine();

        System.out.println( " Please enter your lastname ");
        lastName = keyboard.nextLine();
        //System.out.println(lastName);

        System.out.println( " Please enter your street name ");
        streetName = keyboard.nextLine();

        System.out.println( " Please enter your street type ");
        streetType = keyboard.nextLine();

        System.out.println( " Please enter your city ");
        city = keyboard.nextLine();

        System.out.println( " Please enter your house number ");
        houseNumber = keyboard.nextLine();

        System.out.println(firstInitial + "." + " " + lastName + " ");
        System.out.println( houseNumber + " " + streetName + " " + streetType + " " + city);

    }
}
