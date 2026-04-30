public class Circle extends Shape {
    private double radius;

    public Circle() {
        super();
        this.radius = 0;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "Circle[radius=" + radius + "," + super.toString() + "]";
    }
}
