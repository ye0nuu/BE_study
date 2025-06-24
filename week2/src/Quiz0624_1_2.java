// Quiz 1 변형 - 랜덤으로 arr1 만들고 사용자 입력 받아서 맞추는 프로그램 작성
// 시도 횟수 세고, 마지막에 정답 출력

import java.util.Scanner;

public class Quiz0624_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        int[] numArr = new int[10];
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];

        for (int i=0; i<numArr.length; i++) {   // numArr에 1~9까지의 값을 저장
            numArr[i] = i+1;
        }
        for (int i=0; i<10; i++) {  // numArr 섞기
            int n = (int)(Math.random() * 9);
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }
        for (int i=0; i<arr1.length; i++) {
            arr1[i] = numArr[i];
        }

        while (true) {
            count++;

            System.out.print(count + ": ");
            for (int i=0; i<3; i++) {
                arr2[i] = sc.nextInt();
            }

            String result = SB(arr1, arr2);
            System.out.println(result);

            if (result.equals("3S0B")) {    // 정답 맞히면 break
                System.out.printf(">> %d %d %d\n", arr1[0], arr1[1], arr1[2]);
                break;
            }
        }
    }


    static String SB(int[] arr1, int[] arr2) {
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

        return (s + "S" + b + "B");
    }
}
