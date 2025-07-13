// 7-7) super() - 조상 클래스의 생성자

class PointEx {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1, 2, 3);

        p3.getLocation();
    }
}

class Point2 {
    int x, y;

    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x: " + x + ", y: " + y;
    }
}

class Point3D extends Point2 {
    int z;

    Point3D(int x, int y, int z) {
        super(x, y);
        this.x = x;
        this.y = y;
        this.x = x;
    }

    String getLocation() {
        return "x: " + x + ", y: " + y + ", z: " + z;
    }
}
