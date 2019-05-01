package ru.mail.evmenova.task25;

public class Main {
    public static void main(String[] args) {

        CreditCard creditCard =new CreditCard();
        creditCard.typeCard();
        creditCard.moneyTransfer();

        System.out.println();

        SalaryCard salaryCard = new SalaryCard();
        salaryCard.cardExist();
        salaryCard.typeCard();
        salaryCard.moneyTransfer();
        salaryCard.moneyTransfer(25);



    }
}
