import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class flowLayout {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Flow Layout");

        JTextField textField=new JTextField("Your Name",20);
        //set layout
        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("Enter you name: "));
        frame.add(textField);
        frame.add(new JButton("Submit"));

        
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
