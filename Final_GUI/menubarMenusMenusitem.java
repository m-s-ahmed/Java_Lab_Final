import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
//import javax.swing.*;


public class menubarMenusMenusitem {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        JFrame frame=new JFrame("Menu");
        JMenuBar menuBar=new JMenuBar();
        
        JMenu file=new JMenu("File");
        JMenu help=new JMenu("Help");
        JMenu contact=new JMenu("Contact");
        JMenu fruits=new JMenu("Fruits");
        JMenu colors=new JMenu("Colors");
        JMenu foods=new JMenu("Foods");

        fruits.add(new JMenuItem("Apple"));
        fruits.add(new JMenuItem("Banana"));
        fruits.add(new JMenuItem("Orange"));
        fruits.add(new JMenuItem("Malta"));

        JMenuItem exit=new JMenuItem("Exit");
        exit.addActionListener(e->{
            System.exit(0);
        });
        file.add(exit);

        menuBar.add(file);
        menuBar.add(help);
        menuBar.add(contact);
        menuBar.add(fruits);
        menuBar.add(colors);
        menuBar.add(foods);
        

        frame.setJMenuBar(menuBar);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
