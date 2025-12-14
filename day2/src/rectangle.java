import java.util.Scanner;
public class rectangle {
    int length;
    int breadth;
    rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    void read()
    {

    }
}
class data
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        rectangle rec = new rectangle(length,breadth);
    }
}
