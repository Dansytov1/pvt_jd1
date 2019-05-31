package ru.mail.evmenova;

public class SmallCar implements Car {
    @Override
    public CarType getModel() {
        return CarType.SMALL;
    }

    @Override
    public void setModel(CarType model) {

    }

    @Override
    public Car car(CarType model) {
        return car(model);
    }

    @Override
    public void construct() {
        System.out.println("Construct Small Car");
    }
}
