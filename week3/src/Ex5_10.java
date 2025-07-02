public class Ex5_10 {
    public static void main(String[] args) {
        char[] abcCode =
                { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
                '(', ')', '-', '_', '+', '=', '|', '[', ']', ',', '{',
                '}', ';', ':', ',', '.', '/'};

        char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};

        String src = "abc123";
        String result = "";

        // 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
        for (int i=0; i<src.length(); i++) {
            char ch = src.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                result += abcCode[ch - 97];
            } else {
                result += numCode[ch - 48];
            }
        }

        System.out.println("src: " + src);
        System.out.println("result: " + result);
    }
}
