package LoopConcept;

import java.util.Scanner;
import java.util.TreeSet;
public class Factor
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
            int value = sc.nextInt();
            TreeSet<Integer> factors = new TreeSet<>();

            for (int i = 1; i * i <= value; i++)
            {
                if (value % i == 0)
                {
                    factors.add(i);
                    factors.add(value / i);
                }
            }
            for (int f : factors) {
                System.out.print(f + " ");
            }
        }
    }
