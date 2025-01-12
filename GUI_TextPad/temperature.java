//Temperature convert

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class temperature{
	public static void main(String args[]){
		JFrame frame=new JFrame("Temperature Conversion");
		//JTextField textField=new JTextField("Enter Fahrenheit",10);
		JTextField textField1=new JTextField(10);
		JTextField textField2=new JTextField(10);
		JButton button=new JButton("Convert");

		frame.add(new JLabel("F:"));
		frame.add(textField1);
		frame.add(button);
		frame.add(new JLabel("C:"));
		frame.add(textField2);
		//frame.add(button);

		button.addActionListener(e->{
		double far=Double.parseDouble(textField1.getText());
		double cel=(far-32)*5/9;
		//textField2.setText(String.valueOf(cel));
		textField2.setText(String.format("%.2f",cel));
			});

		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setVisible(true);
		}
	}