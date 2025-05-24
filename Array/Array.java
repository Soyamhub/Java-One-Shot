import java.util.*;
public class Array {
    public static void main(String[] args) {
        // Array declaration
        int[] arr = new int[5]; // Declaration and instantiation
        int[] arr1 = { 1, 2, 3, 4, 5 }; // Declaration and initialization

        // Accessing array elements
        System.out.println(arr1[0]); // Output: 1
        System.out.println(arr1[1]); // Output: 2

        // Modifying array elements
        arr1[0] = 10;
        System.out.println(arr1[0]); // Output: 10

        // Array length
        System.out.println("Length of arr1: " + arr1.length); // Output: Length of arr1: 5

        // Looping through an array
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " "); // Output: 10 2 3 4 5
        }

        // Common array operations
        // Copying arrays
        int[] copy = Arrays.copyOf(arr, arr.length);
        int[] source = { 1, 2, 3, 4, 5 };
        int[] dest = new int[5];
        int length = 5;
        // Copying using System.arraycopy
        System.arraycopy(source, 0, dest, 0, length);

        // Sorting
        Arrays.sort(arr);

        // Binary search (on sorted array)
        int index = Arrays.binarySearch(arr, 8);
    }
}
