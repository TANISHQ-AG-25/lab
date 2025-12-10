import java.util.Scanner;

public class palindrome {
    int n;
    palindrome(int n)
    {
        this.n=n;
    }
    void check()
    {
        int m=n,d,r=0;
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            r=r*10+d;
        }
        if(m==r)
            System.out.println("It is palindrome");
        else
            System.out.println("It is not palindrome");
    }
}
class number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n= sc.nextInt();
        palindrome num= new palindrome(n);
        num.check();
    }
}
