package ru.mail.evmenova;

import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter string to check: ");
        String stringToCheck=scanner.nextLine();
        char[]charArray=stringToCheck.toCharArray();
        for (int i=0; i<charArray.length;i++){
            String s1 = Character.toString(charArray[i]);
            boolean k=s1.matches("[^a-zA-Z_0-9]");
            if (k==true){
            sum++;
            }
        }
        System.out.println("Number of punctuation marks = "+sum);
    }
}
