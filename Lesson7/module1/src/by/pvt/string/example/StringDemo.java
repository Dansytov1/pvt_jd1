package by.pvt.string.example;




public class StringDemo {


    public static void main(String[] args) {
        String s1 = "test";
        String s2 = "test";
        System.out.println("s1==s2 "+(s1==s2));//проверяет соответствие области памяти(на один ли объект памяти ссылаются переменные)
        System.out.println("s1.equals(s2) "+s1.equals(s2));//проверяет содержимое

        String s3 = new String("test");//если так создать, не помещает в String pull
        System.out.println("s1==s3 "+(s1==s3));
        System.out.println("s1.equals(s3) "+s1.equals(s3));
        //s3=s2; если ссылаемся на объект, который есть в String pull, то он тоже поместиться в String pull
        s3=s3.intern();//этот метод отправляет объект в String pull
        System.out.println("s1==s3 "+(s1==s3));
        System.out.println("s1.equals(s3) "+s1.equals(s3));

        String s4 ="11";//цифры
        String s5 ="ll";//буквы
        System.out.println("s4.equals(s5) "+s4.equals(s5));
    }
}
