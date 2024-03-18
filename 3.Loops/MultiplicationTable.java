import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.print("Input any number you want print the table: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // taking input
        sc.close();
        System.out.println("Table of " + n + " is ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * n);
        }
    }
}