//Create multiple frame, master frame and temporary frame

import javax.swing.*;


public class multipleframe{
	public static void main(String args[]){
			JFrame masterframe=new JFrame("Master Frame");
			masterframe.setSize(400,300);
			masterframe.setDefaultCloseOperation(masterframe.EXIT_ON_CLOSE); //EXIT_ON_CLOSE

			JFrame temporaryframe=new JFrame("Temporary Frame");
			temporaryframe.setSize(300,300);
			temporaryframe.setDefaultCloseOperation(temporaryframe.DISPOSE_ON_CLOSE); //DISPOSE_ON_CLOSE

			masterframe.setVisible(true);
			temporaryframe.setVisible(true);
		}
	}