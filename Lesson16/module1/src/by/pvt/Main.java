package by.pvt;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        NumberPrinter numberPrinter = new NumberPrinter();
        numberPrinter.printNumber(new RandomIntGenerator() {//анонимный внутренний класс
            @Override
            public Integer generate(int limit) {
                return new Random().nextInt(limit);
            }


        });

        numberPrinter.printNumber(limit->new Random().nextInt(limit));
        numberPrinter.printSum(
                x->{
                    int res=0;
                    for(int i=0;i<=x;i++) {
                        res += i;
                    }
                    return res;
                },
                3
        );
        numberPrinter.printSum(
                x->{
                    int res=0;
                    for(int i=0;i<=x;i++) {
                        res += i;
                    }
                    return res;
                },
                10
        );


        //ссылка на метод
        System.out.println("integerSum::calculateSum");
        IntegerSumImpl integerSum =new IntegerSumImpl();
        numberPrinter.printSum(
                integerSum::calculateSum,
                10
        );
        System.out.println("Main::get");
        numberPrinter.printSum(
                Main::get,
                10
        );
        System.out.println("myRandom::nextInt");
        Random myRandom=new Random();
        numberPrinter.printSum(
                myRandom::nextInt,
                10
        );
        System.out.println("Integer::valueOf");
        numberPrinter.printSum(
                Integer::valueOf,
                321
        );
    }
    static int get(int i){
        return 999;
    }
}