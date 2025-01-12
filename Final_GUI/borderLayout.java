import java.awt.BorderLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class borderLayout {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Layout");

        JLabel label=new JLabel("Enter your name:");
        JTextField textField=new JTextField(20);
        JButton button =new JButton("Submit");

        frame.setLayout(new BorderLayout());
        
        frame.add(label,BorderLayout.SOUTH);
        frame.add(textField,BorderLayout.NORTH);
        //frame.add(new JLabel());//empty
        frame.add(button,BorderLayout.CENTER);

        //frame.setLayout(new FlowLayout());
        //frame.setLayout(new GridLayout(3,2,5,5));
        

        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}