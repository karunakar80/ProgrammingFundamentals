package com.demo.array.student;

import java.util.Arrays;
import java.util.Scanner;

public class StudentCreateCalculator {
    public static void main(String[] args) {
        int count = 4;
        float totalMarks = 0, percetage, average;
        int[] studentOneGrades = {78, 89, 78, 80};
        int[] studentTwoGrades = {78, 67, 68, 92};
        int[] studentThreeGrades = {88, 92, 92, 94};
        String[] students = {"sharath", "varun", "raghu"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student Names: " + Arrays.toString(students));
        System.out.print("Enter a student's name:");
        String selectedStudentName = scanner.nextLine();

    }}
