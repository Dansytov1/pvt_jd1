package by.pvt;

public class Main{
    public static void main(String[] args) {
        Waiter waiter = new Kitchen();//new HighKitchen();

        Client client = new Client(waiter);

        client.getDone1();
        client.getDone2();
    }
}
