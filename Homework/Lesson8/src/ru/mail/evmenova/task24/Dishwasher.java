package ru.mail.evmenova.task24;

public class Dishwasher extends CleaningEquipment implements Working {

    @Override
    public void plugIntoOutlet() {
        System.out.println("Dishwasher ready to work");
    }

    @Override
    public void help() {
        System.out.println("Dishes washed and dried");
    }
}



