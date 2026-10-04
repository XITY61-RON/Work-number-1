package SeminarTwo;
import java.util.Scanner;

class Point {
    private double x;
    private double y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
}

class Circle {
    private Point center;
    private double radius;
    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }
    public Point getCenter(){return center;}
    public double getRadius(){return radius;}
    @Override
    public String toString(){
        return "Окружность в центре " + center.getX() + ";" + center.getY() + ";" + "Радиус " + radius;
    }
}

public class Tester {
    private Circle[] circles;
    private int count;
    public Tester(int size){
        circles = new Circle[size];
        count=0;
    }
    public void addCircle(Circle c){
        if (count < circles.length){
            circles[count++] = c;
        }
    }
    public void printAll(){
        for(int i = 0; i < count;i++){
            System.out.println(circles[i]);
        }
    }
    public static void tester(Scanner scanner) {
        Tester tester = new Tester(3);
        tester.addCircle(new Circle(new Point(0, 0), 5));
        tester.addCircle(new Circle(new Point(1, 2), 3));
        tester.printAll();
    }
}
 
