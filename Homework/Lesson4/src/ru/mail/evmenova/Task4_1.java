package ru.mail.evmenova;

import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day=readInteger(scanner,"Enter day: ");
        int month=readIntegerMonth(scanner,"Enter month: ");
        int year=readInteger(scanner, "Enter year: ");

        switch (month) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day == 31 && month == 12) {
                    year = year + 1;
                    month = 1;
                    day = 1;
                    System.out.println("New date: " + day + "." + month + "." + year);
                }else if (day == 31) {
                        month = month + 1;
                        day = 1;
                        System.out.println("New date: " + day + "." + month + "." + year);
                } else {
                    day = day + 1;
                    System.out.println("New date: " + day + "." + month + "." + year);
                }
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30) {
                    month = month + 1;
                    day = 1;
                    System.out.println("New date: " + day + "." + month + "." + year);
                } else {
                    day = day + 1;
                    System.out.println("New date: " + day + "." + month + "." + year);
                }
                break;

            case 2:
                if (day == 29&&year%4==0&&year%100!=0||day==29&&year%400==0||day==28) {
                    month = month + 1;
                    day = 1;
                    System.out.println("New date: " + day + "." + month + "." + year);
                } else {
                    day = day + 1;
                    System.out.println("New date: " + day + "." + month + "." + year);
                }
                  break;
        }
    }
    private static int readInteger(Scanner scanner, String message){
        int a=0;
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
        }while(true);
    }
    private static int readIntegerMonth(Scanner scanner, String message){
        int a=0;
        do {
            System.out.println(message);
            String a1 = scanner.nextLine();
            try {
                a = Integer.parseInt(a1);
            } catch (NumberFormatException e) {
            }
            if (a <= 0||a>12) {
                System.out.println("ERROR!!! Enter the correct number!!!");
            } else {
                return a;
            }
        }while(true);
}
}
// по поводу применения второго метода для месяца не очень уверенна,
//т.к. отличие всего лишь в одну одно усолвие и возможно это можно
// обыграть в одом методе