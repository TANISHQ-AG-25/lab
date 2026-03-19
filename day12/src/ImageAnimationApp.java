import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageAnimationApp extends JFrame {

    JLabel imageLabel, textLabel;
    JButton startBtn, stopBtn;

    int x = 300, y = 100;
    boolean running = false;

    Thread animationThread, textThread;

    String[] messages = {"Welcome", "Enjoy", "Thanks", "Visit Again"};

    public ImageAnimationApp() {
        setTitle("Animation App");
        setSize(800, 500);
        setLayout(null);
        getContentPane().setBackground(Color.pink);

        ImageIcon icon = new ImageIcon("C:\\Users\\KIIT\\Desktop\\img.jpeg"); // put your image path
        imageLabel = new JLabel(icon);
        imageLabel.setBounds(x, y, 100, 100);
        add(imageLabel);

        textLabel = new JLabel("Welcome", JLabel.CENTER);
        textLabel.setFont(new Font("Aria", Font.BOLD, 24));
        textLabel.setBounds(250, 200, 300, 50);
        add(textLabel);

        startBtn = new JButton("Start Animation");
        startBtn.setBounds(200, 300, 150, 40);
        add(startBtn);

        stopBtn = new JButton("Stop Animation");
        stopBtn.setBounds(400, 300, 150, 40);
        add(stopBtn);

        startBtn.addActionListener(e -> startAnimation());
        stopBtn.addActionListener(e -> stopAnimation());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    void startAnimation() {
        running = true;
        animationThread = new Thread(() -> {
            try {
                while (running) {

                    for (int i = 0; i < 200 && running; i++) {
                        x++;
                        updatePosition();
                        Thread.sleep(10);
                    }

                    for (int i = 0; i < 200 && running; i++) {
                        y++;
                        updatePosition();
                        Thread.sleep(10);
                    }

                    for (int i = 0; i < 200 && running; i++) {
                        x--;
                        updatePosition();
                        Thread.sleep(10);
                    }

                    for (int i = 0; i < 200 && running; i++) {
                        y--;
                        updatePosition();
                        Thread.sleep(10);
                    }
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        textThread = new Thread(() -> {
            int i = 0;
            try {
                while (running) {
                    textLabel.setText(messages[i % messages.length]);
                    i++;
                    Thread.sleep(1000); // change text every 1 sec
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        animationThread.start();
        textThread.start();
    }

    void stopAnimation() {
        running = false;
    }

    void updatePosition() {
        SwingUtilities.invokeLater(() -> {
            imageLabel.setBounds(x, y, 100, 100);
        });
    }

    public static void main(String[] args) {
        new ImageAnimationApp();
    }
}