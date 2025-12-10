import java.util.Scanner;

public class week {
    int date;
    week(int date)
    {
        this.date=date;
    }
    void check()
    {
        int d = date % 7;
         switch(d)
         {
             case 0:
                 System.out.println("SUNDAY");
                 break;
             case 1:
                 System.out.println("MONDAY");
                 break;
             case 2:
                 System.out.println("TUESDAY");
                 break;
             case 3:
                 System.out.println("WEDNESDAY");
                 break;
             case 4:
                 System.out.println("THURSDAY");
                 break;
             case 5:
                 System.out.println("FRIDAY");
                 break;
             case 6:
                 System.out.println("SATURDAY");
                 break;
             default:
                 System.out.println("SOMETHING WRONG");
         }
    }
}
class date
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date for December month");
        int date = sc.nextInt();
        week w=new week(date);
        w.check();
    }
}
