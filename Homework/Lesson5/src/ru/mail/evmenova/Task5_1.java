package ru.mail.evmenova;

import java.util.Arrays;
import java.util.Scanner;

public class Task5_1 {
    public static void main(String[] args) {

        boolean isLengthOfArray=false;
        int max=0;
        int n=0;
        Scanner scanner=new Scanner(System.in);
        n = getN(isLengthOfArray, n, scanner);
        int[] intArray1 = new int[n];

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

    private static int getN(boolean isLengthOfArray, int n, Scanner scanner) {
        do {
            System.out.println("Enter the length of the array n= ");
            String n1 = scanner.nextLine();
            try {
                n = Integer.parseInt(n1);
                if (n>=0) {
                    isLengthOfArray = true;
                }
            } catch (NumberFormatException e) {

            } finally {
                if (n == 0) {
                    System.out.println("ERROR!!! Enter the length of the array again!");
                    isLengthOfArray=false;
                }
            }
        }while(!isLengthOfArray);
        return n;
    }
}