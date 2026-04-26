import java.util.Scanner;

class VolumeCalculator {

double calculateVolume(double side) {
return side * side * side;
}

double calculateVolume(double length, double width, double height) {
return length * width * height;
}

double calculateVolume(float radius) {
return (4.0 / 3.0) * 3.14 * radius * radius * radius;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
VolumeCalculator v = new VolumeCalculator();

System.out.print("Enter side of cube: ");
double side = sc.nextDouble();

System.out.print("Enter length: ");
double length = sc.nextDouble();
System.out.print("Enter width: ");
double width = sc.nextDouble();
System.out.print("Enter height: ");
double height = sc.nextDouble();

System.out.print("Enter radius of sphere: ");
float radius = sc.nextFloat();
System.out.println("\nVolume of Cube = " + v.calculateVolume(side));
System.out.println("Volume of Rectangular Cube = " + v.calculateVolume(length, width, height));
System.out.println("Volume of Sphere = " + v.calculateVolume(radius));
}
}