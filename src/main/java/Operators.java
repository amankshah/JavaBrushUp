public class Operators {
    public static void main(String[] args) {
        int left = 5;
        int right = 6;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (left + right));        // Addition (+) -> Output: 11
        System.out.println("Subtraction: " + (left - right));     // Subtraction (-) -> Output: -1
        System.out.println("Multiplication: " + (left * right));  // Multiplication (*) -> Output: 30
        System.out.println("Division: " + (left / right));        // Division (/) -> Output: 0
        System.out.println("Modulus: " + (left % right));          // Modulus (%) -> Output: 5
        System.out.println();

        // Relational Operators
        System.out.println("Relational Operators:");
        System.out.println("Equal to: " + (left == right));        // Equal to (==) -> Output: false
        System.out.println("Not equal to: " + (left != right));   // Not equal to (!=) -> Output: true
        System.out.println("Greater than: " + (left > right));     // Greater than (>) -> Output: false
        System.out.println("Less than: " + (left < right));        // Less than (<) -> Output: true
        System.out.println("Greater than or equal to: " + (left >= right));  // Greater than or equal to (>=) -> Output: false
        System.out.println("Less than or equal to: " + (left <= right));     // Less than or equal to (<=) -> Output: true
        System.out.println();

        // Logical Operators
        System.out.println("Logical Operators:");
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println("AND: " + (bool1 && bool2));            // Logical AND (&&) -> Output: false
        System.out.println("OR: " + (bool1 || bool2));             // Logical OR (||) -> Output: true
        System.out.println("NOT: " + (!bool1));                    // Logical NOT (!) -> Output: false
        System.out.println();

        // Bitwise Operators
        System.out.println("Bitwise Operators:");
        System.out.println("AND: " + (left & right));              // Bitwise AND (&) -> Output: 4
        System.out.println("OR: " + (left | right));               // Bitwise OR (|) -> Output: 7
        System.out.println("XOR: " + (left ^ right));              // Bitwise XOR (^) -> Output: 3
        System.out.println("Bitwise NOT for left: " + (~left));    // Bitwise NOT (~) -> Output: -6
        System.out.println();

        // Assignment Operators
        System.out.println("Assignment Operators:");
        int result = left;
        System.out.println("Simple Assignment: " + result);        // Simple Assignment (=) -> Output: 5
        result += right;
        System.out.println("Addition Assignment: " + result);     // Addition Assignment (+=) -> Output: 11
        result -= right;
        System.out.println("Subtraction Assignment: " + result);  // Subtraction Assignment (-=) -> Output: 5
        result *= right;
        System.out.println("Multiplication Assignment: " + result);  // Multiplication Assignment (*=) -> Output: 30
        result /= right;
        System.out.println("Division Assignment: " + result);        // Division Assignment (/=) -> Output: 5
        result %= right;
        System.out.println("Modulus Assignment: " + result);          // Modulus Assignment (%=) -> Output: 5
        System.out.println();

        // Increment and Decrement Operators
        System.out.println("Increment and Decrement Operators:");
        int num = 5;
        System.out.println("Original value of num: " + num);
        System.out.println("Post-increment: " + (num++));    // Post-increment (++) -> Output: 5
        System.out.println("Value after post-increment: " + num);
        System.out.println("Pre-increment: " + (++num));     // Pre-increment (++) -> Output: 7
        System.out.println("Value after pre-increment: " + num);
        System.out.println("Post-decrement: " + (num--));    // Post-decrement (--) -> Output: 7
        System.out.println("Value after post-decrement: " + num);
        System.out.println("Pre-decrement: " + (--num));     // Pre-decrement (--) -> Output: 5
        System.out.println("Value after pre-decrement: " + num);

//
    }
}
