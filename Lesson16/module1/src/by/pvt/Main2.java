package by.pvt;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main2 {

    public static void main(String[] args) {
        new Thread(Main2::get,"My Thread").start();

        List<String> list = new ArrayList<>(3);
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        Consumer<String> consumer =
                element->System.out.println(element);

        Consumer<String> consumer2 = System.out::println;
        list.forEach(consumer2);

        list.sort((o1, o2) -> {
            int res=0;
            res=o1.length()-o2.length();
            return res;
        });
        list.forEach(System.out::println);

        list.forEach(consumer);
    }

    static void  get(){
        System.out.println("Hello Lambda");
    }

}
