class SutdaCard3 {
    final int NUM;
    final boolean IS_KWANG;

    SutdaCard3() {
        this(1, true);
    }

    SutdaCard3(int num, boolean isKwang) {
        NUM = num;
        IS_KWANG = isKwang;
    }

    public String toString() {
        return NUM + (IS_KWANG ? "K":"");
    }
}

class Ex7_14 {
    public static void main(String[] args) {
        SutdaCard3 card = new SutdaCard3(1, true);
    }
}
