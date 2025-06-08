package dhanu;
import java.util.HashMap;

public class GroceryBasket {
    public static void main(String[] args) {
        // Step 1: Create a HashMap to store items and their prices
        HashMap<String, Integer> basket = new HashMap<>();

        // Step 2: Add 5 items
        basket.put("banana", 48);
        basket.put("jam", 52);
        basket.put("Bread", 13);
        basket.put("chathi", 67);
        basket.put("Rice", 10);

        // Step 3: Print total cost of all items
        int totalCost = 0;
        for (int price : basket.values()) {
            totalCost += price;
        }
        System.out.println("Total cost of all items: ₹" + totalCost);

        // Step 4: Update the price of any item (e.g., Milk)
        basket.put("jam", 55); // Updated price

        // Step 5: Remove one item (e.g., Bread)
        basket.remove("Bread");

        // Display updated basket
        System.out.println("\nUpdated Basket:");
        for (String item : basket.keySet()) {
            System.out.println(item + ": ₹" + basket.get(item));
        }

        // Recalculate total cost after update and removal
        totalCost = 0;
        for (int price : basket.values()) {
            totalCost += price;
        }
        System.out.println("Total cost after update/removal: ₹" + totalCost);
    }
}
