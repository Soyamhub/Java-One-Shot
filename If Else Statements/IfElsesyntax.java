public class IfElsesyntax {
    public static void main(String[] args) {
        // If else statement
        int a = 10;
        int b = 20;

        if (a > b) {
            System.out.println("a is greater than b");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is equal to b");
        }

        // Nested if else statement
        if (a > 0) {
            if (b > 0) {
                System.out.println("Both a and b are positive");
            } else {
                System.out.println("a is positive but b is not");
            }
        } else {
            System.out.println("a is not positive");
        }
    }
}
