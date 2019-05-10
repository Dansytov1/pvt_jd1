package ru.mail.evmenova.task21;

import java.util.Scanner;

public class Total {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = "0", s2 = "0", s3 = "0";
        StringBuilder stringBuilder = new StringBuilder(s2);
        StringBuffer stringBuffer = new StringBuffer(s3);
        int n = readInteger(scanner, "Enter the number of lines to be folded: ");

        long start = System.nanoTime();
        for (int i = 1; i <= n; i++) {
            s1 += String.valueOf(i);
            System.out.println(s1);
        }
        long timeWorkCode = System.nanoTime() - start;
        System.out.println("Execution time: " + timeWorkCode + " nanosec");

        start = System.nanoTime();
        for (int i = 1; i <= n; i++) {
            stringBuilder.append(i);
            System.out.println(stringBuilder.toString());
        }
        timeWorkCode = System.nanoTime() - start;
        System.out.println("Execution time: " + timeWorkCode + " nanosec");
        start = System.nanoTime();
        for (int i = 1; i <= n; i++) {
            stringBuffer.append(i);
            System.out.println(stringBuffer.toString());
        }
        timeWorkCode = System.nanoTime() - start;
        System.out.println("Execution time: " + timeWorkCode + " nanosec");
    }

    private static int readInteger(Scanner scanner, String message) {
        int a = 0;
        do {
            System.out.println(message);
            String a1 = scanner.nextLine();
            try {
                a = Integer.parseInt(a1);
            } catch (NumberFormatException e) {
            }
            if (a <= 0) {
                System.out.println("ERROR!!! Enter the correct number!!!");
            } else {
                return a;
            }
        } while (true);
    }
}
