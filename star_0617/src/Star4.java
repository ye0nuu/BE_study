public class Star4 {
    public static void main(String[] args) {
        for (int i=0; i<3; i++) {
            for (int j=0; j<i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j=3; j>i*2; j--) {
                System.out.print(" ");
            }
            if (i<2) {System.out.println("*");}
            else     {System.out.println();}
        }

        for (int i=0; i<2; i++) {
            for (int j=0; j<1-i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j=0; j<=i*2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
