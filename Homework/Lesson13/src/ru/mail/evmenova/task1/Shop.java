package ru.mail.evmenova.task1;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private boolean isFree=false;
    private List<Products> products;
    private String buyerName;
    String products1;

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "isFree=" + isFree +
                '}';
    }

    public boolean isProductsEmpty() {
        return products.isEmpty();
    }

    public Products takeProducts(){
        return products.remove(0);
    }

    public synchronized void newBuyer(){
        try {
                String buyerName = Thread.currentThread().getName();
                products1 = takeProducts().getProductName();
                System.out.println("Shop: " + buyerName + " takes " + products1);
                System.out.println("Shop: new buyer in cashier - " + buyerName);
                outputASetOfProducts();
                while (this.buyerName != null) {
                    Thread.sleep(200);
                    System.out.println("Shop: buyer " + buyerName + " is waiting");
                }

                this.buyerName = buyerName;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void outputASetOfProducts() {
        System.out.println("outputASetOfProducts");
        while (buyerName != null) {
            setFree(false);
            System.out.println("Shop: cashier serves "+buyerName);
            System.out.println("Shop: cashier finished "+buyerName+" your products: "+products1);
            setFree(true);
            this.buyerName=null;
        }
    }

    public void addProducts(List<Products> productsList) {
        if (products==null) products = new ArrayList<>();
        products.addAll(productsList);
    }


}
