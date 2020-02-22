package by.pvt.threads;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        try {
            Thread thread =Thread.currentThread();//получаем доступ к текущему потоку
            System.out.println("Thread ID = "+thread.getId());
            System.out.println("thread.getPriority="+thread.getPriority());
            System.out.println("thread.getName="+thread.getName());
            Thread.sleep(5000);
            System.out.println("thread.getState().name="+thread.getState().name());
            System.out.println("thread.isDaemon="+thread.isDaemon());
            System.out.println("thread.isAlive="+thread.isAlive());
        } catch (Exception e) {
            e.printStackTrace();
        }

        //MyFirstThread myFirstThread = new MyFirstThread();
        //myFirstThread.start();
        //myFirstThread.start();
        new MyFirstThread("name1").start();
        new MyFirstThread("name2").start();
        new MyFirstThread("name3").start();

        //MySecondThread mySecondThread = new MySecondThread();
        //mySecondThread.run();
        new Thread(new MySecondThread()).start();
    try{
        Thread.sleep(500);
        MySecondThread mySecondThread = new MySecondThread();
        Thread mySecond = new Thread(mySecondThread);
        System.out.println(mySecond.getState().name());
        mySecond.start();
        Thread.sleep(5000);
        System.out.println(mySecond.getState().name());
        mySecond.stop();
        Thread.sleep(5000);
        System.out.println(mySecond.getState().name());
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    }
}
