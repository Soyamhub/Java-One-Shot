import java.util.*;

public class inputoutput {
    public static void main(String[] args) {
        //1. User Input/Output
        //Scanner for Input

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();        // Read integer
        String str = sc.nextLine();    // Read string
        double d = sc.nextDouble();    // Read double
        sc.close();                    // Always close scanner

        //Output
        System.out.print("Hello");     // No newline
        System.out.println("World");   // With newline
        System.out.printf("%d %s", 5, "items"); // Formatted output
    }
}
