package org.Week1.Abstraction.OverloadedMethod;

public class Product {
    private double price;

    public Product(double price) {
    this.price = price;
    }

    // Getter method
    public double getPrice() {
        return price;
    }

    //Setter method
    public void setPrice(double price) {
        this.price = price;
    }

    // Overloaded method
    public double getPrice(int quantity) {
        return price * quantity;
    }
}