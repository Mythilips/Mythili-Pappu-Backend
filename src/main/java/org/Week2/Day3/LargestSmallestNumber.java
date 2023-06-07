package org.Week2.Day3;

public class LargestSmallestNumber {

        public static void findLargestSmallest(int[] arr) {
            if (arr == null || arr.length == 0) {
                System.out.println("The array is empty.");
                return;
            }

            int smallest = arr[0];
            int largest = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < smallest) {
                    smallest = arr[i];
                }
                if (arr[i] > largest) {
                    largest = arr[i];
                }
            }

            System.out.println("Largest number: " + largest);
            System.out.println("Smallest number: " + smallest);
        }

        public static void main(String[] args) {
            int[] array = {5, 8, 2, 11, 3, 9, 6};
            findLargestSmallest(array);
        }

}
