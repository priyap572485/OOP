import java.util.Scanner;
public class DivisionException {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("Please enter exactly 2 values");
            }
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);
            int result = numerator / denominator;
            System.out.println("Numerator = " + numerator);
            System.out.println("Denominator = " + denominator);
            System.out.println("Result = " + result);
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integer numbers.");
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Denominator cannot be zero.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Unexpected Error: " + e);
        }
    }
}