package ru.mail.evmenova.task24;

public class VacuumCleaner extends CleaningEquipment implements Working{

    @Override
    public void plugIntoOutlet(){
        System.out.println("Vacuum cleaner ready to work");
    }
    public void cleanHome(){
        System.out.println("I vacuumed the whole house!");
    }
}
