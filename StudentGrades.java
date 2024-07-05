import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Ask for the number of students
        System.out.print("Enter the number of students: ");
        int Students = sc.nextInt();
        
        // Create an array to store student grades
        int[] grades = new int[Students];
        
        // Input student grades
        System.out.println("Enter the grades for " + Students + " students: ");
        for (int i = 0; i < Students; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
        }
        
        // Calculate average, highest, and lowest grades
        int sum = 0;
        int highest = grades[0];
        int lowest = grades[0];
        
        for (int grade : grades) {
            sum += grade;
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }
        
        double average = (double) sum /Students;
        
        // Output results
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
        
        sc.close();
    }
}