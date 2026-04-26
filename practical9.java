import java.util.Scanner;

class Rectangle {
double width;
double height;

Rectangle(double width, double height) {
this.width = width;
this.height = height;
}

double getArea() {
return width * height;
}

double getPerimeter() {
return 2 * (width + height);
}

void display() {
System.out.println("Width = " + width);
System.out.println("Height = " + height);
System.out.println("Area = " + getArea());
System.out.println("Perimeter = " + getPerimeter());
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter width of Rectangle 1: ");
double w1 = sc.nextDouble();
System.out.print("Enter height of Rectangle 1: ");
double h1 = sc.nextDouble();

System.out.print("Enter width of Rectangle 2: ");
double w2 = sc.nextDouble();
System.out.print("Enter height of Rectangle 2: ");
double h2 = sc.nextDouble();
Rectangle r1 = new Rectangle(w1, h1);
Rectangle r2 = new Rectangle(w2, h2);
System.out.println("\nRectangle 1:");
r1.display();
System.out.println("\nRectangle 2:");
r2.display();

if (r1.getArea() > r2.getArea()) {
System.out.println("\nRectangle 1 has larger area.");
} else if (r2.getArea() > r1.getArea()) {
System.out.println("\nRectangle 2 has larger area.");
} else {
System.out.println("\nBoth rectangles have equal area.");
}
}
}