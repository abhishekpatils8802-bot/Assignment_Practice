package ArithmeticOperator;
import java.util.Scanner;
public class TempConv {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Read Celsius input
            double celsius = sc.nextDouble();

            // Convert to Fahrenheit and Kelvin
            double fahrenheit = (1.8 * celsius) + 32;
            double kelvin = celsius + 273;

            // Print output in required format
            System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");
            System.out.println(celsius + " Celsius = " + (int)kelvin + " Kelvin");

            sc.close();
        }
    }
