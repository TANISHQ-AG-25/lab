import java.util.Scanner;
class TwoD {
    double length, width;
    TwoD(double l, double w) {
        this.length = l;
        this.width = w;
    }
    double calculateSheetCost() {
        return length * width * 40;
    }
}
class ThreeD extends TwoD {
    double height;
    ThreeD(double l, double w, double h) {
        super(l, w);
        this.height = h;
    }
    double calculateBoxCost() {
        return length * width * height* 60;
    }
}
class PlasticCostCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and width of the sheet (ft): ");
        double l2 = sc.nextDouble();
        double w2 = sc.nextDouble();
        TwoD sheet = new TwoD(l2, w2);
        System.out.println("Cost of 2D Sheet: Rs " + sheet.calculateSheetCost());
        System.out.println("Enter length, width, and height of the box (ft): ");
        double l3 = sc.nextDouble();
        double w3 = sc.nextDouble();
        double h3 = sc.nextDouble();
        ThreeD box = new ThreeD(l3, w3, h3);
        System.out.println("Cost of 3D Box: Rs " + box.calculateBoxCost());
    }
}