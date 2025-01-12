import java.awt.*;
import javax.swing.*;

public class gridLayout {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Grid Layout");

        JTextField textField=new JTextField("Your Name",20);
        
        //set layout
        frame.setLayout(new GridLayout(3,2,2,2));
        frame.add(new JLabel("Enter you name: "));
        frame.add(textField);
        frame.add(new JLabel("hi"));
        frame.add(new JLabel("hello"));
        frame.add(new JLabel());
        frame.add(new JButton("Submit"));

        
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
