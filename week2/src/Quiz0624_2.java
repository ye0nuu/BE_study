// Quiz2 - 세 개의 정수를 받아서 셋 중에 가운데 크기의 값을 반환하는 mid()를 작성

public class Quiz0624_2 {
    public static void main(String[] args) {
        System.out.println(mid(1, 2,3));
        System.out.println(mid(2, 1, 3));
        System.out.println(mid(1, 1, 1));
    }

    static int mid(int a, int b, int c) {
        int m = 0;

        if (a <= b) {   // a, b 비교해서 큰 수를 m에 저장
            m = b;
        } else {
            m = a;
        }
        if (m > c) {    // m과 c 중 더 작은 수를 m에 저장
            m = c;
        }

        return m;
    }
}
