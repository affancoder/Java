import java.util.*;

public class comparison {
    public static void main(String[] args) {
        System.out.println("Input any two number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // taking first input
        int b = sc.nextInt(); // taking second input
        sc.close();

        if (a > b) {
            System.out.println(a + " is biggest than " + b);
        } else if (a == b) {
            System.out.println(a + " equal to " + b);
        } else {
            System.out.println(b + " is biggest than " + a);
        }
    }
}
