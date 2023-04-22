import java.awt.event.*;
import javax.swing.*;
public class Calculator {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");
        JTextField tf = new JTextField();
        int x = 50;
        tf.setBounds(50, 50, 250, 50);

        JButton zero = new JButton("0");
        zero.setBounds(20 + x, 300, 100, 50);
        f.add(zero);

        JButton one = new JButton("1");
        one.setBounds(20 + x, 250, 50, 50);
        f.add(one);
        
        JButton two = new JButton("2");
        two.setBounds(70 + x, 250, 50, 50);
        f.add(two);

        JButton three = new JButton("3");
        three.setBounds(120 + x, 250, 50, 50);
        f.add(three);

        JButton four = new JButton("4");
        four.setBounds(20 + x, 200, 50, 50);
        f.add(four);

        JButton five = new JButton("5");
        five.setBounds(70 + x, 200, 50, 50);
        f.add(five);

        JButton six = new JButton("6");
        six.setBounds(120 + x, 200, 50, 50);
        f.add(six);

        JButton seven = new JButton("7");
        seven.setBounds(20 + x, 150, 50, 50);
        f.add(seven);

        JButton eight = new JButton("8");
        eight.setBounds(70 + x, 150, 50, 50);
        f.add(eight);

        JButton nine = new JButton("9");
        nine.setBounds(120 + x, 150, 50, 50);
        f.add(nine);

 

        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

        one.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("1");
            }
        });

    }
}
