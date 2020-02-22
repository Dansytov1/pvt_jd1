package by.pvt;

public class HighKitchen implements Waiter {
    @Override
    public void doSomething() {
        System.out.println("HighKitchen: do exclusive dish");
    }

    @Override
    public String getWaitterName(int number) {
        return "No name";
    }

    public void doHighKitchen(){
        System.out.println("HighKitchen");
    }
}
