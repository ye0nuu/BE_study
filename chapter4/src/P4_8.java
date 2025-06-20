// 방정식 2x+4y=10 의 모든 해를 구하시오.

public class P4_8 {
    public static void main(String[] args) {
        for (int i=0; i<=5; i++) {
            for (int j=0; j<=5; j++) {
                if  (2*i + 4*j == 10) {
                    System.out.printf("x=%d, y=%d\n", i, j);
                }
            }
        }
    }
}
