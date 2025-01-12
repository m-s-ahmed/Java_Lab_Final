//Flow layout

import javax.swing.*;
import java.awt.*;//FlowLayout set korte lagse

public class a3{
	public static void main(String args[]){
		JFrame frame=new JFrame("My frame");

		frame.setLayout(new FlowLayout());
		//frame.setLayout(new BorderLayout());
		//frame.setLayout(new GridLayout());


		frame.setSize(400,400);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);


		frame.add(new JLabel("Label:"));
		frame.add(new JTextField(10));
		frame.add(new JButton("Submit"));

		frame.setVisible(true);
		}
	}