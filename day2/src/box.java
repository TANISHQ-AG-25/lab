import java.util.Scanner;
public class box {
    int length;
    int width;
    int height;
    box(int length,int width,int height)
    {
        this.length=length;
        this.width=width;
        this.height=height;
    }
    int volume()
    {
        return length*height*width;
    }
}
class demo{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int length = sc.nextInt();
        System.out.println("Enter width");
        int width = sc.nextInt();
        System.out.println("Enter height");
        int height = sc.nextInt();
        box dim = new box(length,width,height);
        System.out.println("Volume is "+ dim.volume());
    }
}