package by.pvt.generics;

import java.math.BigDecimal;
import java.math.MathContext;

public class Main {
    public static void main(String[] args) {
        Box <Integer>box1 = new Box<>(25);
        System.out.println(box1);

        Box <Float>box2=new Box<>(52.12f);

        System.out.println(box2);

        BigDecimal i1 = new BigDecimal(box1.getValue());
        System.out.println(i1);
        BigDecimal i2 = new BigDecimal(box2.getValue(), new MathContext(4));
        BigDecimal sum=i1.add(i2);
        System.out.println(i2);
        System.out.println("sum="+ sum.doubleValue());
    }
}
