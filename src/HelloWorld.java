/**
 * Created by Kyle on 7/8/2017.
 */

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner nameInput = new Scanner(System.in);
        Scanner countryInput = new Scanner(System.in);
        Scanner daysInput = new Scanner(System.in);
        Scanner moneyInput = new Scanner(System.in);
        Scanner currInput = new Scanner(System.in);
        Scanner exchInput = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.println("What is your name?");
        String name = nameInput.nextLine();
        System.out.println("Nice to meet you " + name + " , where are you travelling to?");
        String country = countryInput.nextLine();
        System.out.println("Great! " + country + " sounds like a great trip");
        System.out.println("How many days are you going to spend travelling?");
        int days = daysInput.nextInt();
        System.out.println("How much money, in USD, are you planning to spend on your trip?");
        int money = moneyInput.nextInt();
        System.out.println("What is the three letter currency symbol for your travel destination?");
        String currency = currInput.nextLine();
        System.out.println("How many " + currency + " are there in 1 USD?");
        double exchange = exchInput.nextDouble();
        System.out.println("If you are travelling for " + days + " that is the same as ");


    }
}



