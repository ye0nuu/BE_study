public class Star8 {
    public static void main(String[] args) {
        for (int i=0; i<10; i+=2) {
            for (int j=5; j>=i/2; j--) {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

