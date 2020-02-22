package by.pvt.abstr.auto;


import by.pvt.abstr.Machine;

public class Auto extends Machine {

    protected int price;



    @Override
    public void drive() {
        System.out.println("Auto is driving");


    }


    public Auto() {
        //this.price=999;
        System.out.println("Construct Auto");
    }



    public Auto(int price) {
        this.price = price;
        System.out.println("Construct Auto " + price);
    }

    public int getPrice() {
        return price;
    }
}


