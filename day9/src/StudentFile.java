import java.io.*;
import java.util.*;

public class StudentFile {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter existing file name: ");
        String filename = sc.nextLine();
        FileWriter fw = new FileWriter(filename, true);
        fw.write(roll + " " + name + " " + subject + " " + marks + "\n");
        fw.close();
        System.out.println("\nContents of File:");
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}