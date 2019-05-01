package ru.mail.evmenova.task24;

public interface Working {
    void plugIntoOutlet();

    default void plugIntoOutlet(boolean x){
        if (x) {
            System.out.println("I'm ready to work");
        } else {
            System.out.println("I'm not plugged in");
        }
    }
}
