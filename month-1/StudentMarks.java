import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        int marks;

        System.out.println("Enter marks for 5 subjects:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Subject " + i + ": ");
            marks = sc.nextInt();
            total += marks;
        }

        double percentage = total / 5.0;

        System.out.println("\nTotal Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");

        // Grade
        if (percentage >= 90) {
            System.out.println("Grade = A+");
        } else if (percentage >= 80) {
            System.out.println("Grade = A");
        } else if (percentage >= 70) {
            System.out.println("Grade = B");
        } else if (percentage >= 60) {
            System.out.println("Grade = C");
        } else if (percentage >= 50) {
            System.out.println("Grade = D");
        } else {
            System.out.println("Grade = F");
        }

        // Pass/Fail
        if (percentage >= 40) {
            System.out.println("Result = PASS");
        } else {
            System.out.println("Result = FAIL");
        }

        sc.close();
    }
}