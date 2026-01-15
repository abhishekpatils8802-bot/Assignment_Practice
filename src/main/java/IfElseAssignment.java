import java.util.Scanner;

public class IfElseAssignment {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter no between 1-12:");
            int month = sc.nextInt();
            if (month == 0)
            {
                break;

            }
            int days;
            switch (month)
            {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 2:
                    days = 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                default:
                    System.out.println("enter valid month");
                    return;
            }
            System.out.println("ENter days " + days);
        }
    }
}


//        if (month==1||month==3||month==5||month==7||month==8||month==10||month==12)
//        {
//            System.out.println("Month days 31");
//        } else if (month==4||month==6||month==9||month==11)
//        {
//            System.out.println("Month day 30");
//        } else if (month==2)
//        {
//            System.out.println("Month day 28");
//        }else
//        {
//            System.out.println("Enter valid month");
//        }

//        1	January	Jan.	31	winter
//        2	February	Feb.	28/29
//        3	March	Mar.	31	spring
//        4	April	Apr.	30
//        5	May	May	31
//        6	June	Jun.	30	summer
//        7	July	Jul.	31
//        8	August	Aug.	31
//        9	September	Sep.	30	autumn
//        10	October	Oct.	31
//        11	November	Nov.	30
//     12	December	Dec.	31	winter
