import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Calculator {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");
        JTextField tf = new JTextField();
        int x = 50;
        ArrayList<String> typed = new ArrayList<String>();
        int First_term;
        int second_term;
        StringBuffer sb = new StringBuffer();
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

        JButton print_typed = new JButton("print_typed");
        print_typed.setBounds(150, 150, 200, 90);
        f.add(print_typed);

        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        zero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
                typed.add("0");

            }
        });
        one.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
                typed.add("1");

            }
        });
        two.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
                typed.add("2");

            }
        });
        three.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
                typed.add("3");

            }
        });
        four.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
                typed.add("4");

            }
        });
        five.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
                typed.add("5");

            }
        });
        six.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
                typed.add("6");

            }
        });
        seven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
                typed.add("7");

            }
        });
        eight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
                typed.add("8");

            }
        });
        nine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
                typed.add("9");

            }
        });
        print_typed.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("test1");
                for (String s : typed) {
                    // sb.append(s);
                    System.out.print(s);
                }
                tf.setText(sb.toString());
                System.out.println(sb.toString());
               // First_term = Integer.parseInt(sb.toString());
            }
        });

        // for (int i = 0; i < typed.size(); i++) {
        // System.out.print(typed.get(i) + " ");
    }
}
