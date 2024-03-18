import java.util.*;

public class condition {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt(); // taking input as a integer
        sc.close();

        if (age >= 18) {
            System.out.println("Your are " + age + " year old and you can vote");
        } else {
            System.out.println("Your age is " + age + " year old you cannot vote");
        }
    }
}