package by.pvt;


import by.pvt.test.Car;
import by.pvt.test.OneArgumentConstructor;

import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {

        try {
            Class aClass = Class.forName("by.pvt.test.Car");

            Constructor [] constructors = aClass.getDeclaredConstructors();
            AccessibleObject.setAccessible(constructors,true);



            for (Constructor constructor: constructors){
                System.out.println(constructor.getName()+" "
                        + constructor.getParameterCount()+" "
                        + Arrays.toString(constructor.getParameterTypes())+" "
                );

                Annotation [] annotations = constructor.getDeclaredAnnotations();
                System.out.println(Arrays.toString(annotations));
                if (annotations.length==1) {
                    if (annotations[0].annotationType().getName().equals(
                            OneArgumentConstructor.class)
                    ) {
                        Car car = (Car) constructor.newInstance("NEW VIN!!!");
                        System.out.println(car);
                    }
                }

                Car car = null;
                if (constructor.getParameterCount()==3){
                    car=(Car)constructor.newInstance("1234ABCD",2019,45999.99);
                } else if (constructor.getParameterCount()==1) {
                    car = (Car) constructor.newInstance("5678EFGH");
                }else{
                    car = (Car) constructor.newInstance();
                }
                System.out.println(car);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
