import java.util.*;

public class GreetingButton {
    public static void main(String[] args) {
        System.out.println("Press the number 1 , 2 , 3 or 4: ");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        sc.close();

        if (button == 1) {
            System.out.println("Assalamualikum");
        } else if (button == 2) {
            System.out.println("Namaste");
        } else if (button == 3) {
            System.out.println("Hello");
        } else if (button == 4) {
            System.out.println("Bonjur");
        } else {
            System.out.println("Wrong Input");
        }
    }
}
