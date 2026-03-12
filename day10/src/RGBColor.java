import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RGBColor extends JFrame implements ActionListener
{
    JLabel l1,l2,l3;
    JComboBox cb1,cb2,cb3;
    JButton btn;

    RGBColor()
    {
        setTitle("My Frame");
        setSize(500,250);
        setLayout(null);

        Integer values[] = new Integer[256];
        for(int i=0;i<256;i++)
        {
            values[i] = i;
        }

        l1 = new JLabel("Red");
        l1.setBounds(50,40,50,30);
        l1.setForeground(Color.RED);
        add(l1);

        cb1 = new JComboBox(values);
        cb1.setBounds(90,40,70,30);
        add(cb1);

        l2 = new JLabel("Blue");
        l2.setBounds(180,40,50,30);
        l2.setForeground(Color.BLUE);
        add(l2);

        cb2 = new JComboBox(values);
        cb2.setBounds(220,40,70,30);
        add(cb2);

        l3 = new JLabel("Green");
        l3.setBounds(310,40,60,30);
        l3.setForeground(Color.GREEN);
        add(l3);

        cb3 = new JComboBox(values);
        cb3.setBounds(360,40,70,30);
        add(cb3);

        btn = new JButton("Show-Output");
        btn.setBounds(200,90,120,30);
        add(btn);

        btn.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        int r = (Integer)cb1.getSelectedItem();
        int b = (Integer)cb2.getSelectedItem();
        int g = (Integer)cb3.getSelectedItem();

        Color c = new Color(r,g,b);
        getContentPane().setBackground(c);
    }

    public static void main(String args[])
    {
        new RGBColor();
    }
}