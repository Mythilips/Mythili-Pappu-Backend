package org.ExceptionalHandling;

// Main1.java
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Main.java (Example usage)
public class Main1 {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            try {
                throw new CustomException("Custom Exception: Division by zero not allowed");
            } catch (CustomException ce) {
                System.out.println(ce.getMessage());
            }
        }
    }

    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}

