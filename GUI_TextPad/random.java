//ddsir
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class random{
	public static void main(String args[]){
		JFrame frame=new JFrame("Text field clear and undo");

		//create a text field
		JTextField textField=new JTextField(20);

		//create a button clear
		JButton clearButton=new JButton("Clear");
		JButton undoButton=new JButton("Undo");

		final String[] lastText={""};//empty string
		//reference to the lastText can not be reassigned to point to another array
		System.out.println(lastText);

		//addActionListener
		//lamda expression
		//coincise systax
		//object of action event = e
		clearButton.addActionListener(e->{
			lastText[0]=textField.getText();
			textField.setText(" ");
			});

		undoButton.addActionListener(e->{
			textField.setText(lastText[0]);
			});

		frame.add(textField);
		frame.add(clearButton);
		frame.add(undoButton);


		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		}
	}