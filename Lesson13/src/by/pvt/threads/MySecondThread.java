package by.pvt.threads;

public class MySecondThread implements Runnable {

    @Override
    public void run() {
        try {
            Thread thread =Thread.currentThread();//получаем доступ к текущему потоку
            System.out.println(thread.getName()+" Thread ID = "+thread.getId()+
                    " MySecondThread");
            System.out.println(thread.getName()+" thread.getPriority="+thread.getPriority());
            System.out.println(thread.getName()+" thread.getName="+thread.getName());
            Thread.sleep(5000);
            System.out.println(thread.getName()+" thread.getState().name="+thread.getState().name());
            System.out.println(thread.getName()+" thread.isDaemon="+thread.isDaemon());
            System.out.println(thread.getName()+" thread.isAlive="+thread.isAlive());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
