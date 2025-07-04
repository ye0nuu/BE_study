public class Ex5_6 {
    public static void main(String[] args) {
        // 큰 금액의 동전을 우선적으로 거슬러줘야 한다.
        int[] coinUnit = {500, 100, 50, 10};

        int money = 2680;
        System.out.println("money=" + money);

        for (int i=0; i<coinUnit.length; i++) {
            int coin = money/coinUnit[i];
            System.out.println(coinUnit[i] + "원: " + coin);

            money %= (coinUnit[i] * coin);
        }
    }
}
