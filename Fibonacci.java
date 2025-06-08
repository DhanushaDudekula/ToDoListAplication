package dhanu;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 1, z, n;

        System.out.print("Enter N: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(x+ " ");
            z = x + y;
            x = y;
            y = z;
        }

        sc.close();
    }
}
