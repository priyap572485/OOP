import java.util.Scanner;

public class practical1{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.printf("Enter distance in meters: ");
        double meters = SC.nextDouble();

        double feet = meters * 3.28084;

        System.out.printf("Distance in feet = %.2f", feet);

        SC.close();
    }
}