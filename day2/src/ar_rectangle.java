public class ar_rectangle {
    int l;
    int b;
    ar_rectangle(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    ar_rectangle(int l)
    {
        this.l=l;
        this.b=5;
    }
    ar_rectangle()
    {
        this.l=5;
        this.b=5;
    }
    int area()
    {
        return this.l*this.b;
    }
}
class rec{
    static void main() {
        ar_rectangle r1 = new ar_rectangle(20,10);
        ar_rectangle r2 = new ar_rectangle(30);
        ar_rectangle r3 = new ar_rectangle();
        System.out.println(r1.area());
        System.out.println(r2.area());
        System.out.println(r3.area());
    }
}
