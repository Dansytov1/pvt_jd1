package by.pvt;




public class Kitchen implements Waiter {

    @Override
    public void doSomething() {
        System.out.println("Kitchen: Do meal");
    }

    @Override
    public String getWaitterName(int number) {
        return "Mr Smith";
    }
}
