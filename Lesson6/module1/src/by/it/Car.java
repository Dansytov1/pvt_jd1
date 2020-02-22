package by.it;





public class Car {

    private String modelName;

    private final static String brandName="BMW";

    public Car(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return Car.brandName+" "+modelName;
    }
    public static String getBrandName(){
        return brandName;
    }
}
