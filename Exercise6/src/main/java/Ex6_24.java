class Ex6_24 {
    static int abs(int value) {
        if (value < 0)
            return value * -1;
        else
            return value;
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값: " + abs(value));
        value = -10;
        System.out.println(value + "의 절대값: " + abs(value));
    }
}
