package ru.mail.evmenova;

import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) {

        Scanner consoleScanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        String number = consoleScanner.nextLine();

        int num = Integer.parseInt(number);

        int remain = num % 10;

        if (remain == 7) {
            System.out.println("The last digit of the number is 7");
        } else {
            System.out.println("The last digit of the number isn't 7");

        }
    }
}