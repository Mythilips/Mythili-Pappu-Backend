package org.Week2.DataStructuresAlgorithms4;

import java.io.*;
import java.util.*;

class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Student other) {
        return this.lastName.compareTo(other.lastName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (GPA: " + gpa + ")";
    }
}

public class CSVReaderExample {
    public static void main(String[] args) throws IOException {
        String csvFile = "students.csv"; // Replace with the path to your CSV file
        List<Student> students = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(csvFile));
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            String firstName = data[0].trim();
            String lastName = data[1].trim();
            double gpa = Double.parseDouble(data[2].trim());
            students.add(new Student(firstName, lastName, gpa));
        }

        br.close();

        Collections.sort(students);

        System.out.println("Sorted Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
