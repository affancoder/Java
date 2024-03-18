import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum, subtract, multiply, division;
        System.out.println("Enter the first value: ");
        int a = sc.nextInt();
        System.out.println("Enter the second value: ");
        int b = sc.nextInt();
        System.out.println("Press the following\n1.Sum 2.Subtract 3.Multiply 4.Division");
        int operator = sc.nextInt();
        sc.close();

        switch (operator) {
            case 1:
                sum = a + b;
                System.out.println("Sum is " + sum);
                break;

            case 2:
                subtract = a - b;
                System.out.println("Subtraction is " + subtract);
                break;

            case 3:
                multiply = a * b;
                System.out.println("Multiplication is " + multiply);
                break;

            case 4:
                division = a / b;
                System.out.println("Division is " + division);
                break;

        }
    }
}