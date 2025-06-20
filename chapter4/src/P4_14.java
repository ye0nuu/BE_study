// 사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해 결과를 알려줌
// 사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇 번만에 숫자를 맞췄는지 알려주는 프로그램

public class P4_14 {
    public static void main(String[] args) {
        int answer = (int)(Math.random() * 100) + 1;
        int input = 0;
        int count = 0;

        java.util.Scanner s = new java.util.Scanner(System.in);

        do {
            count++;
            System.out.print("1과 100사이의 값을 입력하세요 : ");
            input = s.nextInt();

            if (input == answer) {

            }
        } while (true);
    }
}
