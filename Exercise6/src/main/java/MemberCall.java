public class MemberCall {
    // 6-18
    int iv = 10;
    static int cv = 20;

    int iv2= cv;
//    static int cv2 = iv;

    static void staticMethod1() {
        System.out.println(cv);
//        System.out.println(iv);
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);
    }

    static void staticMethod2() {
        staticMethod1();
//        instanceMethod();
    }

    void instanceMethod2() {
        staticMethod1();
        instanceMethod1();
    }
}
