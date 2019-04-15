public class Main1 {
    public static void main(String[] args) {
        Car audi=new Car ();
        Car bmw=new Car("Red", 80, 15.5);
        Car mers=new Car("Blue");
        Car mazda=new Car("Mazda", 14.2);
        audi.brand="Audi";
        bmw.brand="BMW";
        mers.brand="Mersedes";
        mers.makeSound();
        mazda.speedUp(50);
        audi.makeSound();
        mers.fillCar();
        mers.fillCar();
        mers.fillCar();
        mers.fillCar();
        mers.fillCar();
        bmw.service(true);
        audi.service(false);
        audi.showCharacteristic();
        bmw.showCharacteristic();
        mers.showCharacteristic();
        mazda.showCharacteristic();
    }

}
