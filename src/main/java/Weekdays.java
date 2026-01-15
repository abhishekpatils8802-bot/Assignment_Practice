import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers between 1-7");
        while (true)
        {
            int days = sc.nextInt();
            if (days == 0)
            {
                System.out.println("Program ended");
                break;
            }

            switch (days) {
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wedensday");
                    break;
                case 5:
                    System.out.println("thrusday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                default:
                    System.err.println("Enter no between 1-7 only");
            }
        }
    }
}
