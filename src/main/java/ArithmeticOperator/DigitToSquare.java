package ArithmeticOperator;
import java.util.Scanner;
public class DigitToSquare
{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            // Read number (supports integer, decimal, negative)
            double num = sc.nextDouble();
            double square = Math.pow(num, 2);
            double cube = Math.pow(num, 3);
            double fourthPower = Math.pow(num, 4);
            System.out.println("square: " + square);
            System.out.println("cube: " + cube);
            System.out.println("fourth power: " + fourthPower);
        }
    }
