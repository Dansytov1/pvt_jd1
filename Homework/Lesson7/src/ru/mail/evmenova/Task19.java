package ru.mail.evmenova;

import java.util.Scanner;


public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1, k = 0;
        System.out.println("Enter string to check: ");
        String stringToCheck = scanner.nextLine();
        String s1 = stringToCheck.trim();
        String s2 = s1.replaceAll(" +"," ");
        char symbol;
        for (int i=0; i<s2.length();i++){
            symbol=s2.charAt(i);
            if (symbol==' '){
                n++;
            }
        }
        System.out.println("String contains "+n+" line");
    }
}
