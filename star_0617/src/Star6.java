public class Star6 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++) {
            for (int j=4-i; j>=0; j--) {
                System.out.print(" ");
            }
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
