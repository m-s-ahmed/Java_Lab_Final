import java.awt.*;
//import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class emptyFrameAwt {
    public static void main(String[] args) {
        Frame frame=new Frame("Frame with awt");
		
        frame.setSize(400,300);
		frame.setVisible(true);

        //For closing window
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }
        });

    }
}