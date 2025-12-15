
import java.util.Scanner;
public class rectangle {
    int length;
    int breadth;
    int area;
    int perimeter;
    void read(int length, int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    void calculate()
    {
        this.area = this.length * this.breadth;
        this.perimeter = 2*(this.length + this.breadth);
    }
    void display()
    {
        System.out.println("Area = " + this.area);
        System.out.println("Perimeter = " + this.perimeter);
    }
}
class data
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int length = sc.nextInt();
        System.out.println("Enter breadth");
        int breadth = sc.nextInt();
        rectangle rec = new rectangle();
        rec.read(length,breadth);
        rec.calculate();
        rec.display();
    }
}
