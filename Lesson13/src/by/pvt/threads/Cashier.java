package by.pvt.threads;




public class Cashier implements Runnable {

    private ATM atm;

    public Cashier(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(250);
                atm.increment();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}