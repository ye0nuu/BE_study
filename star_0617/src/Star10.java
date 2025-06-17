public class Star10 {
    public static void main(String[] args) {
        for (int i=1; i<3; i++) {
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            for (int j=4; j>=2*i; j--) {
                System.out.print(" ");
            }
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=0; i<5; i++) {System.out.print("*");}
        System.out.println();

        for (int i=1; i<3; i++) {
            for (int j=2; j>=i; j--) {
                System.out.print("*");
            }
            for (int j=1; j<i*2; j++) {
                System.out.print(" ");
            }
            for (int j=2; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
