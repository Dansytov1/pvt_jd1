package ru.mail.evmenova.task2_1;

public class Car {
    String brand;
    String color="Blue";
    int speed;
    double price;
    int volumeTank = 65;
    int quantityOfGasoline=5;

    public Car() {
        this.color = "Green";
        this.speed = 70;
        this.price = 12.5;

    }

    public Car(String color, int speed, double price) {
        this.color = color;
        this.speed = speed;
        this.price = price;
    }

    public Car(String color) {
        this();

    }

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void makeSound() {
        System.out.println(brand + " say: Beeeeeeeeeep!!!");
    }

    public void speedUp(int speed) {
        this.speed = speed + 10;
        System.out.println(brand + " speed up to " + this.speed);
    }
    public void showCharacteristic () {
        System.out.println(brand + " speed=" + this.speed + ", color=" + this.color + ", price=" + this.price);
    }
    public void fillCar() {
        quantityOfGasoline += 15;
        if (quantityOfGasoline > volumeTank) {
            int surplus = quantityOfGasoline - volumeTank;
            System.out.println("Paid extra " + surplus + " liter gasoline. You can keep the change");
        } else {
            System.out.println("In the tank " +brand+" "+ quantityOfGasoline + " liters");
        }
    }
    public void service (boolean broken) {
        if (broken == false) {
            System.out.println("Pleasant journey!!!");
        }
        else {
            System.out.println("You car needs repair!");
        }

    }
}

