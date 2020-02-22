package ru.mail.evmenova.task23_1;

public class ATM {

    int amountOfMoney;
    int number20;
    int number50;
    int number100;

    public ATM(int number20, int number50, int number100) {
        this.number20 = number20;
        this.number50 = number50;
        this.number100 = number100;
    }

    public int getNumber20() {
        return number20;
    }

    public int getNumber50() {
        return number50;
    }

    public int getNumber100() {
        return number100;
    }

    public void setNumber20(int number20) {
        this.number20 = number20;
    }

    public void setNumber50(int number50) {
        this.number50 = number50;
    }

    public void setNumber100(int number100) {
        this.number100 = number100;
    }

    Integer[] bankNotes20 = new Integer[number20];
    Integer[] bankNotes50 = new Integer[number50];
    Integer[] bankNotes100 = new Integer[number100];
    int sum = 0, sum1 = 0, sum2 = 0, sum3 = 0, total = 0;

    public void countBankNotes() {
        sum = number20 * 20 + number50 * 50 + number100 * 100;
        total = number20 + number50 + number100;
        System.out.println("Count: " + total + " total: " + sum);
    }
    int number20_1 = 0;
    int number50_1 = 0;
    int number100_1 = 0;
    int numberOfBanknotes;
    boolean resultOfOperation;
    public void removeMoney(int requiredAmount) {

        int requiredAmount2 = requiredAmount;
        if (requiredAmount % 10 != 0 || requiredAmount == 10 || requiredAmount == 30) {
            resultOfOperation = false;
            System.out.println("Result of operation =" + resultOfOperation +
                    ". An invalid value was entered. The amount must be a multiple of 10, except 10 and 30");
        }else if (requiredAmount > sum) {
            resultOfOperation = false;
            System.out.println("Result of operation =" + resultOfOperation + "." +
                    "There are not enough banknotes in the ATM. The available amount for withdrawal " + sum);

        }else if (requiredAmount % 20 != 0 && number50 == 0) {
            System.out.println("Sorry, there are no bills of the necessary denomination.");
            System.out.println("You can enter " + (requiredAmount2 + 10) + " or " + (requiredAmount2 - 10));
        }else if (sum - requiredAmount == 30 || sum - requiredAmount == 10) {
            System.out.println("Sorry, there are no bills of the necessary denomination.");
            System.out.println("You can enter " + (requiredAmount2 + 10) + " or " + (requiredAmount2 - 10));
        } else {
            cashWithdrawal(requiredAmount, number20_1, number50_1, requiredAmount2);
        }
    }
    private void cashWithdrawal(int requiredAmount, int number20_1, int number50_1, int requiredAmount2) {
        number100_1 = requiredAmount/100;
        requiredAmount -= number100_1 * 100;
        if(requiredAmount == 10 || requiredAmount == 30){
            number100_1--;
            requiredAmount+=100;
        }
        if(number100<number100_1){
            number50_1 = 2*(number100_1-number100);//заменяем 100 на 50*2, если купюр не хватает
            number100_1 = number100;
        }
        number50_1+=requiredAmount/50;
        requiredAmount-=requiredAmount/50*50;
        if(requiredAmount==10 || requiredAmount==30){
            number50_1--;
            requiredAmount+=50;
        }
        if(number50<number50_1){
            number20_1 = 5*((number50_1-number50/2));
            number50_1 = number50;
        }
        number20_1+=requiredAmount/20;
        requiredAmount-=requiredAmount/20*20;
        if(number20_1>number20) {
            System.out.println("Not enough bills of a required value");
            System.out.println("You can enter " + (requiredAmount2 + 10) + " or " + (requiredAmount2 - 10));
        }
        resultOfOperation=true;
        numberOfBanknotes=number20_1+number50_1+number100_1;
        System.out.println("Result of operation ="+resultOfOperation+". ATM will give money the number of bills equal to the "+
                numberOfBanknotes + " banknotes. From them: nominal value 20 - "+
                number20_1+", nominal value 50 - "+number50_1+", nominal value 100 - "+number100_1+". The ATM left the amount "+requiredAmount);
        sum=requiredAmount;

    }
}
