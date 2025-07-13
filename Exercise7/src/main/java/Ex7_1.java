class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i=0; i<CARD_NUM; i++) {
            cards[i] = new SutdaCard(i%10+1, false);
        }

        cards[0].isKwang = true;
        cards[2].isKwang = true;
        cards[7].isKwang = true;
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K":"");
    }
}

class Ex7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for (int i=0; i<deck.cards.length; i++)
            System.out.print(deck.cards[i] + ", ");
    }
}
