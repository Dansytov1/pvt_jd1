package by.pvt.serial;


import java.io.*;

class Car implements Serializable{
    private static final long serialVersionUID=2L;// номер версии класса, при изменении полей надо менять
    String name;
    transient  int price;
    int weight;

    static int year=2016;
}


public class ExampleSerial {
    public static void main(String[] args) {
        try {
            ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream(new FileOutputStream("car.serial"));
            Car car1 = new Car();//1-ый способ через конструктор
            car1.name="BMW X6";
            car1.price=150_000;
            car1.year=2016;
            objectOutputStream.writeObject(car1);//serialization
            objectOutputStream.flush();// записываем
            objectOutputStream.close();//закрываем

            ObjectInputStream objectInputStream =
                    new ObjectInputStream(new FileInputStream("car.serial"));
            Object obj = objectInputStream.readObject();//deserialization
            Car car2 = (Car)obj;
            System.out.println(car2.name+" "+car2.price+" "+car2.year);

        } catch (IOException |ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
