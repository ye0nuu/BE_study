public class Ex7_3 {
    public static void main(String[] args) {
        Deck d = new Deck();
        Card[] cards = new Card[5];
        int count = 0;

        while (true) {
            count++;

            for (int i=0; i<5; i++) {
                cards[i] = d.pick(0);
                d.shuffle();
            }

            String result = rankCheck(cards);

            if (!result.equals("None")) {
                for (int i=0; i<5; i++)
                    System.out.println(cards[i]);
                System.out.println(result);
                System.out.println("try: " + count);
                break;
            }
        }
    }


    // 5장의 카드를 받아서 어떤 rule 적용되는지 판단해 반환
    static String rankCheck(Card[] cards) {
        String result = "None";

        // 1. Straight flush 검사 - 카드 종류가 모두 같고, 숫자가 연속되어야 함
        // 정렬
        for (int i=0; i<cards.length-1; i++) {
            int min_idx = i;    // 가장 작은 값 인덱스 번호 저장

            for (int j=i+1; j<cards.length; j++) {  // i+1 ~ 4
                if (cards[min_idx].number > cards[j].number)    // 가장 작은 인덱스의 값보다 해당 값이 작으면
                    min_idx = j;    // 해당 인덱스 번호로 min_idx 교체
            }
            Card tmp = cards[min_idx];    // 가장 작은 수 맨 앞으로 옮기기
            cards[min_idx] = cards[i];
            cards[i] = tmp;
        }

        boolean straight_flush = true;
        for (int i=1; i<5; i++) {
            if (cards[0].kind != cards[i].kind ||   // 카드 종류가 달라지거나
                    cards[i - 1].number + 1 != cards[i].number) {   // 번호가 연속되지 않으면 straight flush 값 false로
                straight_flush = false;
                break;
            }
        }
        if (straight_flush) {
            result = "STRAIGHT FLUSH";
        }


        // 2. Four card 검사 - 같은 숫자 4개
        int four_count = 1;
        int n = cards[0].number;    // 기준이 될 숫자 - 5장 중 4개가 같으므로 four card가 성립할 경우 0번째 or 1번째 숫자가 기준이 됨
        if (n != cards[1].number) { n = cards[1].number; }  // 0번째 1번째 카드 번호가 다르면 n을 1번째 카드 숫자로

        for (int i=2; i<cards.length; i++) {
            if (n == cards[i].number)   { four_count++; }   // n과 카드 숫자가 같으면 count++
        }

        if (four_count == 4) {  // 같은 숫자가 4개이면
            result = "FOUR CARD";
        }


        // 3. Full house 검사 - 카드 3장 숫자, 2장 숫자가 같아야 함
        if (cards[0].number == cards[1].number && cards[1].number == cards[2].number &&
                cards[3].number == cards[4].number) {
            result = "FULL HOUSE";
        }
        else if (cards[0].number == cards[1].number &&
                cards[2].number == cards[3].number && cards[3].number == cards[4].number) {
            result = "FULL HOUSE";
        }

        return result;
    }
}

class Deck {
    final int CARD_NUM = 52;
    Card cardArr[] = new Card[CARD_NUM];

    Deck() {
        int i=0;

        for (int k=Card.KIND_MAX; k>0; k--)
            for (int n=0; n<Card.NUM_MAX; n++)
                cardArr[i++] = new Card(k, n+1);
    }

    Card pick(int index) {
        return cardArr[index];
    }

    Card pick() {
        int index = (int)(Math.random() * CARD_NUM);
        return pick(index);
    }

    void shuffle() {
        for (int i=0; i<cardArr.length; i++) {
            int r = (int)(Math.random() * CARD_NUM);

            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }
}

class Card {
    static final int KIND_MAX = 4;
    static final int NUM_MAX = 13;

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind;
    int number;

    Card() {
        this(SPADE, 1);
    }

    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK";

        return "kind: " + kinds[this.kind] + ", number: " + numbers.charAt(this.number);
    }
}