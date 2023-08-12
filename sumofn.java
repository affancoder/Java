
//Sum of first n natural number
import java.util.Scanner;

public class sumofn {
    public static void main(String[] args) {
        System.out.println("Input any number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // loop
        int sum = 0, i; // initialize of series
        for (i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of number from 1 to " + n + " is " + sum);
    }
}
