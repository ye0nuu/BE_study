class Car {}
interface Movable {}
class FireEngine extends Car implements Movable {}
class Ambulance extends Car {}

public class Ex7_16 {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();

//        System.out.println(fe instanceof Ambulance);
    }
}
