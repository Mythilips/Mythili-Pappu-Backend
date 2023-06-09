package org.Week2.DataStructuresAlgorithms2;

public class FibonacciSeries {

    public static void printFibonacciSeries(int n) {
        int first = 0;
        int second = 1;
        int count = 2;

        System.out.print(first + " " + second + " ");

        while (count < n) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
            count++;
        }
    }

    public static void main(String[] args) {
        int N = 30;
        System.out.println("Fibonacci Series up to " + N + " terms:");
        printFibonacciSeries(N);
    }
}
