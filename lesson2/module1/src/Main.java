public class Main {
    public static void main(String[] args) { // запускается метод main
        Person man = new Person("Vasia Pupkin");//Person - тип, прототип, класс, объект; man - ссылка на Person
        //создали пеерменную тип Person, ссылвется на объект new Person

        System.out.println("isAlive= "+man.isAlive);
        System.out.println("Name= "+man.name);

        System.out.println(man.name.length());//NPE - NullPointerException ошибка ссылка на пустоту
        System.out.println("Cells="+man.cells);
        System.out.println("Man age: "+man.age);
        System.out.println("Man height: "+man.heightInCm);
        man.grow();
        System.out.println("Man height: "+man.heightInCm);
        Person woman = new Person();
        System.out.println("Woman heigth: "+woman.heightInCm );

    }
}
