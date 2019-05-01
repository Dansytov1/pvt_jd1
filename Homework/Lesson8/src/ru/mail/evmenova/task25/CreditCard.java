package ru.mail.evmenova.task25;

public class CreditCard extends TypeCard implements MoneyTransfer{
    @Override
    public void typeCard() {
        System.out.println("Your card is credit");
    }

    @Override
    public void moneyTransfer() {
        System.out.println("The Bank approved Your credit. Money transferred to Your account");
    }
}
