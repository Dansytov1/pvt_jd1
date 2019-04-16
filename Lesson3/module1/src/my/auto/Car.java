package my.auto;

import java.util.logging.Logger;

public class Car {
    int mileage=0;

    int gas=0;

    boolean isServiceNeeded;


    public void driveForward() {
        mileage++;
        //mileage-mileage+1;
        System.out.println("Mileage="+mileage);
    }
    public void driveBackword() {
        mileage--;
        //mileage-mileage-1;
        System.out.println("Mileage=" + mileage);
    }
    public void checkService(){
        String message;
        message =isServiceNeeded?"Please go to service":"No need service";
        System.out.println(message);
        }
    public void checkGasTank() {
        System.out.println("Gas: " + gas + " L");
    }

    boolean isHandBreakOn;

    Logger log = Logger.getLogger("my.auto.Car");//логгирование

    public void checkHandBreak() {
        if (isHandBreakOn){
            if (isServiceNeeded) {
                System.out.println("WARTNING! Hand break is ON Please go to service");
            }else {
                System.out.println("WARTNING! Hand break is ON");
            }
        } else {
            //System.out.println("Hand break is OFF");
            log.info("do nothing");
        }
    }
}



