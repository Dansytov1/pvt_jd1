package ru.mail.evmenova;
import java.util.Scanner;

public class Task5_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String n1 = readNumber(scanner,"Enter any number: ");
        char[] chArray = n1.toCharArray();
        int m=chArray.length%3;
        int k=0;

        if (m == 0) {
            for (int i =0; i <chArray.length; i++) {

                if (k % 3 == 0 && k != 0) {
                    System.out.print(" ");
                }
                System.out.print(chArray[i]);
                k += 1;
            }
        }else{
            for(int i=0; i<m;i++) {
                System.out.print(chArray[i]);
            }

        System.out.print(" ");

        for (int i=m;i<chArray.length;i++) {
            if (k % 3 == 0 && k != 0) {
                System.out.print(" ");
            }
            System.out.print(chArray[i]);
            k += 1;
        }
        }
    }

    private static String readNumber ( Scanner scanner, String message){
        int n=0;
        do {
            System.out.println(message);
            String n1 = scanner.nextLine();
            try {
                n = Integer.parseInt(n1);
            } catch (NumberFormatException e) {

            }
            if (n <= 0) {
            System.out.println("ERROR!!! Enter the correct number!!!");
            }else{
                return n1;
            }
        } while (true);
    }
}
