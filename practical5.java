import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, s, area;

        System.out.print("Enter side a: ");
        a = sc.nextDouble();

        System.out.print("Enter side b: ");
        b = sc.nextDouble();

        System.out.print("Enter side c: ");
        c = sc.nextDouble();

        if ((a + b > c) && (a + c > b) && (b + c > a))
         {
             s = (a + b + c) / 2;
            area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println("Area of triangle = " + area);
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }

        sc.close();
    }
}