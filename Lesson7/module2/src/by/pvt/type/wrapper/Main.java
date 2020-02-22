package by.pvt.type.wrapper;


import java.util.Random;

public class Main {
    static Boolean aBoolean=true;
    static Byte aByte=1;
    static Character character='a';
    static Float aFloat=1.5f;
    static Integer integer=15;
    static Long aLong=123456789L;
    static Short aShort=123;
    static Double aDouble=1.125;

    public static void main(String[] args) {
        Main main = new Main();
        boolean b=aBoolean;
        byte b1 = aByte;
        char c=character;
        float f=aFloat;
        int i=integer;
        long aL = aLong;
        short s=aShort;
        double d =aDouble;
        System.out.println(b+"\n"+
                b1+"\n"+
                c+"\n"+
                f+"\n"+
                i+"\n"+
                aL+"\n"+
                s+"\n"+
                d);

        //два способа сгенерировать случайные числа
        System.out.println((int)(100*Math.random()));
        System.out.println(new Random().nextInt(100));
    }
}

