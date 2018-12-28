package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class firstPage {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("F:\\GUI\\src\\game\\picture.jpg");
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(1024, 638);
        frame.setTitle("Kids Math");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new JLabel(icon));
        frame.setResizable(false);

  /*     ImageIcon icon = new ImageIcon("F:\\GUI\\src\\image\\kids.png");
         JLabel labelpic = new JLabel();
        labelpic.setIcon(icon);
        labelpic.setBounds(0, 0, 100, 100);
        frame.add(labelpic);
*/
     /*   frame.setLayout(new BorderLayout());
        frame.setContentPane(new JLabel(new ImageIcon("F:\\GUI\\src\\image\\kids.png")));
        frame.setLayout(new FlowLayout());*/


        JButton sum = new JButton("Addition");
        sum.setBounds(310, 450, 150, 30);
        sum.setFont(new Font("Tahoma", Font.BOLD, 20));
        sum.setForeground(Color.decode("#ff6666"));
        frame.add(sum);

        JButton sub = new JButton("Subtraction");
        sub.setBounds(510, 450, 180, 30);
        sub.setFont(new Font("Tahoma", Font.BOLD, 20));
        sub.setForeground(Color.decode("#ff6666"));
        frame.add(sub);

        sum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add a = new add();
                frame.dispose();

            }
        });

        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new sub();
                frame.dispose();

            }
        });


        frame.setVisible(true);
    }
}
