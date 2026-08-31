import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("Enter 10 integers:");

        // Input
        for (int i = 0; i < 10; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int smallest = arr[0];
        int sum = 0;
        int evenCount = 0;
        int oddCount = 0;

        // Calculations
        for (int i = 0; i < 10; i++) {

            // Sum
            sum += arr[i];

            // Largest
            if (arr[i] > largest) {
                largest = arr[i];
            }

            // Smallest
            if (arr[i] < smallest) {
                smallest = arr[i];
            }

            // Even and Odd
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        double average = sum / 10.0;

        // Display results
        System.out.println("\n----- RESULTS -----");
        System.out.println("Largest element = " + largest);
        System.out.println("Smallest element = " + smallest);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Number of even elements = " + evenCount);
        System.out.println("Number of odd elements = " + oddCount);

        sc.close();
    }
}
