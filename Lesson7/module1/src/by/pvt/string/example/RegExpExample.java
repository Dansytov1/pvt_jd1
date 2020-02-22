package by.pvt.string.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpExample {
    public static void main(String[] args) {
        System.out.println("-123.456".matches("-[0-9]+.[0-9]+"));

        System.out.println("Bde".matches("[A-Z][a-z][a-z]"));

        System.out.println("aivanov@mail.ru".matches("[a-z]+@[a-z]+.[a-z]+"));

        System.out.println("+375 29 610-10-11".matches("\\+375\\s\\d{2}\\s\\d{3}-\\d{2}-\\d{2}"));


        Pattern  pattern =Pattern.compile("[a-zA-Z]{2}");
        Matcher matcher=pattern.matcher("ab");
        System.out.println("matcher.matches()="+matcher.matches());
    }
}
