package ru.mail.evmenova.task22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sec = readInteger(scanner, "Enter the number of seconds for Object1: ");
        int min = readInteger(scanner, "Enter the number of minutes for Object1: ");
        int hour = readInteger(scanner, "Enter the number of hour for Object1: ");

        TimeInterval timeInterval1 = new TimeInterval(hour, min, sec);

        sec=readInteger(scanner, "Enter the number of seconds for Object2: ");
        TimeInterval timeInterval2 = new TimeInterval(sec);

        timeInterval1.totalNumberOfSeconds();
        timeInterval1.printResults();

        timeInterval2.totalNumberOfSeconds();
        timeInterval2.printResults();


        System.out.println("compareObjects=" + timeInterval1.compareObjects(timeInterval1, timeInterval2));


    }


    private static int readInteger(Scanner scanner, String message) {
        int a = -1;
        do {
            System.out.println(message);
            String a1 = scanner.nextLine();
            try {
                a = Integer.parseInt(a1);
            } catch (NumberFormatException e) {
            }
            if (a == -1||a<0) {
                System.out.println("ERROR!!! Enter the correct number!!!");
            } else {
                return a;
            }
        } while (true);
    }
}