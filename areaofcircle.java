import java.util.*;

public class areaofcircle {
    public static void main(String[] args) {
        System.out.println("Input radius of a circle: ");
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat(); // taking radius of a circle as a input
        double pi = 3.14, area; // declaring pi value
        sc.close();
        area = pi * rad * rad; // formula
        System.out.println("Area of a Circle is " + area);
    }
}
