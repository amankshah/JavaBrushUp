public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Hello");

        // While Loop
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        i = 5; // Resetting i to 5

        // Do-While Loop
        do {
            System.out.println("its Do while loop " + i);
            i++;
        } while (i < 10); // This loop will execute at least once and continue while i is less than 10
    }
}
