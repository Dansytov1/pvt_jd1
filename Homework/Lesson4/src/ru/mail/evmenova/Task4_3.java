package ru.mail.evmenova;

import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) {

        boolean isNumberForFactoril = false;
        int i=1;
        int factorial=1;
        int n=0;

        Scanner scanner = new Scanner(System.in);

        do {
        System.out.println("Enter a number to calculate the factorial n= ");
        String n1 = scanner.nextLine();
            try {
                n = Integer.parseInt(n1);
                if (n >= 0) {
                    isNumberForFactoril = true;
                    break;
                }

            } catch (NumberFormatException e) {

            } finally {
                if (n == 0) {
                    isNumberForFactoril = false;
                }
            }
        }while (!isNumberForFactoril);
        System.out.println("You have entered correct number to calculate the factorial n="+n);

        while (i<=n){
            factorial *= i;
            i++;
        }
        System.out.println("factorial= "+factorial);
    }
}
