//color change

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class color{
	@SuppressWarnings("unused")
    public static void main(String args[]){
		JFrame frame=new JFrame("Color Changing Example");
		JButton button1=new JButton("Red");
		JButton button2=new JButton("Yellow");
		JButton button3=new JButton("Green");

		//frame.getContentPane().setBackground(Color.GREEN);
		//get content pane is the main area within the frame where component are added and displayed

		/*button1.addActionListener(e->{
			frame.getContentPane().setBackground(Color.RED);
			});*/
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				frame.getContentPane().setBackground(Color.RED);
				}
			});

		button2.addActionListener(e->{
			frame.getContentPane().setBackground(Color.YELLOW);
			});
		button3.addActionListener(e->{
			frame.getContentPane().setBackground(Color.GREEN);
			});

		frame.add(button1);
		frame.add(button2);
		frame.add(button3);

		frame.setLayout(new FlowLayout());
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		}
	}