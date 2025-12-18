import java.util.Scanner;

public class account {
    int acc_no;
    int balance;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        acc_no = sc.nextInt();
        System.out.print("Enter Balance: ");
        balance = sc.nextInt();
    }
    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: Rs " + balance);
    }
}
class person extends account{
    int adh_no;
    String name;
    void inp(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Aadhar Number: ");
        adh_no = sc.nextInt();
        super.input();
    }
    void disp(){
        System.out.println("Name: " + name);
        System.out.println("Aadhar No: " + adh_no);
        super.disp();
    }
}
class entry{
    static void main() {
        person[] persons = new person[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Entering details for Person " + (i + 1) + ":");
            persons[i] = new person();
            persons[i].inp();
        }
        System.out.println("Displaying All Records:");
        for (int i = 0; i < 3; i++) {
            persons[i].disp();
        }

    }
}
