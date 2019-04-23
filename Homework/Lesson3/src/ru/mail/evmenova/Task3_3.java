package ru.mail.evmenova;

import java.util.Scanner;

public class Task3_3 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        double a = readNumber(scanner, "Enter hole side, a= ");
        double b = readNumber(scanner, "Enter hole side, b= ");
        double r = readNumber(scanner, "Enter the radius of the round cardboard, r= ");

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

    private static double readNumber(Scanner scanner,String message){
        double num=0;
        do{
            System.out.println(message);
            String number1 = scanner.nextLine();
            try {
                num = Double.parseDouble(number1);
            }catch(NumberFormatException e){
            }
            if (num<=0){
                System.out.println("ERROR!!! Enter the correct number!!!");
            }else{
                return num;
            }
        }while (true);
    }
}


