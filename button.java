import java.awt.event.*;
import javax.swing.*;

public class button {
    public static void main(String[] args) {
        // Example on the JavaTpoint website
        JFrame f = new JFrame("Button Example");
        final JTextField tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);
        JButton b = new JButton("Click Here");
        b.setBounds(50, 100, 95, 30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("Welcome to Javatpoint.");
            }
        });
        JButton x = new JButton("Click here plz");
        x.setBounds(100, 200, 95, 30);
        x.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("Hello World");
            }
        });
        f.add(b);
        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.add(x);
    };
}