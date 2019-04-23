package ru.mail.evmenova;

import java.util.Scanner;

public class Task3_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int s=readNumber(scanner, "Enter the number of seconds s= ");
        int sec, m, min, h, day, w, d,hour;

        sec = s % 60;

        m = (s -sec) / 60;
        min = m % 60;

        h = (m -min) / 60;
        hour=h%24;

        d=(h-hour)/24;
        day = d%7;

        w=(d-day)/7;

        System.out.println(w+" недель, "+day+" дней, "+hour+" часов, " + min + " минут, " + sec + " секунд");

    }
    private static int readNumber(Scanner scanner, String message){
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
