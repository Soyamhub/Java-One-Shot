
import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
//     1
//     1 2
//     1 2 3
//     1 2 3 4
//     1 2 3 4 5
//     1 2 3 4 5 6
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the number of lines you want");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
