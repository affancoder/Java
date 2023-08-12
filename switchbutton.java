import java.util.*;

public class switchbutton {
    public static void main(String[] args) {
        System.out.println("Input the number between 1 to 5 : ");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt(); // varaibale input
        sc.close();

        switch (button) {
            case 1:System.out.println("Assalamualikum");
            break;

            case 2:System.out.println("namaste");
            break;

            case 3:System.out.println("Bonjur");
            break;

            case 4:System.out.println("Hello");
            break;

            case 5:System.out.println("Hola");
            break;

            default:System.out.println("Invaild Choice");
        }
    }
}
