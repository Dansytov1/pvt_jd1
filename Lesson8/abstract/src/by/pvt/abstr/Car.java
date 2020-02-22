package by.pvt.abstr;

import by.pvt.abstr.auto.Auto;

public class Car extends Auto implements Playable { // расширяет Auto реализует интерфейс Playable
    @Override
    public void playMusic() {
        System.out.printf("Music is playing");
    }

    public Car() {
        this(0);
        System.out.println("Construct Car");
    }

    public Car(int price) {
        super(price);
        System.out.println("Construct Car " + price);
    }

    @Override
    public int getPrice(){
        return price;
    }

    public int getPrice(int deafaultPrice){
        return  price==0? deafaultPrice:price;
    }
    void readPrice(){
        int p = super.price;

    }
}



