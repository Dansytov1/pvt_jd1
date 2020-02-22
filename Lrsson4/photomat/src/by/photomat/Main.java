package by.photomat;


import java.util.Scanner;
//import java.lang.*; базовые классы пргораммирования, для них не нужен import


public class Main {

    public static void main(String[] args) {
        boolean isRunning=true;
        Machine machine=new Machine();
        while (isRunning) {//управляющий цикл, создает бесконечное выполнение
            System.out.println("Please, select commands: ");
            System.out.println("Make photo[F]; Insert money [M]");
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();

            switch (command) {

                case "F": {
                    System.out.println("You have selected photo.");
                    machine.makePhoto();
                    break;
                }
                case "M": {
                    enterBanknotes(machine, scanner);
                    machine.countBankNotes();
                    break;
                }
                case "exit": {
                    isRunning = false;
                    break ;
                }
                default: {
                    System.out.println("You command is wrong");
                    break;
                }
            }


        }
        System.gc();//вызов сборщика мусора, используется в коде редко
        System.out.println("Program exit");
        System.exit(0);//корректное завершение программы
    }

    private static void enterBanknotes(Machine machine, Scanner scanner) {
        do {
            System.out.println("Please, insert money banknote [5] [10] [20] BYN or [cancel]");
            String bankNotes = scanner.nextLine();
            if ("cancel".equals(bankNotes)) break;

            int bankNoteAmount = 0;
            switch (bankNotes) {
                case "5":
                    bankNoteAmount = 5;
                    break;
                case "10":
                    bankNoteAmount = 10;
                    break;
                case "20":
                    bankNoteAmount = 20;
                    break;
            }

            if (bankNoteAmount == 0) {
                System.out.println("Please insert money again");
            } else {
                machine.acceptBankNotes(new Banknote(bankNoteAmount,"BYN"));
            }
        }while(true);
    }
}

//if ("F".equals(command)||"M".equals(command)) {
            //System.out.println("You have selected "+command);
       // } else {
          //  System.out.println("Your command is wrong");
       //}




