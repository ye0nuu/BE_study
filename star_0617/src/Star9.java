import java.sql.SQLSyntaxErrorException;

public class Star9 {
    public static void main(String[] args) {
        for (int i=0; i<3; i++) {
            for (int j=0; j<i; j++) {
                System.out.print(" ");
            }
            for (int j=5; j>i*2; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=1; i<3; i++) {
            for (int j=2; j>i; j--) {
                System.out.print(" ");
            }
            for (int j=0; j<2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
