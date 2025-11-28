import java.util.Scanner;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class GradeCalculator {

    public static void validateMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100. You entered: " + marks);
        }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Marks of Test 1: ");
            int m1 = sc.nextInt();
            validateMarks(m1);

            System.out.print("Enter Marks of Test 2: ");
            int m2 = sc.nextInt();
            validateMarks(m2);

            System.out.print("Enter Marks of Test 3: ");
            int m3 = sc.nextInt();
            validateMarks(m3);

            double average = (m1 + m2 + m3) / 3.0;

            char grade;
            if (average >= 90)
                grade = 'A';
            else if (average >= 75)
                grade = 'B';
            else if (average >= 60)
                grade = 'C';
            else if (average >= 40)
                grade = 'D';
            else
                grade = 'F';

            System.out.println("\nAverage Marks: " + average);
            System.out.println("Final Grade : " + grade);

        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter only integers.");
        }

        sc.close();
    }
}
