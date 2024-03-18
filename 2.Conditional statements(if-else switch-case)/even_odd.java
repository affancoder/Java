import java.util.*;

public class even_odd {
    public static void main(String[] args) {
        System.out.println("Enter any number to check whether it's even or odd: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        if (num % 2 == 0) {
            System.out.println(num + " is even number");
        } else {
            System.out.println(num + " is odd number");
        }
    }
}
