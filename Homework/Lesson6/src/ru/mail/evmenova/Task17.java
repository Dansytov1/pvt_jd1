package ru.mail.evmenova;

import java.util.Arrays;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = readNumber(scanner, "Enter the length of butterfly: ");
        int[][] butterfly = new int[n][n];
        for (int i = 0; i < butterfly.length; i++) {
            for (int j = 0; j < butterfly[0].length; j++) {
                if (i <= (butterfly.length - 1) / 2) {
                    if (j >= i && j < butterfly.length - i) {
                        butterfly[i][j] = 1;
                    } else {
                        butterfly[i][j] = 0;
                    }
                }else if (j <= i && j >=butterfly.length - 1 - i) {
                        butterfly[i][j] = 1;
                    } else {
                        butterfly[i][j] = 0;
                    }
                    System.out.print(butterfly[i][j] + " ");
                }
            System.out.println();
        }
    }

    private static int readNumber(Scanner scanner, String message) {
        int n = 0;
        do {
            System.out.println(message);
            String n1 = scanner.nextLine();
            try {
                n = Integer.parseInt(n1);
            } catch (NumberFormatException e) {
            }
            if (n <= 0) {
                System.out.println("ERROR!!! Enter the length of the array again!");
            } else {
                return n;
            }
        } while (true);
    }
}