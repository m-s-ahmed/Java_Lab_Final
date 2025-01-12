//Increment

import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;

public class increment{
    @SuppressWarnings("unused")
	public static void main(String args[]){
		JFrame frame=new JFrame("Increment Example");
		JTextField textField=new JTextField("0",10);//initial,column no
		//10: This specifies the number of columns in the text field. 
        //The width of the text field is determined based on the specified number of columns.
		JButton button=new JButton("Increment");

		frame.setLayout(new FlowLayout());

		button.addActionListener(e->{
			int value=Integer.parseInt(textField.getText());
			textField.setText(String.valueOf(value+1));
			});

		frame.add(textField,"North");
		frame.add(button,"South");

		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		}
	}