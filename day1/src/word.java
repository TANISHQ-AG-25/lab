import java.util.Scanner;

public class word {
    String str;
    word(String str)
    {
        this.str=str;
    }
    void display()
    {
        System.out.print(str+" ");
    }
}
class input
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string one ");
        String str1 =sc.nextLine();
        System.out.println("Enter string two ");
        String str2 =sc.nextLine();
        word s1 = new word(str1);
        word s2 = new word(str2);
        s2.display();
        s1.display();
    }
}