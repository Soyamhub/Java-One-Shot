
public class datatypesJava {
    public static void main(String[] args) {
        
        // 1. Primitive Data Types
        int a = 10;          // Integer
        double b = 20.5;    // Double
        char c = 'A';       // Character
        boolean d = true;   // Boolean

        // 2. Non-Primitive Data Types
        String str = "Hello"; // String
        int[] arr = {1, 2, 3}; // Array

        // 3. Type Casting
        int x = (int) b;     // Explicit casting from double to int
        double y = a;       // Implicit casting from int to double

        System.out.println("Integer: " + a);
        System.out.println("Double: " + b);
        System.out.println("Character: " + c);
        System.out.println("Boolean: " + d);
        System.out.println("String: " + str);
        System.out.println("Array: " + arr[0]);
    }
}
