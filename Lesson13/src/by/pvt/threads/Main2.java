package by.pvt.threads;




public class Main2 {
    public static void main(String[] args) {
        try {
            ATM atm = new ATM();

            new Thread(new Cashier(atm),"Cashier1").start();
            new Thread(new Cashier(atm),"Cashier2").start();

            Thread.sleep(3000);
            atm.printCount();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
