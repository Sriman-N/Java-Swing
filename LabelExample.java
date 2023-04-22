import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LabelExample extends Frame implements ActionListener {
    JTextField tf;
    JLabel l;
    JButton b;
    JTextField JTF;
    JLabel JL;
    JButton JB;

    LabelExample() {
        tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);
        l = new JLabel();
        l.setBounds(50, 100, 250, 20);
        b = new JButton("Find IP");
        b.setBounds(50, 150, 95, 30);
        b.addActionListener(this);
        add(b);
        add(tf);
        add(l);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    void MyLabelExample() {
        JTF = new JTextField();
        JTF.setBounds(50, 50, 150, 20);
        JL = new JLabel();
        l.setBounds(50, 100, 250, 20);
        JB = new JButton();
        JB.setBounds(50, 150, 95, 30);
        JB.addActionListener(this);
        add(JTF);
        add(JL);
        add(JB);
        setSize(400, 400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String host = tf.getText();
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("IP of " + host + " is: " + ip);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        new LabelExample();
    }
}