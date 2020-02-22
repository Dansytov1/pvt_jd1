package ru.mail.evmenova;

import java.util.function.Predicate;

public class Lammbda {
    public static void main(String[] args) {
        Predicate<Integer> number = n -> n >= 10 && n <= 20;
        if (number.test(15)) {
            System.out.println("Число принадлежит зданному промежутку");
        }
        if (!number.test(5)) {
            System.out.println("Число не принадлежит зданному промежутку");
        }

        MyTest<Integer> number1 = n -> n >= 10 && n <= 20;
        if (number1.testing(15)) {
            System.out.println("Число принадлежит зданному промежутку");
        }
        if (!number1.testing(5)) {
            System.out.println("Число не принадлежит зданному промежутку");
        }

        NumericFunc numFunc = (n -> {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        });
        System.out.println(numFunc.func(5));

        MyFunc<Integer> myFunc = (n->{
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        });
        System.out.println(myFunc.func(5));
        }
}
