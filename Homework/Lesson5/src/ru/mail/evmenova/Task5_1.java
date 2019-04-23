package ru.mail.evmenova;

import java.util.Arrays;
import java.util.Scanner;

public class Task5_1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n = readN(scanner, "Enter the length of the array n= ");
        int[] intArray1 = new int[n];
        int max=0;

        for (int i = 0; i<intArray1.length; i++){
            intArray1[i]=(int)Math.round(100*Math.random());
        }

        for (int i=0; i<intArray1.length;i++){
            if (intArray1[i]>max){
                max=intArray1[i];

            }
        }

        System.out.println("Array="+Arrays.toString(intArray1));
        System.out.println("The maximum element of the array, max = "+max);
    }

    private static int readN(Scanner scanner, String message) {
        int n=0;
        do {
            System.out.println(message);
            String n1 = scanner.nextLine();
            try {
                n = Integer.parseInt(n1);
            } catch (NumberFormatException e) {
            }
            if (n <= 0) {
                System.out.println("ERROR!!! Enter the length of the array again!");
            }else{
                return n;
            }
        }while(true);
    }
}