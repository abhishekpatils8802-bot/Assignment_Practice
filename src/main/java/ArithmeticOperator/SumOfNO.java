package ArithmeticOperator;
import java.util.Scanner;

public class SumOfNO {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Read two integers
            int a = sc.nextInt();
            int b = sc.nextInt();

            // Calculations
            int sum = a + b;
            int difference = Math.abs(a - b);
            int product = a * b;
            int average = (a + b) / 2;
            int distance = Math.abs(a - b);
            int max = Math.max(a, b);
            int min = Math.min(a, b);

            // Output
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Average: " + average);
            System.out.println("Distance: " + distance);
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);

            sc.close();
        }
    }


