public class P4_12 {
    public static void main(String[] args) {
        int num = 2;

        while (num < 10) {
            for (int i=1; i<4; i++) {
                for (int j=num; j<num+3; j++) {
                    if (j > 9) {break;}
                    System.out.print(j + "*" + i + "=" + (j*i) + "\t");
                }

                System.out.println();
            }

            System.out.println();
            num += 3;
        }
    }
}