public class Ex7_23 {
    static double sumArea(Shape[] arr) {
        double sum = 0;

        for (Shape i : arr) {
            sum += i.calcArea();
        }
        return sum;
    }

    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
        System.out.println("면적의 합: " + sumArea(arr));
    }
}
