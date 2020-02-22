package by.pvt;

public class NumberPrinter {

    public void printNumber (RandomIntGenerator intGenerator){
        System.out.println(
                intGenerator.generate(
                        intGenerator.getLimit()
                )

        );
    }

    public void printSum(IntegerSum integerSum, int bound){
        System.out.println(integerSum.calculateSum(bound));
    }
}
