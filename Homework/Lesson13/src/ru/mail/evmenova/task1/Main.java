package ru.mail.evmenova.task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Shop shop = new Shop();

        List<Products> initialProducts = List.of(
                new Products("bread"),
                new Products("milk"),
                new Products("tomato"),
                new Products("cheese"));
        shop.addProducts(initialProducts);

        for (int i = 1; i < 6; i++) {
            Buyer buyer1=new Buyer();
            buyer1.setShop(shop);
            new Thread(buyer1, "Buyer " + i).start();
        }


    }
}