import java.util.*;

public class Inverted_half_pyramid {
    public static void main(String[] args) {
        System.out.println("Enter any value : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
