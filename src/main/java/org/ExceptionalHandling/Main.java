package org.ExceptionalHandling;

public class Main {
    public static void main(String[] args) {
        convertToInt("23");
        convertToInt("45.67");
        convertToInt("test");
        convertToInt("123f");
    }

    public static void convertToInt(String input) {
        try {
            int value = Integer.parseInt(input);
            System.out.println("Input: " + input + " - Converted to int: " + value);
        } catch (NumberFormatException e) {
            System.out.println("Input: " + input + " - Exception: " + e.getMessage());
        }
    }
}
