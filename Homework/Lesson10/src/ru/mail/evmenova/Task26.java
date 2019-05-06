package ru.mail.evmenova;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int marks = readInteger(scanner, "Enter the number of marks: ");
        List<Integer> list1 = new ArrayList<>(marks);
        for (int i = 0; i < marks; i++) {
        list1.add(i,(int)Math.round((Math.random()*4)+1));
        }
        System.out.println("Initial list of marks"+list1);
        list1.removeIf(x->x<=2);
        System.out.println("New list of marks"+list1);
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