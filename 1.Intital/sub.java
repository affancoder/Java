import java.util.*;

public class sub {
    public static void main(String[] args){
        System.out.println("Enter the values to subtract: ");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int sub = x - y;
        sc.close();
        System.out.println("The subtaction is " + sub);
    }
}
