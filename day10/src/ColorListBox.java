import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorListBox extends JFrame implements ActionListener
{
    JList list;
    JButton btn;
    String colors[] = {"white","orange","red","blue"};

    ColorListBox()
    {
        setTitle("My frame");
        setSize(400,250);
        setLayout(null);

        list = new JList(colors);
        list.setBounds(150,60,80,80);
        add(list);

        btn = new JButton("Click");
        btn.setBounds(250,80,80,30);
        add(btn);

        btn.addActionListener(this);

        getContentPane().setBackground(Color.BLUE);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        String c = (String)list.getSelectedValue();

        if(c.equals("white"))
            getContentPane().setBackground(Color.WHITE);

        if(c.equals("orange"))
            getContentPane().setBackground(Color.ORANGE);

        if(c.equals("red"))
            getContentPane().setBackground(Color.RED);

        if(c.equals("blue"))
            getContentPane().setBackground(Color.BLUE);
    }

    public static void main(String args[])
    {
        new ColorListBox();
    }
}