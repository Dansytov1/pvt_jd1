package ru.mail.evmenova;

import java.util.Scanner;

public class Task5_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String n1 = readNumber(scanner,"Enter any number: ");
        char[] chArray = n1.toCharArray();
        int sum = 0;

        for (int i = 0; i < chArray.length; i++){
            int charint = Integer.parseInt(Character.toString(chArray[i]));
            sum += charint;
    }
        System.out.println("Sum of all digits of this number = "+sum);
    }

    private static String readNumber(Scanner scanner, String message) {
        int n = 0;
        do{
        System.out.println(message);
        String n1 = scanner.nextLine();
        try {
            n = Integer.parseInt(n1);
        } catch (NumberFormatException e) {

        }
        if (n <= 0) {
            System.out.println("ERROR!!! Enter the correct number!!!");
        } else {
            return n1;
        }
        }while (true);
    }
}
