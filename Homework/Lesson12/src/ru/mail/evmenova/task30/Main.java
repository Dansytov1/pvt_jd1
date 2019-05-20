package ru.mail.evmenova.task30;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Task30 fileTask30 = new Task30();
        String fileName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name: ");
        fileName = scanner.nextLine() + ".txt";
        System.out.println("Enter text: ");
        String content = scanner.nextLine();
        fileTask30.writeToFile(content, fileName);
        long words = 0;
        long marks = 0;
        try {
            Pattern wordsPattern = Pattern.compile("([a-zA-Z]+)");
            Matcher wordsMatcher = wordsPattern.matcher(fileTask30.readFromFile(fileName));
            Pattern marksPattern = Pattern.compile("[//.,!:;//?]");
            Matcher marksMatcher = marksPattern.matcher(fileTask30.readFromFile(fileName));
            while (wordsMatcher.find()) {
                words++;
            }
            while (marksMatcher.find()) {
                marks++;
            }
        }catch (RuntimeException e){
            System.out.println("ERROR!!! Create a new text file");
        }
        System.out.println(fileTask30.readFromFile(fileName));
        System.out.println("The file has "+words+" words and "+marks+" punctuation mark");
    }
}
