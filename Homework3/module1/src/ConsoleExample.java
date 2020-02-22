package my.console;

import java.io.Console;

/**

 *

 */

public class ConsoleExample {

    public static void main(String[] args) {

        Console console = System.console();



        System.out.println("Enter number 1: ");

        String number1 = console.readLine();



        System.out.println("Enter number 2: ");

        String number2 = console.readLine();;



        int num1 = Integer.parseInt(number1);

        int num2 = Integer.parseInt(number2);



        int sum = num1 + num2;

        System.out.println("Total sum: " + sum);
    }
}