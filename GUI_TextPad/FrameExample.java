//Graphical User Interface

import java.awt.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameExample{
	public static void main(String agrs[]){
		Frame frame=new Frame("My First GUI Frame");
		frame.setSize(400,300);
		frame.setVisible(true);

		//For working exit icon
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				frame.dispose();
				}
			});


		}
	}