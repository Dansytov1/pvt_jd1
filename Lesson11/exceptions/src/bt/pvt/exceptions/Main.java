package bt.pvt.exceptions;





public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        try {
            worker.doWork1("");
        } catch (NullPointerException e) {
            System.out.println("Catching NPE");
            e.printStackTrace();
        } catch (MyFirstException e) {
            System.out.println("Catch my exception");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (Throwable t){
            System.out.println("Catch Throwable");
            t.printStackTrace();
        } finally {
            System.out.println("Finish call workers");
        }
    }
}
