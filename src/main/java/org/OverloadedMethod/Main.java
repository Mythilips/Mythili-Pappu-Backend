package org.OverloadedMethod;

public class Main {

    public static void main(String[] args) {
        Product product = new Product(10.0);
        System.out.println("Price for single quantity: $" + product.getPrice());

        product.setPrice(12.5);
        System.out.println("Updated price for single quantity: $" + product.getPrice());

        int quantity = 5;
        double totalPrice = product.getPrice(quantity);
        System.out.println("Total price for " + quantity + " quantities: $" + totalPrice);
    }
}
