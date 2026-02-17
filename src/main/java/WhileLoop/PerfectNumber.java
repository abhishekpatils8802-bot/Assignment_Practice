package WhileLoop;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number =sc.nextInt();
        System.out.println("Enter digit to find frequency : ");
        int digit=sc.nextInt();
        int count=0;
        int temp=number;
        while (temp>0){
            int lastdigit= temp%10;

            if (lastdigit == digit)
            {
                count++;
            }

            temp = temp / 10;
        }

        System.out.println("Frequency of " + digit + " is: " + count);
    }
}