
public class sub {
    int a,b;
    sub(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void subtract()
    {
        System.out.println(this.a-this.b);
    }
    void subtract(int a)
    {
        System.out.println(a-this.b);
    }
    void subtract(int a, int b)
    {
        System.out.println(a-b);
    }
}
class num
{
    static void main() {
        sub s = new sub(25,5);
        s.subtract();
        s.subtract(2);
        s.subtract(7,3);
    }
}
