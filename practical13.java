import java.util.Scanner;

class Shape {
double d1, d2;
void getData(double d1, double d2) {
this.d1 = d1;
this.d2 = d2;
}
}
class Triangle extends Shape {
double area() {
return 0.5 * d1 * d2;
}
}
class Rectangle extends Shape {
double area() {
return d1 * d2;
}
}

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Triangle t = new Triangle();
Rectangle r = new Rectangle();
System.out.print("Enter base and height of triangle: ");
double b = sc.nextDouble();
double h = sc.nextDouble();
t.getData(b, h);
System.out.print("Enter length and breadth of rectangle: ");
double l = sc.nextDouble();
double br = sc.nextDouble();
r.getData(l, br);
System.out.println("Area of Triangle = " + t.area());
System.out.println("Area of Rectangle = " + r.area());
}
}