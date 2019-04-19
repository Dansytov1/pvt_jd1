package ru.mail.evmenova;

import java.util.Scanner;

public class Task3_4 {
    public static void main(String[] args) {
        Scanner scannerConsole = new Scanner(System.in);

        System.out.print("Enter an integer (any) number: ");
        String number = scannerConsole.nextLine();

        int num = Integer.parseInt(number);

        int remain = num % 10;

        if (num%100>=11&&num%100<=19) {
            System.out.println(num + " рублей");
        } else if (remain==1) {
            System.out.println(num + " рубль");
        } else if (remain>=2&&remain<=4){
            System.out.println(num+" рубля");
        } else {
            System.out.println(num+" рублей");
        }

    }
}