package ArithmeticOperator;
import java.util.Scanner;
public class MinIntoYear {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            try {
                // check for decimal values
                if (input.contains("."))
                {
                    System.out.println("Invalid output");
                    System.out.println("Invalid output");
                    return;
                }
                long minutes = Long.parseLong(input);
                long totalDays = minutes / 1440;
                long years = totalDays / 365;
                long days = totalDays % 365;
                System.out.println(days + " Days");
                System.out.println(years + " year");
            } catch (Exception e)
            {
                System.out.println("Invalid output");
                System.out.println("Invalid output");
            }
            sc.close();
        }
    }
