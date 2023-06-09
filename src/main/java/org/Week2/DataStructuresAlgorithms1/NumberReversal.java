package org.Week2.DataStructuresAlgorithms1;

public class NumberReversal {
    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = reverseNumber(number);
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversedNumber);
    }
}
