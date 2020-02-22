package by.pvt.array;
import java.util.Arrays;



public class Main {
    public static void main(String[] args) {
        System.out.println("args: "+args);
        System.out.println("args.length: "+args.length);
        printArray(args);
        System.out.println();
        Arrays.sort(args);
        printArray(args);
        sortInteger();


    }

    private static void printArray(String[] args) {
        for(int i=0;i<args.length;i++) {
            System.out.println("args[" + i + "] = " + args[i]);

        }
    }

    private static void sortInteger(){
        long [] intArray = new long[10];
        for (int i=1; i<intArray.length; i++) {
            intArray[i]=Math.round(100*Math.random());
        }
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
    }
}
