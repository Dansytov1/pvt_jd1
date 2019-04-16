package my.auto;

public class Main {
    public static void main(String[] args) {

        Car car1=new Car();
        car1.driveForward();
        car1.driveForward();
        car1.driveForward();
        car1.driveForward();

        car1.driveBackword();
        car1.driveBackword();

        int i=13%4;
        System.out.println("i="+i);


        boolean b1=true;
        System.out.println("b1="+b1);

        boolean b2 = car1 instanceof Car;
        System.out.println("b2="+b2);

        System.out.println(15==10);

        String s1="s1";
        String s2="s1";
        System.out.println("s1==s2="+(s1==s2));
        System.out.println("s1.equals(s2)="+s1.equals(s2));

        car1.checkService();
        car1.isServiceNeeded=true;
        car1.checkService();
        car1.checkGasTank();
        car1.gas+=40;
        car1.checkGasTank();
        car1.gas-=10;
        car1.checkGasTank();

        int i2=0;
        i=0;




        //i2=i++;
        //i2=i;
        //i=i+1;
        i2=++i;



        System.out.println("i="+i);
        System.out.println("i2="+i2);

        int bi1=0b0010;
        int bi2=0b1011;
        System.out.println("bi1 & bi2="+Integer.toBinaryString(bi1&bi2));//битовые операции как правило не используются
        System.out.println("bi1 | bi2="+Integer.toBinaryString(bi1|bi2));//битовые операции как правило не используются
        System.out.println("bi1 ^ bi2="+Integer.toBinaryString(bi1^bi2));//битовые операции как правило не используются



        car1.checkHandBreak();//1
        car1.isHandBreakOn=true;
        car1.checkHandBreak();//2
        car1.isHandBreakOn=!car1.isHandBreakOn;
        car1.checkHandBreak();//3









    }
}
