package ru.mail.evmenova;

import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {

     Scanner scanner=new Scanner(System.in);

     int a = readInteger(scanner, "Enter the side of the house №1 a= ");
     int b = readInteger(scanner, "Enter the side of the house №1 b= ");
     int c = readInteger(scanner, "Enter the side of the house №2 c= ");
     int d = readInteger(scanner, "Enter the side of the house №2 d= ");
     int e = readInteger(scanner, "Enter the side of plot of the land e= ");
     int f = readInteger(scanner, "Enter the side of plot of the land f= ");

     if ((b+d)<=f&&e>=a&&e>=c||(a+c)<=f&&e>=b&&e>=d||(a+d)<=f&&e>=c&&e>=b||(b+c)<=f&&e>=a&&e>=d) {
         System.out.println("Houses are placed on the plot");
     } else {
         System.out.println("Houses are not placed on the plot");
        }
    }

    private static int readInteger(Scanner scanner, String message) {
    int a=0;
    do{
        System.out.println(message);
        String a1=scanner.nextLine();
        try {
            a = Integer.parseInt(a1);
        } catch (NumberFormatException e) {
        }
        if (a<=0){
            System.out.println("ERROR!!! Enter the correct number!!!");
        }else {
            return a;
        }
    }while (true);
}
}
