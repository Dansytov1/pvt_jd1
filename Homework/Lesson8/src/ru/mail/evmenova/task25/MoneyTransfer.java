package ru.mail.evmenova.task25;

public interface MoneyTransfer {

    void moneyTransfer();

    default void moneyTransfer(int money){
        System.out.println("Your account has been transfer "+money+" BYN");
    }
}
