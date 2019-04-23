package ru.mail.evmenova;

import java.util.Scanner;

public class Task3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = readNumber(scanner, "Enter an integer (any) number: ");

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