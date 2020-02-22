package by.pvt;

import com.sun.jdi.LongValue;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws Exception {
        long t = System.currentTimeMillis();

        ExecutorService executorService = null;
        try {
            executorService = Executors.newCachedThreadPool();
            executorService.submit(count());

            Future<List<Integer>> busyPorts =executorService.submit(checkPorts());
            System.out.println("Busy ports: "+busyPorts.get());


            Future<Long> result = executorService.submit(sum());
            long res = result.get();
            System.out.println("Async call sum: " + res);



        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
            if (executorService != null) {
                executorService.shutdown();
                System.out.println("Finish in " + (System.currentTimeMillis() - t) + " ms");
            }
        }
        //Execute in one main Thread
        /*count();
        long sumTotal = sum();
        System.out.println(sumTotal);
        checkPorts();*/

    }

    static Runnable count() {
        return () -> {
            for (int i = 0; i < 100_000; i++) {
                //new String(String.valueOf(i));
            }
            System.out.println("Finished count");
        };
    }

    static Callable<Long> sum() {
        return ()->{
        long sum = 0;
        for (int i = 0; i < 100_000; i++) {
            sum += i;
        }
        return sum;
    };

}

    static Callable<List<Integer>> checkPorts() {
        return ()-> {
            List<Integer> busyPorts = new ArrayList<>();
            for (int port = 0; port <= 65_535; port++) {
                try {
                    new ServerSocket(port);
                } catch (IOException e) {
                    //System.out.println(e.getMessage()+" "+port);
                    busyPorts.add(port);
                }
            }
            return busyPorts;
        };
    }
}

