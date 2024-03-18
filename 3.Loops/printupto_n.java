import java.util.*;

class printupto_n {
    public static void main(String[] args) {
        System.out.println("Enter the value you want to print upto : ");
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i = i++) {
            System.out.println(i);
        }
    }
}