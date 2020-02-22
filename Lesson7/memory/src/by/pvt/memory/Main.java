package by.pvt.memory;


import java.util.ArrayList;
import java.util.List;

public class Main{

     static List<Item> items=new ArrayList<>();


    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        //long t1 = System.nanoTime(); для большей точности

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        for(int i=0; i<=1_000_000;i++) {

            items.add(new Item(i,String.valueOf(i)));

        }
        long t2 =System.currentTimeMillis();
        System.out.println("Execution time: "+(t2-t1)+" milisec");

    }
}

class Item {
    long aLong;
    String string;

    public Item(long aLong, String string) {
        this.aLong = aLong;
        this.string = string;
    }
}
