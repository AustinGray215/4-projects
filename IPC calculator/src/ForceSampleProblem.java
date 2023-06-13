import javax.swing.*;
import java.awt.*;
public class ForceSampleProblem {


    JFrame frame = new JFrame();

    JLabel label = new JLabel("What is the force in newtons(N) of a truck weighing 36287.39 " +
            "kilograms moving at a rate of 29.0576 meters per second.");
    JLabel label2 = new JLabel("What is the weight in kilograms(kg) of a truck with a force of 1,054,424.463664 ");
    JLabel label3 = new JLabel("newtons moving at a rate of 29.0576 meters per second.");
    JLabel label4 = new JLabel("What is the acceleration in meters per second(m/s) of a truck with a force of 1,054,424.463664 ");
    JLabel label5 = new JLabel("newtons weighing 29.0576 kilograms.");
    JLabel label6 = new JLabel("Round to the nearest hundredth for all equations.");
   ForceSampleProblem() {


       label.setBounds(0, 0, 1400, 50);
       label.setFont(new Font(null, Font.PLAIN, 25));
       label2.setBounds(0, 50, 1400, 50);
       label2.setFont(new Font(null, Font.PLAIN, 25));
       label3.setBounds(0, 75, 1400, 50);
       label3.setFont(new Font(null, Font.PLAIN, 25));
       label4.setBounds(0, 125, 1400, 50);
       label4.setFont(new Font(null, Font.PLAIN, 25));
       label5.setBounds(0, 150, 1400, 50);
       label5.setFont(new Font(null, Font.PLAIN, 25));
       label6.setBounds(0, 250, 1400, 50);
       label6.setFont(new Font(null, Font.PLAIN, 25));

       frame.add(label);
       frame.add(label2);
       frame.add(label3);
       frame.add(label4);
       frame.add(label5);
       frame.add(label6);

       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(1500, 900);
       frame.setLayout(null);
       frame.setVisible(true);
   }
}
