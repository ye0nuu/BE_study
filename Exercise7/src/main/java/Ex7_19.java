public class Ex7_19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv2());
        b.buy(new Computer());
        b.buy(new Tv2());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}

class Buyer {
    int money = 1000;
    Product2[] cart = new Product2[3];
    int i = 0;

    void buy(Product2 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 " + p + "을/를 살 수 없습니다");
        }
        else {
            money -= p.price;
            add(p);
        }
    }

    void add(Product2 p) {
        if (i >= cart.length) {
            Product2[] newCart = new Product2[cart.length * 2];

            for (int j=0; j<cart.length; j++)
                newCart[j] = cart[j];
            cart = newCart;
        }
        cart[i] = p;
        i++;
    }

    void summary() {
        System.out.print("구입한 물건: ");
        for (int j=0; j<cart.length; j++)
            System.out.print(cart[j] + ", ");

        System.out.println("\n사용한 금액: " + (1000 - money));
        System.out.println("남은 금액: " + money);
    }
}

class Product2 {
    int price;

    Product2 (int price) {
        this.price = price;
    }
}

class Tv2 extends Product2 {
    Tv2() { super(100); }

    public String toString() {
        return "Tv";
    }
}

class Computer extends Product2 {
    Computer() { super(200); }

    public String toString() {
        return "Computer";
    }
}

class Audio extends Product2 {
    Audio() { super(50); }

    public String toString() {
        return "Audio";
    }
}