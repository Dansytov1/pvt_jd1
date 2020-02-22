package ru.mail.evmenova.task23_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);
        int num20=readInteger(scanner,"Enter number of banknotes 20 ");
        int num50=readInteger(scanner,"Enter number of banknotes 50 ");
        int num100=readInteger(scanner,"Enter number of banknotes 100 ");
        ATM ATM = new ATM(num20,num50,num100);

        while (isRunning) {
            System.out.println("Please select command: ");
            System.out.println("Insert money[M], Removal of money[R], For output[exit]");

            String command = scanner.nextLine();

            switch (command) {
                case "M":
                    System.out.println("You want to load money into an ATM");
                    ATM.countBankNotes();
                    break;

                case "R":
                    System.out.println("You want to withdraw money");
                    int requiredAmount = readInteger(scanner, "Enter the required amount: ");
                    ATM.removeMoney(requiredAmount);
                    break;
                case "exit":
                    isRunning = false;
                    break;
                default:
                    System.out.println("You command is wrong");
                    break;
            }
        }
    }

    private static int readInteger(Scanner scanner, String message) {
        int a = 0;
        do {
            System.out.println(message);
            String a1 = scanner.nextLine();
            try {
                a = Integer.parseInt(a1);
            } catch (NumberFormatException e) {
            }
            if (a == 0) {
                System.out.println("ERROR!!! Enter the correct number!!!");
            } else {
                return a;
            }
        } while (true);
    }
}