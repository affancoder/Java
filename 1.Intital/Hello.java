import java.util.*;

class Hello{
    public static void main(String args[]){
        System.out.println("Hello world!");
        int a = 10;
        int b = 5;
        int sub = a - b;
        System.out.println("The subtraction is " + sub);
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();

            System.out.println(name);
        }        
    }
}
