public class Ex4_4 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (sum < 100) {
            sum += i++;

            if (sum >= 100) {break;}

            sum -= i++;
        }

        System.out.println(i);
    }
}
