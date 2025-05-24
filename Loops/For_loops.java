
public class For_loops {
    public static void main(String[] args) {
        // For loop examples
        int n = 5;
        int rows = 3;
        int cols = 4;
        int[][] matrix = new int[rows][cols];

        // Simple for loop
        for (int i = 0; i < n; i++) {
            System.out.println("Hello");
        }

        // For loop with initialization, condition, and increment
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        // Traditional for loop
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        // Enhanced for loop (for-each)
        int[] arr = { 1, 2, 3, 4, 5 };
        for (int num : arr) {
            System.out.println(num);
        }

        // Nested loops
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = i * j;
            }
        }
    }

}
