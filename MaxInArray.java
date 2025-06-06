package dhanu;
import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];  // Array to store 5 numbers

        // Take 5 numbers as input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        // Find the maximum number
        int max = numbers[0];
        for (int i = 1; i < 5; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Print the biggest number
        System.out.println("The biggest number is: " + max);

        sc.close(); // Close scanner
    }
}
