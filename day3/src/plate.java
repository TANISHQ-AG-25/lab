import java.util.Scanner;

public class plate {
    int length, width;

    plate(int length, int width) {
        this.length = length;
        this.width = width;
    }
}
class box extends plate{
    int height;
    box(int length,int width ,int height)
    {
        super(length,width);
        this.height=height;
    }
}

class wood_box extends box {
    int thick;
    wood_box(int length,int width,int height, int thick)
    {
        super(length,width,height);
        this.thick=thick;
    }
    void pr(){
        System.out.println("length = "+ length);
        System.out.println("width = "+ width);
        System.out.println("height = "+ height);
        System.out.println("thickness = "+thick);
    }
}
class display{
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int length=sc.nextInt();
        System.out.println("enter width");
        int width = sc.nextInt();
        System.out.println("enter height");
        int height = sc.nextInt();
        System.out.println("enter thickness");
        int thick = sc.nextInt();
        wood_box obj = new wood_box(length,width,height,thick);
        obj.pr();
    }
}
