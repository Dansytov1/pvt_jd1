package ru.mail.evmenova.task23;


public class ATM {

    int number20 = 0, number50 = 0, number100 = 0;
    Banknote[] bankNotes20 = new Banknote[number20];
    Banknote[] bankNotes50 = new Banknote[number50];
    Banknote[] bankNotes100 = new Banknote[number100];
    int sum = 0, sum1 = 0, sum2 = 0, sum3 = 0, total = 0;
    int number20_1 = 0;
    int number50_1 = 0;
    int number100_1 = 0;
    int numberOfBanknotes;
    boolean resultOfOperation;


    public void countBankNotes() {

        for (int i = 0; i < bankNotes20.length; i++) {
            sum1 += bankNotes20[i].amount;
        }
        System.out.println("Count 20: " + bankNotes20.length +
                " total 20: " + sum1);
        for (int i = 0; i < bankNotes50.length; i++) {
            sum2 += bankNotes50[i].amount;
        }
        System.out.println("Count 50: " + bankNotes50.length +
                " total 50: " + sum2);
        for (int i = 0; i < bankNotes100.length; i++) {
            sum3 += bankNotes100[i].amount;
        }
        System.out.println("Count 100: " + bankNotes100.length +
                " total 100: " + sum3);
        sum = sum1 + sum2 + sum3;
        total = bankNotes20.length + bankNotes50.length + bankNotes100.length;
        System.out.println("Count: " + total +
                " total: " + sum);
        number20 = bankNotes20.length;
        number50 = bankNotes50.length;
        number100 = bankNotes100.length;
        System.out.println("20 " + number20 + " ,50 " + number50 + " ,100 " + number100);
    }

    public void acceptBankNotes20(Banknote banknote) {
        Banknote[] newBanknotes20 = new Banknote[bankNotes20.length + 1];
        for (int i = 0; i < bankNotes20.length; i++) {
            newBanknotes20[i] = bankNotes20[i];
        }
        newBanknotes20[newBanknotes20.length - 1] = banknote;
        bankNotes20 = newBanknotes20;

    }

    public void acceptBankNotes50(Banknote banknote) {
        Banknote[] newBanknotes50 = new Banknote[bankNotes50.length + 1];
        for (int i = 0; i < bankNotes50.length; i++) {
            newBanknotes50[i] = bankNotes50[i];
        }
        newBanknotes50[newBanknotes50.length - 1] = banknote;
        bankNotes50 = newBanknotes50;

    }

    public void acceptBankNotes100(Banknote banknote) {
        Banknote[] newBanknotes100 = new Banknote[bankNotes100.length + 1];
        for (int i = 0; i < bankNotes100.length; i++) {
            newBanknotes100[i] = bankNotes100[i];
        }
        newBanknotes100[newBanknotes100.length - 1] = banknote;
        bankNotes100 = newBanknotes100;

    }

    public void removeMoney(int requiredAmount) {
        int requiredAmount2 = requiredAmount;
        if (requiredAmount % 10 != 0 || requiredAmount == 10 || requiredAmount == 30) {
            resultOfOperation = false;
            System.out.println("Result of operation =" + resultOfOperation +
                    ". An invalid value was entered. The amount must be a multiple of 10, except 10 and 30");
        } else if (requiredAmount > sum) {
            resultOfOperation = false;
            System.out.println("Result of operation =" + resultOfOperation + "." +
                    "There are not enough banknotes in the ATM. The available amount for withdrawal " + sum);

        } else if (requiredAmount % 20 != 0 && number50 == 0) {
            System.out.println("Sorry, there are no banknotes of the necessary denomination.");
            System.out.println("You can enter " + (requiredAmount2 + 10) + " or " + (requiredAmount2 - 10));
        } else if (sum - requiredAmount == 30 || sum - requiredAmount == 10) {
            System.out.println("Sorry, there are no banknotes of the necessary denomination.");
            System.out.println("You can enter " + (requiredAmount2 + 10) + " or " + (requiredAmount2 - 10));
        } else {
            cashWithdrawal(requiredAmount, number20_1, number50_1, requiredAmount2);
        }
    }

    private void cashWithdrawal(int requiredAmount, int number20_1, int number50_1, int requiredAmount2) {
        number100_1 = requiredAmount / 100;
        requiredAmount -= number100_1 * 100;
        if (requiredAmount == 10 || requiredAmount == 30) {
            number100_1--;
            requiredAmount += 100;
        }
        if (number100 < number100_1) {
            number50_1 = 2 * (number100_1 - number100);
            number100_1 = number100;
        }
        number50_1 += requiredAmount / 50;
        requiredAmount -= requiredAmount / 50 * 50;
        if (requiredAmount == 10 || requiredAmount == 30) {
            number50_1--;
            requiredAmount += 50;
        }
        if (number50 < number50_1) {
            number20_1 = 5 * ((number50_1 - number50 / 2));
            number50_1 = number50;
        }
        number20_1 += requiredAmount / 20;
        requiredAmount -= requiredAmount / (20 * 20);
        if (number20_1 > number20) {
            System.out.println("Not enough banknotes of a required value");
            System.out.println("You can enter " + (requiredAmount2 + 10) + " or " + (requiredAmount2 - 10));
        } else {
            resultOfOperation = true;
            numberOfBanknotes = number20_1 + number50_1 + number100_1;
            System.out.println("Result of operation =" + resultOfOperation + ". ATM will give money the number of banknotes equal to the " +
                    numberOfBanknotes + " banknotes. From them: nominal value 20 - " +
                    number20_1 + ", nominal value 50 - " + number50_1 + ", nominal value 100 - " + number100_1 +
                    ". The ATM left the amount " + (sum - (number20_1 * 20 + number50_1 * 50 + number100_1 * 100)));
            sum -= number20_1 * 20 + number50_1 * 50 + number100_1 * 100;
            number20 -= number20_1;
            number50 -= number50_1;
            number100 -= number100_1;
            System.out.println("sum " + sum + " ,20 " + number20 + " ,50 " + number50 + " ,100 " + number100);
        }
    }
}

