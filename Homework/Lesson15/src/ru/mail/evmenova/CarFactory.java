package ru.mail.evmenova;

abstract class CarFactory {

    public static Car buildCar(CarType model) {
        Car car = null;
        if (model == CarType.LUXURY) {
            car = new LuxuryCar();
            car.construct();
        }
        if (model == CarType.SEDAN) {
            car = new SedanCar();
            car.construct();
        }
        if (model == CarType.SMALL) {
            car = new SmallCar();
            car.construct();
        }
        return car;
    }

    public static void main(String[] args) {
        CarFactory.buildCar(CarType.SMALL);
        CarFactory.buildCar(CarType.SEDAN);
        CarFactory.buildCar(CarType.LUXURY);
    }
}
