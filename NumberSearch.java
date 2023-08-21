package NumberSearchProject;
import java.util.Scanner;

public class NumberSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 5; // Number of elements

        int[] numbers = new int[n]; // Create an array to store numbers

        // Input loop to get 5 elements from the user
        System.out.println("Enter 5 elements for the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter a number to search for: ");
        int target = scanner.nextInt();

        boolean found = false;

        // Loop to search for the target number in the array
        for (int num : numbers) {
            if (num == target) {
                found = true; // Target number found
                break; // Exit the loop since we found the number
            }
        }

        // Display the result based on whether the target was found or not
        if (found) {
            System.out.println(target + " was found in the array.");
        } else {
            System.out.println(target + " was not found in the array.");
        }

        scanner.close(); // Close the scanner
    }
}
