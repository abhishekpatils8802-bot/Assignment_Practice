
    import java.util.Scanner;

    public class UnitConversion
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            try
            {
                double inches = Double.parseDouble(input);
                double meters = inches * 0.0254;

                // print result with exactly 2 decimal places
                System.out.printf("%.2f", meters);

            } catch (NumberFormatException e)
            {
                System.out.println("Invalid output");
            }

            sc.close();
        }
    }

