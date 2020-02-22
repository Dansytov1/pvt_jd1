package ru.mail.evmenova;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(1);
        a.add(5);
        a.add(8);
        b.add(4);
        b.add(7);
        b.add(10);
        merge(a, b);
    }

    public static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        List<Integer> margeList = CollectionUtils.collate(a,b);


        System.out.println(c);
        System.out.println(b);
    }
}