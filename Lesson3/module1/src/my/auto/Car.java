package my.auto;

public class Car {
    int mileage=0;
    public void driveForward() {
        mileage++;
        //mileage-mileage+1;
        System.out.println("Mileage="+mileage);
    }
    public void driveBackword() {
        mileage--;
        //mileage-mileage-1;
        System.out.println("Mileage="+mileage);
    }
}

