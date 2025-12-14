import java.util.Scanner;

public class odd {
    int n;
    int co=0;
    int ce=0;
    odd(int n)
    {
        this.n=n;
    }
    void check()
    {
//        int ce=0,co=0;
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
            odd num = new odd(n);
            num.check();
        }
    }
}
