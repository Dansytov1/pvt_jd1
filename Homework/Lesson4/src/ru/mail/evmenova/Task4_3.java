package ru.mail.evmenova;

import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) {

        int i = 1;
        int factorial = 1;
        Scanner scanner = new Scanner(System.in);

        int n = readNumberForFactorial(scanner, "Enter a number to calculate the factorial n= ");

        while (i <= n) {
            factorial *= i;
            i++;
        }
        System.out.println("factorial= " + factorial);
    }

    private static int readNumberForFactorial(Scanner scanner, String messsage) {
        int n = 0;
        do {
            System.out.println(messsage);
            String n1 = scanner.nextLine();
            try {
                n = Integer.parseInt(n1);
            } catch (NumberFormatException e) {
            }
            if (n <= 0) {
            System.out.println("ERROR!!! Enter the correct number!!!");
            } else {
            return n;
            }
        }
        while (true);
    }
}
