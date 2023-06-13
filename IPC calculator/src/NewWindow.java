
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewWindow implements ActionListener{

    JFrame frame = new JFrame();

    JButton myButton = new JButton("practice problem");
    JLabel label = new JLabel("Force equals Mass multiplied by Acceleration");
    JLabel label2 = new JLabel("Mass equals Force divided by Acceleration");
    JLabel label3 = new JLabel("Acceleration equals Force divided by Mass");
    NewWindow(){


        myButton.setBounds(100,160,200,40);
        myButton.setFocusable(false);
        myButton.addActionListener((ActionListener) this);

        label.setBounds(0,0,550,50);
        label.setFont(new Font(null, Font.PLAIN,25));
        label2.setBounds(0, 50, 550, 50);
        label2.setFont(new Font(null, Font.PLAIN, 25));
        label3.setBounds(0, 100, 550, 50);
        label3.setFont(new Font(null, Font.PLAIN, 25));

        frame.add(label);
        frame.add(label2);
        frame.add(label3);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 700);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.add(myButton);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==myButton){
            ForceSampleProblem myWindow = new ForceSampleProblem();
        }

    }

}
