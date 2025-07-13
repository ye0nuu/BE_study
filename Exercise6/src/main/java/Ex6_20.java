class Ex6_20 {

    static int[] shuffle(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            int idx = (int) (Math.random() * 10);
            int temp = arr[0];
            arr[0] = arr[idx];
            arr[idx] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
