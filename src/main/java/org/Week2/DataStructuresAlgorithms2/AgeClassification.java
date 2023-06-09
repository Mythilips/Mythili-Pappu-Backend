package org.Week2.DataStructuresAlgorithms2;

public class AgeClassification {
     public static void classifyAge(int age) {
            if (age < 13) {
                System.out.println("Kid");
            } else if (age >= 13 && age <= 19) {
                System.out.println("Teen");
            } else {
                System.out.println("Adult");
            }
        }

        public static void main(String[] args) {
            int age1 = 8;
            int age2 = 15;
            int age3 = 25;

            System.out.println("Person 1:");
            classifyAge(age1);

            System.out.println("Person 2:");
            classifyAge(age2);

            System.out.println("Person 3:");
            classifyAge(age3);
        }



}

