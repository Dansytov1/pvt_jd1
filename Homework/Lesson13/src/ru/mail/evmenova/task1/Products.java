package ru.mail.evmenova.task1;

public class Products {

    public String productName;

    public Products(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productName='" + productName + '\'' +
                '}';
    }
}
