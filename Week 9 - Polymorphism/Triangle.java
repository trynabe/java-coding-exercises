public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle() {
        super();
        this.base = 0;
        this.height = 0;
    }

    public Triangle(String color, double base, double height) {
        super();
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    public double getArea(double base, double height) {
        this.base = base;
        this.height = height;
        return 0.5 * base * height;
    }

    public String toString() {
        return "Triangle[base=" + base + ",height=" + height + "," + super.toString() + "]";
    }
}
