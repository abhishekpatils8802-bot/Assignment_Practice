import java.util.Scanner;

public class UnaryOperator {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total seconds:");
        while (true) {
            int Sec = sc.nextInt();
            int hours = Sec / 3600;
            int remaingsec = Sec % 3600;
            int min = remaingsec / 60;
            int sec = remaingsec % 60;
            System.out.println(hours + min + sec);
        }
    }
}
