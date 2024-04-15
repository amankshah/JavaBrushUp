public class PrimitiveDataType {
    public static void main(String[] args) {
        // String
        String myString = "Hello, Java!";
        // Description
        System.out.println("String:");
        System.out.println("- Description: Strings are sequences of characters, enclosed within double quotes, used to represent text.");
        System.out.println("- Capacity: Strings in Java are not fixed in length and can hold a variable number of characters.");
        System.out.println("- Maximum Length: The theoretical maximum length of a String in Java is Integer.MAX_VALUE, which is 2,147,483,647 characters.");
        System.out.println("Value: " + myString);
        System.out.println();

        // Integer
        int myInt = 42;
        // Description
        System.out.println("Integer:");
        System.out.println("- Description: Integers are whole numbers without any decimal points.");
        System.out.println("- Capacity: Integers in Java are 32-bit signed two's complement integers.");
        System.out.println("- Range: The range of values an int can hold is from -2,147,483,648 to 2,147,483,647.");
        System.out.println("Value: " + myInt);
        System.out.println();

        // Short
        short myShort = 12345;
        // Description
        System.out.println("Short:");
        System.out.println("- Description: Short is a 16-bit signed two's complement integer.");
        System.out.println("- Capacity: Shorts in Java have a smaller capacity than integers, being 16 bits in size.");
        System.out.println("- Range: The range of values a short can hold is from -32,768 to 32,767.");
        System.out.println("Value: " + myShort);
        System.out.println();

        // Long
        long myLong = 123456789L;
        // Description
        System.out.println("Long:");
        System.out.println("- Description: Long is a 64-bit signed two's complement integer.");
        System.out.println("- Capacity: Longs in Java have a larger capacity than integers, being 64 bits in size.");
        System.out.println("- Range: The range of values a long can hold is from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.");
        System.out.println("Value: " + myLong);
        System.out.println();

        // Boolean
        boolean myBoolean = true;
        // Description
        System.out.println("Boolean:");
        System.out.println("- Description: Booleans represent true or false values.");
        System.out.println("- Capacity: Booleans in Java are typically represented as 1 bit, but in practice, they are stored as 32 bits.");
        System.out.println("- Range: Booleans can only have two possible values: true or false.");
        System.out.println("Value: " + myBoolean);
        System.out.println();

        // Float
        float myFloat = 3.14f;
        // Description
        System.out.println("Float:");
        System.out.println("- Description: Floats are single-precision 32-bit floating-point numbers.");
        System.out.println("- Capacity: Floats can represent numbers with up to 7 significant digits.");
        System.out.println("- Range: Floats can represent a wide range of values, approximately from 1.4e-45 to 3.4e+38.");
        System.out.println("Value: " + myFloat);
        System.out.println();

        // Double
        double myDouble = 3.14159;
        // Description
        System.out.println("Double:");
        System.out.println("- Description: Doubles are double-precision 64-bit floating-point numbers.");
        System.out.println("- Capacity: Doubles can represent numbers with up to 15 significant digits.");
        System.out.println("- Range: Doubles can represent an even wider range of values than floats, approximately from 4.9e-324 to 1.8e+308.");
        System.out.println("Value: " + myDouble);
        System.out.println();

        // Char
        char myChar = 'A';
        // Description
        System.out.println("Char:");
        System.out.println("- Description: Chars are 16-bit Unicode characters.");
        System.out.println("- Capacity: Chars represent single characters and are enclosed within single quotes.");
        System.out.println("- Range: Chars can represent any Unicode character.");
        System.out.println("Value: " + myChar);
        System.out.println("Value: " + myChar);

    }
}
