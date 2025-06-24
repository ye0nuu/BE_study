// Quiz3 - 5x5 배열을 받아서 빙고 갯수를 반환하는 bingoCnt()를 작성

import java.util.Scanner;

public class Quiz0624_3 {
    public static void main(String[] args) {
//        int [][] bingoArr = {{1, 0, 0, 0, 0},
//                            {1, 1, 1, 1, 1},
//                            {1, 0, 0, 0, 0},
//                            {1, 0, 0, 0, 0},
//                            {1, 0, 0, 0, 0}};

        Scanner sc = new Scanner(System.in);

        int[][] bingoArr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                bingoArr[i][j] = sc.nextInt();
            }
        }

        System.out.println(bingoCnt(bingoArr));
    }

    static int bingoCnt(int[][] bingoArr) {
        boolean b1 = true;
        boolean b2 = true;
        int bingo = 0;

        for (int i = 0; i < 5; i++) {   // 가로 검사
            for (int j = 0; j < 5; j++) {
                if (bingoArr[i][j] != 1) {  // 가로 방향으로 인덱스 하나씩 검사해서 1이 아니면 b1 false
                    b1 = false;
                }
                if (bingoArr[j][i] != 1) {  // 세로 방향으로 인덱스 하나씩 검사해서 1이면 b2 false
                    b2 = false;
                }
            }

            if (b1) {   // b1, b2 true이면 각각 bingo + 1
                bingo++;
            } if (b2) {
                bingo++;
            }
            b1 = true;  // 초기화
            b2 = true;
        }


        for (int i = 0; i < 5; i++) {   // 대각선 검사
            if (bingoArr[i][i] != 1) {  // 오른쪽 방향 대각선 검사
                b1 = false;
            }
            if (bingoArr[4-i][i] != 1) {
                b2 = false;
            }
        }
        if (b1) {
            bingo++;
        } if (b2) {
            bingo++;
        }

        return bingo;
    }
}
