public class Star7_2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (i >= j-4) {
                    System.out.print("*");
                } else {
                    System.out.println();
                    break;
                }
            }
        }
    }
}
