class SutdaDeck2 {
    final int CARD_NUM = 20;
    SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

    SutdaDeck2() {
        for (int i=0; i<CARD_NUM; i++) {
            cards[i] = new SutdaCard2(i%10+1, false);
        }
        cards[0].isKwang = true;
        cards[2].isKwang = true;
        cards[7].isKwang = true;
    }

    void shuffle() {
        for (int i=0; i<CARD_NUM; i++) {
            int idx = (int) (Math.random()*CARD_NUM);

            SutdaCard2 tmp = cards[0];
            cards[0] = cards[idx];
            cards[idx] = tmp;
        }
    }

    SutdaCard2 pick(int index) {
        return cards[index];
    }

    SutdaCard2 pick() {
        int index = (int) (Math.random() * CARD_NUM);

        return cards[index];
    }
}

class SutdaCard2 {
    int num;
    boolean isKwang;

    SutdaCard2() {
        this(1, true);
    }

    SutdaCard2(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K":"");
    }
}

class Ex7_2 {
    public static void main(String[] args) {
        SutdaDeck2 deck = new SutdaDeck2();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i=0; i<deck.cards.length; i++)
            System.out.print(deck.cards[i] + ", ");

        System.out.println();
        System.out.println(deck.pick(0));
    }
}