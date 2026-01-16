public class PrimeNo
{
    public static void main(String[] args)
    {
        int count=0;
        for(int num=2;count<20;num++)
        {
            boolean prime=true;
            for(int i=2;i<=num/2;i++)
            {
                if (num%i==0)
                {
                    prime=false;
                    break;
                }
            }
            if (prime)
            {
                System.out.print(num + " ");
                count++;
            }
        }
    }
}
