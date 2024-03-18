import java.util.*;

class quix01 {
    public static void main(String[] args) {
        System.out.println("Enter the value of a and b: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);

    }
}