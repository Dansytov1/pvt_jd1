package ru.mail.evmenova;

import java.util.Scanner;

public class Task5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intNumber = readNumber(scanner,"Enter an Integer = ");
        int numberOfDivisors = 0;

        for (int i = 1; i <= intNumber; i++) {
                if (intNumber % i == 0) {
                    numberOfDivisors += 1;
                }
            }
            if (numberOfDivisors == 2) {
                System.out.println("Number is Prime");
            } else {
                System.out.println("Number is not Prime");
            }
    }

    private static int readNumber(Scanner scanner, String message) {
        int intNumber=0;
        do {
            System.out.println(message);
            String intNumber1 = scanner.nextLine();
            try {
                intNumber = Integer.parseInt(intNumber1);
            } catch (NumberFormatException e) {
            }
            if (intNumber<=0){
            System.out.println("ERROR!!! Enter the correct number!!!");
            }else{
                return intNumber;
            }
        }while(true);
    }
}
