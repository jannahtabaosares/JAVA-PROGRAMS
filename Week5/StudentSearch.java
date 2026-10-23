/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK5;

/**
 *
 * @author jltabaosares
 */
public class StudentSearch {

    // Student class stores each student's name and quiz scores
    static class Student {
        String name;
        int[] quizzes;
        double average;

        Student(String name, int[] quizzes) {
            this.name = name;
            this.quizzes = quizzes;

            int sum = 0;
            for (int i = 0; i < quizzes.length; i++) {
                sum += quizzes[i];
            }

            average = (double) sum / quizzes.length;
        }
    }

    // Own linear search that returns the student's rank
    public static int linearSearch(Student[] students, String targetName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equalsIgnoreCase(targetName)) {
                return i + 1;
            }
        }

        return -1;
    }

    // Own sorting algorithm: Bubble Sort, highest average first
    public static void sortStudents(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].average < students[j + 1].average) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("             CLASS RANKING SYSTEM");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        // Raw quiz data: each row contains four quiz scores
        String[] names = {"Tobio", "Eren", "Ian", "Atsumu", "Bokuto"};

        int[][] quizData = {
            {95, 90, 92, 93},
            {88, 90, 86, 92},
            {85, 87, 89, 91},
            {88, 90, 86, 92},
            {78, 82, 80, 84}
        };

        // Build an array of Student objects from the raw data
        Student[] students = new Student[names.length];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(names[i], quizData[i]);
        }

        // Sort students by average score
        sortStudents(students);

        // Print the leaderboard and assign the same rank to tied averages
        System.out.println("\n--------------- LEADERBOARD ---------------");
        System.out.printf("%-8s %-12s %-10s%n", "RANK", "NAME", "AVERAGE");
        System.out.println("--------------------------------------------");

        int rank = 1;

        for (int i = 0; i < students.length; i++) {

            // Students with the same average share the same rank
            if (i > 0 && students[i].average != students[i - 1].average) {
                rank = i + 1;
            }

            System.out.printf("%-8d %-12s %-10.2f%n",
                    rank, students[i].name, students[i].average);
        }

        System.out.println("--------------------------------------------");

        // Search for a student by name
        String targetName = "Noya";
        int foundRank = linearSearch(students, targetName);

        System.out.println("\n--------------- STUDENT SEARCH -------------");
        System.out.println("Student to find: " + targetName);

        if (foundRank != -1) {
            System.out.println("Rank: " + foundRank);
        } else {
            System.out.println("Student not found.");
        }

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }
}

