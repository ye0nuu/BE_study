// Quiz1 - 1~9로 된 3자리수(중복x) 2개를 비교해 결과를 '1S2B' 형식으로 출력

public class Quiz0624_1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 1, 3};

        int s = 0;
        int b = 0;

        for (int i=0; i<arr1.length; i++) {
            for (int j=0; j<arr2.length; j++) {
                if (arr1[i] == arr2[j]) {   // 값이 같을 때
                    if (i==j) { // 인덱스 번호가 같으면 s+1
                        s++;
                    } else {    // 인덱스 번호가 다르면 b+1
                        b++;
                    }
                }
            }
        }

        System.out.println(s + "S" + b + "B");
    }
}
