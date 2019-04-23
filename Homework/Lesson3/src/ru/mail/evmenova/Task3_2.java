package ru.mail.evmenova;

import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = readNumber(scanner, "Enter number: ");

        int remain = num % 10;

        if (remain == 7) {
            System.out.println("The last digit of the number is 7");
        } else {
            System.out.println("The last digit of the number isn't 7");
        }
    }

    private static int readNumber(Scanner scanner,String message){
        int num=0;
        do{
            System.out.println(message);
            String number1 = scanner.nextLine();
            try {
                num = Integer.parseInt(number1);
            }catch(NumberFormatException e){
            }
            if (num<=0){
                System.out.println("ERROR!!! Enter the correct number!!!");
            }else{
                return num;
            }
        }while (true);
    }
}