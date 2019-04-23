package ru.mail.evmenova;
import java.util.Scanner;

public class Task5_4 {
    public static void main(String[] args) {

        boolean enterNumber = false;
        int n = 0,k=0;
        String n1;
        Scanner scanner = new Scanner(System.in);
        n1 = getNumber(enterNumber, n, scanner);
        char[] chArray = n1.toCharArray();
        int m=chArray.length%3;

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
                if (i < m) {
                    System.out.print(chArray[i]);
                }
            }

            System.out.print(" ");

            for (int i=m;i<chArray.length;i++){
                if (k % 3 == 0 && k != 0) {
                    System.out.print(" ");
                }
                System.out.print(chArray[i]);
                k += 1;
            }
        }
    }


    private static String getNumber ( boolean enterNumber, int n, Scanner scanner){
        String n1;
        do {
            System.out.println("Enter any number: ");
            n1 = scanner.nextLine();
            try {
                n = Integer.parseInt(n1);
                if (n >= 0) {
                    enterNumber = true;
                }
            } catch (NumberFormatException e) {

            } finally {
                if (n == 0) {
                    System.out.println("ERROR!!! Enter the correct number!!!");
                    enterNumber = false;
                }
            }
        } while (!enterNumber);
        return n1;
    }
}
