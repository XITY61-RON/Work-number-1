package SeminarTwo;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        
        this.color = color;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getLength() {
        return 2 * Math.PI * radius;
    }

    public boolean compare(Circle other) {
        return this.radius == other.radius;
    }

    @Override
    public String toString() {
        return "Circle{radius=" + radius + ", color='" + color + "'}";
    }
    public static void main(String[] args) {
        Circle c1 = new Circle(5, "Red");
        Circle c2 = new Circle(5, "Blue");
        Circle c3 = new Circle(8, "Green");

        System.out.println("Площадь c1: " + c1.getArea());
        System.out.println("Длина c1: " + c1.getLength());
        System.out.println("c1 и c2 равны? " + c1.compare(c2));
        System.out.println("c1 и c3 равны? " + c1.compare(c3));
    }
}
