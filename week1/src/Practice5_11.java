public class Practice5_11 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] counter = new int[10];

        for (int i=0; i< numArr.length; i++) {
            numArr[i] = (int)(Math.random()*10);
            System.out.print(numArr[i]);
        }
        System.out.println();

        for (int i : numArr) {
            counter[i]++;
        }

        // 1. 중복이 제거된 결과 출력 
        for (int i=0; i<counter.length; i++) {
            if (counter[i] != 0) {      // counter 인덱스 안에 값이 저장돼 있을 때
                System.out.print(i + " ");      // 해당 인덱스 번호값 출력
            }
        }
        System.out.println();

        // 2. 정렬된 결과
        for (int i=0; i<counter.length; i++) {
            if (counter[i] != 0) {      // counter 인덱스 안에 값이 저장돼 있을 때
                for (int j=0; j<counter[i]; j++) {  // 저장된 값만큼 반복해서
                    System.out.print(i + " ");      // 인덱스 번호 출력
                }
            }
        }
    }
}