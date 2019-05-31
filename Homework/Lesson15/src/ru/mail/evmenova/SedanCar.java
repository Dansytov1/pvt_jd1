package ru.mail.evmenova;

public class SedanCar implements Car {

    @Override
    public CarType getModel() {
        return CarType.SEDAN;
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
        System.out.println("Construct Sedan Car");
    }
}
