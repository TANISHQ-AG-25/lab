import java.util.Scanner;

public class odd {
    static int co=0;
    static int ce=0;
    void check(int n)
    {
        if(n%2!=0)
            co++;
        else
            ce++;
    }
    void display()
    {
        System.out.println("No of odd numbers is/are : "+co);
        System.out.println("No of even numbers is/are : "+ce);
    }

}
class number
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter number");
            n= sc.nextInt();
            odd num = new odd();
            num.check(n);
        }
        odd num = new odd();
        num.display();
    }
}
