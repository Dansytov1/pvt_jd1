package ru.mail.evmenova;

import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the side of the house №1 a= ");
        String a1=scanner.nextLine();
        int a=Integer.parseInt(a1);

        System.out.println("Enter the side of the house №1 b= ");
        String b1=scanner.nextLine();
        int b=Integer.parseInt(b1);

        System.out.println("Enter the side of the house №2 c= ");
        String c1=scanner.nextLine();
        int c=Integer.parseInt(c1);

        System.out.println("Enter the side of the house №2 d= ");
        String d1=scanner.nextLine();
        int d=Integer.parseInt(d1);

        System.out.println("Enter the side of plot of the land e= ");
        String e1=scanner.nextLine();
        int e=Integer.parseInt(e1);

        System.out.println("Enter the side of plot of the land f= ");
        String f1=scanner.nextLine();
        int f=Integer.parseInt(f1);

        if ((b+d)<=f&&e>=a&&e>=c||(a+c)<=f&&e>=b&&e>=d||(a+d)<=f&&e>=c&&e>=b||(b+c)<=f&&e>=a&&e>=d) {
            System.out.println("Houses are placed on the plot");
        } else {
            System.out.println("Houses are not placed on the plot");
        }

    }

}
