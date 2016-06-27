package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Problem 1
        boolean weekday = false;
        boolean vacation = false;
        String isItWeekday;
        String onVacation;
        do {
            System.out.println("Is it a weekday? (Type 'yes' or 'no')");
            isItWeekday = scanner.nextLine();
            if(isItWeekday.equalsIgnoreCase("yes")){
                weekday = true;
                break;
            } else if(isItWeekday.equalsIgnoreCase("no")){
                weekday = false;
                break;
            }
        } while(!isItWeekday.equalsIgnoreCase("yes") ||
              !isItWeekday.equalsIgnoreCase("no"));
        do {
            System.out.println("Are you on vacation? (Type 'yes' or 'no')");
            onVacation = scanner.nextLine();
            if(onVacation.equalsIgnoreCase("yes")){
                vacation = true;
                break;
            } else if(onVacation.equalsIgnoreCase("no")){
                vacation = false;
                break;
            }
        } while(!onVacation.equalsIgnoreCase("yes") ||
                !onVacation.equalsIgnoreCase("no"));
        sleepIn(weekday,vacation);
        System.out.println();

        //Problem 2
        Integer intA;
        Integer intB;
        System.out.println("Bro, I need an int. (No error exception available.)");
        intA = scanner.nextInt();
        System.out.println("Okay. Thanks, bro. Let me get one more int. (No error exception available.)");
        intB = scanner.nextInt();
        sumDouble(intA, intB);
    }

    /**
     * Problem 1
     * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

     sleepIn(false, false) → true
     sleepIn(true, false) → false
     sleepIn(false, true) → true
     * @param weekday Monday through Friday
     * @param vacation Time spent not working...
     * @return Whether or not a bro can sleep in.
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        boolean toSleep = false;
        if(weekday == true && vacation == true ||
                weekday == false && vacation == true ||
                weekday == false && vacation == false){
            System.out.println("Yeah, bro. Sleep in.");
            toSleep = true;
        } else if(weekday == true && vacation == false){
            System.out.println("Bro, get up.");
            toSleep = false;
        }
        return toSleep;
    }

    /**
     *
     Given two int values, return their sum. Unless the two values are the same, then return double their sum.

     sumDouble(1, 2) → 3
     sumDouble(3, 2) → 5
     sumDouble(2, 2) → 8
     * @param a
     * @param b
     * @return
     */
    public static int sumDouble(int a, int b) {
        int newSumDouble = 0;
        if (a != b){
            newSumDouble = a + b;
            System.out.println(newSumDouble);
        } else if (a == b){
            newSumDouble = 2 * (a + b);
            System.out.println(newSumDouble);
        }
        return newSumDouble;
    }
}
