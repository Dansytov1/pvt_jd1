package ru.mail.evmenova;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class TaskMaxMin {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add((int)Math.round(Math.random()*100));
        list.add((int)Math.round(Math.random()*100));

        Consumer consumer1 = System.out::println;
        list.forEach(consumer1);

        list.sort((o1, o2) -> {
            int max=Math.max(o1,o2);
            System.out.println("MAX="+max);
            return max;
        });

        list.sort((o1, o2) -> {
            int min=Math.min(o1,o2);
            System.out.println("MIN="+min);
            return min;
        });
    }

}
