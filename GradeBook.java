import java.util.*;

public class GradeBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numStudents, numSubjects;
        System.out.print("Enter the number of students: ");
        numStudents = input.nextInt();
        System.out.print("Enter the number of subjects: ");
        numSubjects = input.nextInt();

        String[] studentNames = new String[numStudents];
        double[][] studentGrades = new double[numStudents][numSubjects];
        double[] studentAverages = new double[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            studentNames[i] = input.next();

            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter the grade for " + studentNames[i] + " in subject " + (j + 1) + ": ");
                studentGrades[i][j] = input.nextDouble();
            }
        }

        for (int i = 0; i < numStudents; i++) {
            double sum = 0.0;

            for (int j = 0; j < numSubjects; j++) {
                sum += studentGrades[i][j];
            }

            studentAverages[i] = sum / numSubjects;
        }

        for (int i = 0; i < numStudents; i++) {
            System.out.println(studentNames[i] + "'s average grade is " + studentAverages[i]);
        }
    }
}