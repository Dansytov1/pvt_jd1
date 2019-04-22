package ru.mail.evmenova;

import java.util.Scanner;

public class Task5_2 {
    public static void main(String[] args) {

        boolean enterNumber=false;
        int sum = 0,n=0;
        String n1;
        Scanner scanner = new Scanner(System.in);
        n1 = getNumber(enterNumber, n, scanner);
        char[] chArray = n1.toCharArray();

        for (int i = 0; i < chArray.length; i++){
            int charint = Integer.parseInt(Character.toString(chArray[i]));
            sum += charint;
    }
        System.out.println("Sum of all digits of this number = "+sum);
    }

    private static String getNumber(boolean enterNumber, int n, Scanner scanner) {
        String n1;
        do {
            System.out.println("Enter any number: ");
            n1 = scanner.nextLine();
            try {
                n=Integer.parseInt(n1);
                if (n>=0) {
                    enterNumber = true;
                }
            } catch (NumberFormatException e) {

            } finally {
                if (n == 0) {
                    System.out.println("ERROR!!! Enter the correct number!!!");
                    enterNumber = false;
                }
            }
        }while (!enterNumber);
        return n1;
    }
}
