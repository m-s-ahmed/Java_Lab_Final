import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class anotherTemCon {
    @SuppressWarnings("unused")//optional
    public static void main(String[] args) {
        JFrame frame=new JFrame("Temperature Conversion");
       
        JLabel l=new JLabel("Enter far: ");
        JLabel l2=new JLabel("Calculated cel:");
        JTextField far=new JTextField(20);
        JTextField cel=new JTextField(20);
        cel.setEditable(false);
        JButton submit=new JButton("Submit");

        submit.addActionListener(e->{
           double fartem= Double.parseDouble(far.getText());
           double celtem=(fartem-32)*5/9;
          // String finall=String.valueOf(celtem);
          //cel.setText(finall);
          cel.setText(String.format("%.3f", celtem));
        });

        frame.add(l);
        frame.add(far);
        frame.add(l2);
        frame.add(cel);
        frame.add(submit);

        
        frame.setLayout(new GridLayout(3,2));
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
