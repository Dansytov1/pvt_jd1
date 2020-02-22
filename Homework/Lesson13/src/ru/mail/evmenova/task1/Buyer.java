package ru.mail.evmenova.task1;


public class Buyer implements Runnable{

    private Shop shop;

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        try {
                if (!shop.isProductsEmpty()) {
                    shop.newBuyer();
                } else {
                    System.out.println("Buyer: there are no more products in the shop");
                }
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
