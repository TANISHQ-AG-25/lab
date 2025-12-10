import java.util.Scanner;
class grade{
    int m;
    grade(int marks)
    {
        this.m=marks;
    }
    void display()
    {
        if(m>89 && m<100)
            System.out.println("GRADE : O");
        else if(m>79 && m<90)
            System.out.println("GRADE : E");
        else if(m>69 && m<80)
            System.out.println("GRADE : A");
        else if(m>59 && m<70)
            System.out.println("GRADE : B");
        else if(m>49 && m<60)
            System.out.println("GRADE : C");
    }
}
class data{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks");
        int marks= sc.nextInt();
        grade stu = new grade(marks);
        stu.display();
    }
}