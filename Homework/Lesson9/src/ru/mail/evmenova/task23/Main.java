package ru.mail.evmenova.task23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isRunning = true;
        ATM ATM = new ATM();
        while (isRunning) {
            System.out.println("Please select command: ");
            System.out.println("Insert money[M], Removal of money[R], For output[exit]");
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();

            switch (command) {
                case "M":
                    System.out.println("You want to load money into an ATM");
                    enterBanknotes(ATM,scanner);
                    ATM.countBankNotes();
                    break;

                case "R":
                    System.out.println("You want to withdraw money");
                    int requiredAmount=readInteger(scanner, "Enter the required amount: ");
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
    private static void enterBanknotes(ATM ATM, Scanner scanner) {
        do {
            System.out.println("Please, insert money banknote [20] [50] [100] BYN or [cancel]");
            String bankNotes = scanner.nextLine();
            if ("cancel".equals(bankNotes)) break;

            int bankNoteAmount = 0;
            switch (bankNotes) {
                case "20":
                    bankNoteAmount = 20;
                    break;
                case "50":
                    bankNoteAmount = 50;
                    break;
                case "100":
                    bankNoteAmount = 100;
                    break;
            }

            if (bankNoteAmount == 0) {
                System.out.println("Please insert money again");
            } else {
                switch (bankNoteAmount) {
                    case 20:
                        ATM.acceptBankNotes20(new Banknote(bankNoteAmount, "BYN"));
                        break;
                    case 50:
                        ATM.acceptBankNotes50(new Banknote(bankNoteAmount, "BYN"));
                        break;
                    case 100:
                        ATM.acceptBankNotes100(new Banknote(bankNoteAmount, "BYN"));
                        break;
                }
            }
        }while(true);
    }
}