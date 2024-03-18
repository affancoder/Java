class hollow {
    public static void main(String[] args) {
        int a = 4, b = 5;

        for (int i = 1; i <= a; i++) {               // outer loop
            for (int j = 1; j <= b; j++) {           // inner loop
                if (i == 1 || j == 1 || i == a || j == b) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}