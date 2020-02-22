package by.pvt.threads;


import java.util.ArrayList;
import java.util.List;

public class ATM {

    private Integer count = 0;
    private List<Integer> money = new ArrayList<>();

    public int increment() {
        synchronized (count) {
            ++count;
            return count;
        }
    }

    public synchronized int decrement() {
        --count;
        return count;
    }

    public void printCount() {
        System.out.println("Count=" + count);
    }

    public void addMoney(Integer money){
        this.money.add(money);
    }

    public Integer getMoney(Integer money){
        if (this.money.remove(money)){
            return money;
        }else {
            return 0;
        }
    }
}
