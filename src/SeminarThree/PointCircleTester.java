package SeminarThree;

import java.util.Random;
import java.util.Scanner;

class Point{
    private double x,y;
    public Point(double x, double y){
        this.x =x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    @Override
    public String toString() {
        return String.format("(%.2f; %.2f)", x, y);
    }

}
class Circle{
    private Point center;
    private double length;
    private double radius;

    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
        this.length = 2*Math.PI*radius;
    }
    public Point getCenter(){
        return center;
    }
    public double getLength(){
        return length;
    }
    public double getRadius(){
        return radius;
    }
    @Override
    public String toString() {
        return String.format("Circle[center=%s, R=%.2f, L=%.2f]",
                center, radius, length);
    }

}
class Tester{
    private Circle[] circles;
    private int count;

    public Tester(int size){
    circles = new Circle[size];
    count = 0;
    }
    public void add(Circle c){
        if(count < circles.length) circles[count++] = c;

    }
     public Circle findSmallest(){
        Circle min = circles[0];
        for(int i=1; i < count; i++){
            if(circles[i].getRadius() < min.getRadius()) min = circles[i];
        }
        return  min;
    }
    public Circle findlargest(){
        Circle max = circles[0];
        for(int i=1; i < count; i++){
            if(circles[i].getRadius() > max.getRadius()) max = circles[i];
        }
        return  max;
    }
    public void sort(){
        for(int i = 0; i < count-1; i++ ){
            for(int j = 0; j<count-1-i;j++){
                if(circles[j].getRadius()> circles[j+1].getRadius()){
                    Circle tmp = circles[j];
                    circles[j] = circles[j+1];
                    circles[j+1] = tmp;
                }
            }
           
        }
        
    }
    public void print(){
        for(int i = 0;i<count;i++)
            System.out.println(circles[i]);
    }

}
public class PointCircleTester {
    public static void pointCircleTester(Scanner scanner){
        Random random = new Random();
        Tester tester = new Tester(4);
        for(int i = 0; i < 4;i++){
            Point p = new Point(random.nextDouble()*10, random.nextDouble()*10);
            double r = 1+random.nextDouble()*9;
            tester.add(new Circle(p, r));

        }
        System.out.println("Исходный список:");
        tester.print();
        System.out.println("\nСамая маленькая: " + tester.findSmallest());
        System.out.println("Самая большая:   " + tester.findlargest());

        tester.sort();
        System.out.println("\nПосле сортировки:");
        tester.print();
    }
}
