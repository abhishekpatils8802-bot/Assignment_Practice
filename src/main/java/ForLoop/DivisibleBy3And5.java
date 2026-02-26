package ForLoop;

public class DivisibleBy3And5 {
    public static void main(String[] args) {
        System.out.println("Divisible By 3: ");
        for (int i=0;i<100;i++)
        {
            if (i % 3 == 0)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println("Divisible by 5:");
        for (int i=0;i<100;i++)
        {
            if (i%5==0)
            {
                System.out.print( i + " ");
            }
        }


        System.out.println("\n\nDivided by 5 & 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
