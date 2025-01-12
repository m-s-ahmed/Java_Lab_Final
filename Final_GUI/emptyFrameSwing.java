import javax.swing.JFrame;

public class emptyFrameSwing {
    public static void main(String[] args) {
        
        JFrame jframe=new JFrame("My first GUI frame");
        
		jframe.setSize(400,300);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
    }
}
