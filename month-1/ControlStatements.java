import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // If-else
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positive number");
        } else if (num < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }

        // For loop
        System.out.println("\nFor Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // While loop
        System.out.println("\nWhile Loop:");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        // Do-while loop
        System.out.println("\nDo-While Loop:");
        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);

        // Switch-case
        System.out.print("\nEnter a number from 1 to 3: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected One");
                break;
            case 2:
                System.out.println("You selected Two");
                break;
            case 3:
                System.out.println("You selected Three");
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}

 

