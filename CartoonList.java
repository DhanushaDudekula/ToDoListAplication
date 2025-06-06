package dhanu;
import java.util.ArrayList;
import java.util.Collections;

public class CartoonList {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList
        ArrayList<String> cartoonCharacters = new ArrayList<>();

        // Step 2: Add 5 names
        cartoonCharacters.add("Mickey");
        cartoonCharacters.add("Tom");
        cartoonCharacters.add("Jerry");
        cartoonCharacters.add("SpongeBob");
        cartoonCharacters.add("Scooby");

        // Step 3: Remove 1 name
        cartoonCharacters.remove("Tom");

        // Step 4: Replace one with a new one
        // Let's replace "Jerry" with "Doraemon"
        int index = cartoonCharacters.indexOf("Jerry");
        if (index != -1) {
            cartoonCharacters.set(index, "Doraemon");
        }

        // Step 5: Print all names using a loop
        System.out.println("Cartoon Characters:");
        for (String name : cartoonCharacters) {
            System.out.println(name);
        }

        // Step 6: Sort alphabetically and print again
        Collections.sort(cartoonCharacters);
        System.out.println("\nSorted Cartoon Characters:");
        for (String name : cartoonCharacters) {
            System.out.println(name);
        }
    }
}