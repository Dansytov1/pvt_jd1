package by.pvt;

public class Client {

    private Waiter waiter;

    public Client(Waiter waiter) {
        this.waiter = waiter;
    }

    public Waiter getDone1() {
        waiter.getWaitterName(1);
        waiter.doSomething();
        return waiter;
    }

    public Waiter getDone2(){
        waiter.getWaitterName(2);
        waiter.doSomething();
        return (Waiter) waiter;
    }
}
