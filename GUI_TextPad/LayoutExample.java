//Rough 
import javax.swing.*;
import java.awt.*;

public class LayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Flow Layout Example");
        frame.setLayout(new FlowLayout());

        frame.add(new JLabel("Label:"));
        frame.add(new JTextField(10));
        frame.add(new JButton("Submit"));

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
