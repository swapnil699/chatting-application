import javax.swing.*;
import java.awt.*;

public class Server extends JFrame {
    Server() {
        setLayout(null);

        // Top green panel
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(7, 94, 84));
        p1.setBounds(0, 0, 450, 70);
        add(p1);

        // Back icon
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
        JLabel back = new JLabel(i1);
        back.setBounds(5, 20, 25, 25);
        p1.add(back);

        // Set background color of the frame
        getContentPane().setBackground(Color.WHITE);

        // Set frame properties
        setSize(450, 700);
        setLocation(200, 50);
        setVisible(true);
    }

    public static void main(String args[]) {
        new Server();
    }
}