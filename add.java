package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class add {

    add() {
        ImageIcon icon = new ImageIcon("F:\\GUI\\src\\game\\picture.jpg");
        JFrame frame = new JFrame();
        frame.setSize(1024, 638);
        frame.setLayout(null);

        frame.setTitle("Kids Math");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new JLabel(icon));
        frame.setResizable(false);


        Random ram = new Random();
        int a = ram.nextInt(20);
        int b = ram.nextInt(20);
        int ans = a + b;
        String A = String.valueOf(a);
        String B = String.valueOf(b);

        JLabel jb = new JLabel();
        jb.setText(A + " + " + B + " = ");
        jb.setBounds(300, 200, 280, 50);
        jb.setFont(new Font("Tahoma", Font.BOLD, 50));
        jb.setForeground(Color.blue);
        frame.add(jb);

        JTextField tf = new JTextField();
        tf.setBounds(580, 200, 90, 55);
        tf.setFont(new Font("Tahoma", Font.BOLD, 30));
        tf.setHorizontalAlignment(JTextField.CENTER);
        frame.add(tf);

        JButton submit = new JButton("Submit");
        submit.setBounds(385, 300, 150, 40);
        submit.setFont(new Font("Tahoma", Font.BOLD, 20));
        submit.setForeground(Color.decode("#b84747"));
        frame.add(submit);

        JLabel label = new JLabel();
        label.setText("");
        label.setBounds(380, 360, 250, 30);
        label.setFont(new Font("Tahoma", Font.BOLD, 20));
        frame.add(label);

        ImageIcon icecream = new ImageIcon("F:\\GUI\\src\\game\\icecream.jpg");
        JLabel pic = new JLabel();
        pic.setBounds(380, 400, 169, 163);
        frame.add(pic);

        ImageIcon emoji = new ImageIcon("F:\\GUI\\src\\game\\emoji.jpg");
        JLabel  emo = new JLabel();
        emo.setBounds(380, 400, 151, 149);
        frame.add(emo);



        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int r = Integer.parseInt(tf.getText());

                    if (ans == r) {
                        label.setText("    Correct");
                        pic.setIcon(icecream);
                    } else {
                        label.setText("Wrong answer");
                        label.setForeground(Color.RED);
                        emo.setIcon(emoji);
                    }
                }catch (Exception x)
                {
                    JOptionPane.showMessageDialog(null, "No ice cream for you");
                }
            }
        });

        JButton next = new JButton("Next");
        next.setBounds(700, 550, 90, 30);
        next.setFont(new Font("Tahoma", Font.BOLD, 15));
        frame.add(next);

        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new add();
                frame.dispose();

            }
        });

        JButton subtraction = new JButton("Subtraction");
        subtraction.setBounds(800, 550, 150, 30);
        subtraction.setFont(new Font("Tahoma", Font.BOLD, 15));
        subtraction.setForeground(Color.decode("#ff6666"));
        frame.add(subtraction);

        subtraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new sub();
                frame.dispose();
            }
        });
        frame.setVisible(true);

    }


}
