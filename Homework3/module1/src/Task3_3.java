import java.util.Scanner;

public class Task3_3 {
    public static void main(String[] args) {
        Scanner consoleScanner=new Scanner(System.in);

        System.out.print("Enter hole side, a= ");
        String number1 = consoleScanner.nextLine();

        System.out.print("Enter hole side, b= ");
        String number2 = consoleScanner.nextLine();

        System.out.print("Enter the radius of the round cardboard, r= ");
        String number3 = consoleScanner.nextLine();

        double a = Double.parseDouble(number1);
        double b = Double.parseDouble(number2);
        double r = Double.parseDouble(number3);


        double diagonalHole = Math.sqrt((Math.pow(a,2)+Math.pow(b,2)));

        double diametrCardboard = 2*r;

        if (diametrCardboard>=diagonalHole){
            System.out.println("Hole with side a="+a+" " + "and sibe b="+b+" can " +
                    "be closed with a round cardboard with a radius r="+r);

        } else{
            System.out.println("Hole with side a="+a+" " + "and sibe b="+b+" can not " +
                    "be closed with a round cardboard with a radius r="+r);
        }

    }
}
