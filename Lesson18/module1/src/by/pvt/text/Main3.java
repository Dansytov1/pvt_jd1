package by.pvt.text;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        ResourceBundle def = ResourceBundle.getBundle("MyBundle");
        ResourceBundle by = ResourceBundle.getBundle("MyBundle", new Locale("be","BY"));
        ResourceBundle ru = ResourceBundle.getBundle("MyBundle", new Locale("ru","RU"));
        ResourceBundle us = ResourceBundle.getBundle("MyBundle", Locale.US);

        System.out.println(def.getString("hello"));
        System.out.println(by.getString("hello"));
        System.out.println(ru.getString("hello"));
        System.out.println(us.getString("hello"));

        System.getProperties()
                .forEach((o, o2) -> System.out.println(o+"="+o2));

        String userName = System.getProperty("user.name");
        System.out.println(userName+", "+def.getString("bye"));
        System.out.println(userName+", "+by.getString("bye"));
        System.out.println(userName+", "+ru.getString("bye"));
        System.out.println(userName+", "+us.getString("bye"));
    }
}
