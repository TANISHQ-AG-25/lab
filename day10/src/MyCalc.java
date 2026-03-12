import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyCalc extends JFrame implements ActionListener
{
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1,b2,b3,b4;

    MyCalc()
    {
        setTitle("My Calc");
        setSize(500,300);
        setLayout(null);

        l1 = new JLabel("Enter the First Number:");
        l1.setBounds(50,50,150,30);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(200,50,100,30);
        add(t1);

        l2 = new JLabel("Enter the Second Number:");
        l2.setBounds(50,100,170,30);
        add(l2);

        t2 = new JTextField();
        t2.setBounds(200,100,100,30);
        add(t2);

        l3 = new JLabel("Result:");
        l3.setBounds(50,150,100,30);
        add(l3);

        t3 = new JTextField();
        t3.setBounds(200,150,100,30);
        add(t3);

        b1 = new JButton("Add");
        b1.setBounds(320,50,100,30);
        add(b1);

        b2 = new JButton("Subtract");
        b2.setBounds(320,90,100,30);
        add(b2);

        b3 = new JButton("Multiply");
        b3.setBounds(320,130,100,30);
        add(b3);

        b4 = new JButton("Reset");
        b4.setBounds(320,170,100,30);
        add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());
        int result = 0;

        if(e.getSource()==b1)
        {
            result = n1 + n2;
            t3.setText(String.valueOf(result));
        }

        if(e.getSource()==b2)
        {
            result = n1 - n2;
            t3.setText(String.valueOf(result));
        }

        if(e.getSource()==b3)
        {
            result = n1 * n2;
            t3.setText(String.valueOf(result));
        }

        if(e.getSource()==b4)
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
    }

    public static void main(String args[])
    {
        new MyCalc();
    }
}