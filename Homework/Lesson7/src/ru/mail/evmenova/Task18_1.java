package ru.mail.evmenova;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task18_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n=0;
        System.out.println("Enter string to check: ");
        String stringToCheck = scanner.nextLine();
        Pattern p1 = Pattern.compile("[//.,!:;//?]");
        Matcher matcher = p1.matcher(stringToCheck);
        while (matcher.find()) {
            n++;
        }
        System.out.println("n= "+n);
    }
}