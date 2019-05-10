package ru.mail.evmenova.task21;

import java.util.Scanner;

public class StringBuff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = readInteger(scanner, "Enter the number of lines to be folded: ");
        String s1 = "0";
        StringBuffer stringBuffer = new StringBuffer(s1);
    long start = System.nanoTime();
        for (int i = 1; i <= n; i++) {
        stringBuffer.append(i);
        System.out.println(stringBuffer.toString());
    }
    long timeWorkCode = System.nanoTime() - start;
        System.out.println("Execution time: " + timeWorkCode + " milisec");
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

