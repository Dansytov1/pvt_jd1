package ru.mail.evmenova;

import java.util.Arrays;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = readNumber(scanner, "Enter the length of array: ");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.round(Math.random() * 100));
        }
        System.out.println("Array=" + Arrays.toString(array));
        System.out.print("The inverted array=[ ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
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
