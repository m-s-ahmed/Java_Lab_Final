//Extending JFrame
//have problem
import javax.swing.*;

public class ExtendingJFrame extends JFrame{
	public void customFrame(){
		setTitle("My first GUI window");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
public static void main(String args[]){
	ExtendingJFrame frame=new ExtendingJFrame();
	frame.setVisible(true);
	}
}