package ru.mail.evmenova.task25;

public class SalaryCard extends TypeCard implements MoneyTransfer {
    @Override
    public void typeCard() {
        System.out.println("Your card is salary");
    }

    @Override
    public void moneyTransfer() {
        System.out.println("Today is payday. Money transferred to Your account");
    }
}