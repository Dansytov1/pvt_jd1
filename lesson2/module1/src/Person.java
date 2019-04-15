public class Person {

    char sex = 'M';
    String name;
    byte age = 034;
    int heightInCm = 60;
    long cells = 100_000_000;//"_"нельзя использовать в начале, в конце и рядом с точкой у переменных с точкой
    boolean isAlive; //or false
    public Person(){ // если мы сами не указываем такой конструктор, то Java его создает сама
        isAlive=true;
        System.out.println("Call Person()");
    }
    public Person(String name){
        this(); //ссылается на конструктор без аргументов, всегда должен быть первым
        this.name = name;//
        System.out.println("Call Person(String name)");//логирование - отслеживание, что делает программа, зашла ли в конструктор

    }
    public void grow(){
        heightInCm = heightInCm+5;
    }
}

