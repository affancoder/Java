public class do_while {
    public static void main(String[] args) {
        double x = 50;
        do {
            System.out.println(x);
            x = x + 2;
        } while (x <= 100);

        System.out.println("------------------------------------");

        float y = 20;
        do {
            System.out.println(y);
            y = y + 4;
        } while (y <= 60);
    }
}
