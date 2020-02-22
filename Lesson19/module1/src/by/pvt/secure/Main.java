package by.pvt.secure;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 =Singleton.getInstance();
        Singleton singleton2 =Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);

        try {
            Class singltoneClass = Class.forName("by.pvt.secure.Singleton");
            Constructor constructor =singltoneClass.getDeclaredConstructors()[0];
            AccessibleObject.setAccessible(new Constructor[]{constructor},true);
            Singleton singleton3 = (Singleton)constructor.newInstance();
            System.out.println(singleton3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
