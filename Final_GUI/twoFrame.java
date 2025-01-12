import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class twoFrame {
    public static void main(String[] args) {
        JFrame masterFrame=new JFrame("Master Frame");
        JFrame temporaryFrame=new JFrame("Temporary Frame");

        masterFrame.setSize(400,400);
        //masterFrame.setDefaultCloseOperation(masterFrame.EXIT_ON_CLOSE);
        masterFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        temporaryFrame.setSize(300,300);
        //temporaryFrame.setDefaultCloseOperation(temporaryFrame.DISPOSE_ON_CLOSE);
        temporaryFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        masterFrame.setVisible(true);
        temporaryFrame.setVisible(true);

    }
}
