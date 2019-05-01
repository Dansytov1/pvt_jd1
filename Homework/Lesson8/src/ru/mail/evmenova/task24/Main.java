package ru.mail.evmenova.task24;

public class Main {
    public static void main(String[] args) {
        Dishwasher dishwasher = new Dishwasher();
        dishwasher.plugIntoOutlet();
        dishwasher.work();
        dishwasher.help();
        dishwasher.plugIntoOutlet(false);

        System.out.println();

        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        vacuumCleaner.plugIntoOutlet();
        vacuumCleaner.cleanHome();

        System.out.println();

        Broom broom = new Broom();
        broom.plugIntoOutlet();
        broom.work();
        broom.help();


    }
}
