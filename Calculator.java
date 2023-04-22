import java.awt.event.*;
import javax.swing.*;
public class Calculator {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");
        JTextField tf = new JTextField();
        tf.setBounds(50, 50, 200, 50);
        JButton one = new JButton("1");
        one.setBounds(20, 20, 50, 50);
        f.add(one);
        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
