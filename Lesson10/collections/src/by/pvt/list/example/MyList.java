package by.pvt.list.example;

import java.util.ArrayList;
import java.util.List;



class MyClass{
    private String value;

    MyClass(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }



    @Override
    public boolean equals(Object obj) {
        if (obj==null||this.value==null) return false;
        return this.value.equals(((MyClass)obj).value);
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}

public class MyList {

    public static void main(String[] args) {

        List<MyClass> list1=new ArrayList<>();
        list1.add(new MyClass("object1"));
        System.out.println("list1.size="+list1.size());

        System.out.println("list1= "+list1+" "+list1.size());

        list1.add(new MyClass("object2"));

        System.out.println("list1= "+list1+" "+list1.size());

        list1.add(list1.size(),new MyClass("object3"));
        System.out.println("list1= "+list1+" "+list1.size());

        list1.addAll(List.of(new MyClass("object4"),new MyClass("object5")));
        System.out.println("list1= "+list1+" "+list1.size());


        System.out.println("contains object3" +
                list1.contains(new MyClass("object3")));

        list1.remove(2);
        System.out.println("list1= "+list1+" "+list1.size());

        list1.add(2,null);
        list1.add(2,null);
        System.out.println("list1= "+list1+" "+list1.size());

        list1.clear();
        System.out.println("list1= "+list1+" "+list1.size());



    }
}
