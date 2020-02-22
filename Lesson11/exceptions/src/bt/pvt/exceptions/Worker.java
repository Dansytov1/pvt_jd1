package bt.pvt.exceptions;




public class Worker {

    public void doWork1(String task) throws Throwable {
        System.out.println("do work 1");
        doWork2(task);
    }

    public void doWork2(String task) throws Exception {
        System.out.println("do work 2");
        doWork3(task);
    }

    public void doWork3(String task) throws MyFirstException {
        System.out.println("do work 3");
        if ("".equals(task)) {
            throw new MyFirstException("Cannot execute. Task is empty");
        }
        System.out.println(task+" is done.");
    }
}
