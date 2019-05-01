package ru.mail.evmenova.task24;

public class Broom extends CleaningEquipment implements Working {


    @Override
    public void plugIntoOutlet() {
        System.out.println("Socket is missing. Broom work without electricity");
    }

    @Override
    public void help() {
        System.out.println("All in your hands!:)");
    }
}
