public class objcount {
    static int c=0;
    objcount()
    {
        this.c++;
    }
    void display()
    {
        System.out.println("total no of objects is " + this.c);
    }
}
class obj{
    static void main() {
        objcount o1 = new objcount();
        objcount o2 = new objcount();
        objcount o3 = new objcount();
        objcount o4 = new objcount();
        objcount o5 = new objcount();
        o1.display();
    }
}
