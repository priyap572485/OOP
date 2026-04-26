import java.util.Scanner;

class Point {
int x, y;

Point() {
x = 5;
y = 5;
}

Point(int x, int y) {
this.x = x;
this.y = y;
}

Point(Point p) {
this.x = p.x;
this.y = p.y;
}

void display() {
System.out.println("Point coordinates: (" + x + ", " + y + ")");
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

Point p1 = new Point();
System.out.println("Default Constructor:");
p1.display();

System.out.print("\nEnter x coordinate: ");
int a = sc.nextInt();
System.out.print("Enter y coordinate: ");
int b = sc.nextInt();
Point p2 = new Point(a, b);
System.out.println("Parameterized Constructor:");
p2.display();
Point p3 = new Point(p2);
System.out.println("Copy Constructor:");
p3.display();
}
}