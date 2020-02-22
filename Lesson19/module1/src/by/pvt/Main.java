package by.pvt;

import by.pvt.test.Car;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        try {
            Class aClass = Class.forName("by.pvt.test.Car");
            System.out.println(aClass);

            Field[] fields = aClass.getDeclaredFields();
            AccessibleObject.setAccessible(fields,true);

            for(Field field:fields) {
                System.out.println(field.getName()+" "
                        + field.getModifiers()+" "
                        +field.getGenericType());
                //Object obj=new Object();
                Object s=field.get(new Car());
                System.out.println(s);

                if(field.getName().equals("VIN")){
                    Car car2 = new Car();
                    System.out.println(car2);
                    field.set(car2, "MY_NEW_VIN");
                    System.out.println(car2);
                }
            }
            System.out.println("METHODS: ");
            Method[]methods = aClass.getDeclaredMethods();
            AccessibleObject.setAccessible(methods,true);
            for (Method method: methods){
                System.out.println(method.getName()+" "
                +method.getModifiers()+" "
                + Arrays.toString(method.getParameterTypes())+" "
                +method.getReturnType());

                if (method.getName().equals("openDoor"))
                method.invoke(new Car(), "my key");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
