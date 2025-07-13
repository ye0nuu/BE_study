// 7-5, 6) 오버라이딩 - super

class SuperEx {
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.method();
    }
}

class Parent {
    int x = 10;
}

class Child extends Parent2 {
    int x = 20;

    void method() {
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);     // this : 인스턴스 자신을 가리키는 참조변수
        System.out.println("super.x=" + super.x);   // super : 객체 자신을 가리키는 참조변수
    }
}
