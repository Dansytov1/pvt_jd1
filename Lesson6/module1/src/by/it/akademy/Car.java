package by.it.akademy;





class Engine extends Object { //нельзя использовать private, public, protected
    void start(){}
}

final class DieselEngine extends Engine{
    final void start(){}
}

public class Car {


    public void openDoor() {
    }//если хоти чтобы другие пользовались

    protected void openWindow() {
    } // из классов находящихся в этом пакете, либо из классов потомко класаа Car

    void startEngine() {
    }// видимость только внутри пакета и наследнику не видно

    private void checkOilLevel() {
    }//доступно только в этом классе

    final Engine engine;
    static String CAR_NAME="BMW";//единожды определна в классе и для всех объектов класса будет одинакова, если есть final

    public Car(String plateNumber) {
        this.engine=new DieselEngine();
        this.plateNumber=plateNumber;
        final String s;//final создает константы
        s="new s";
            }


        String plateNumber;

        static void printCheck(String checkNr) {
            System.out.println(CAR_NAME+" "+checkNr);
        }
        void printInvoice(String invoiceNumber){
            System.out.println(plateNumber+" InvoiceNumber="+invoiceNumber);

        }

        public static void main(String[] args) {
        Car car1=new Car("1234 BY-7");
        System.out.println(car1.CAR_NAME);
        car1.CAR_NAME="lada kalina";
        car1.printInvoice("Inv1");



        Car car2=new Car("5678 BY-7");
        System.out.println(car2.CAR_NAME);
        car2.printInvoice("Inv 2");

        System.out.println(Car.CAR_NAME);
        Car.CAR_NAME="lada kalina";

        car1.printCheck("Check 1");
        car2.printCheck("Check 1");


    }
}