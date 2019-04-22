package ru.mail.evmenova;

import java.util.Scanner;

public class Task5_3 {
    public static void main(String[] args) {
        boolean enterInt = false;
        int numberOfDivisors = 0, intNumber=0;
        Scanner scanner = new Scanner(System.in);
        intNumber = getIntNumber(enterInt, intNumber, scanner);

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

    private static int getIntNumber(boolean enterInt, int intNumber, Scanner scanner) {
        do {
            System.out.println("Enter an Integer = ");
            String intNumber1 = scanner.nextLine();
            try {
                intNumber = Integer.parseInt(intNumber1);
                if (intNumber>=1){
                    enterInt=true;
                }
            } catch (NumberFormatException e) {
            } finally {
                if (intNumber==0){
                    System.out.println("ERROR!!! Enter the correct number!!!");
                    enterInt=false;
                }
            }
        }while(!enterInt);
        return intNumber;
    }
}
