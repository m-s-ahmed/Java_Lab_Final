//a5

import javax.swing.*;

public class assignment5{
	public static void main(String args[]){

		JFrame frame=new JFrame("Assignment 5");
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();

		panel1.add(new JRadioButton("Option1"));
		panel1.add(new JRadioButton("Option2"));
		panel1.add(new JRadioButton("Option3"));
		panel1.add(new JRadioButton("Option4"));

		panel2.add(new JCheckBox("Check me 1"));
		panel2.add(new JCheckBox("Check me 2"));
		panel2.add(new JCheckBox("Check me 3"));
		panel2.add(new JCheckBox("Check me 4"));

		panel3.add(new JComboBox<>(new String[]{"Item1","Item2"}));

		//frame.add(panel1,"North");
		//frame.add(panel2,"South");
		frame.add(panel1,"East");
		frame.add(panel2,"West");
		frame.add(panel3,"Center");
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		}
	}