// int 타입 변수 num이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드 완성

public class P4_10 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println(sum);
    }
}
