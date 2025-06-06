package dhanu;
public class BubbleSortSimple {
    public static void main(String[] args) {
        String[] names = { "Charlie", "Alice", "Eva", "Bob", "David" };

        // Bubble sort
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 0; j < names.length - i - 1; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }

        // Print sorted names
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
