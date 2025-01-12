//a4
import javax.swing.*;

public class MenuExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Menu Example");
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu helpMenu=new JMenu("Help");
        JMenu menu1=new JMenu("Menu 1");
        JMenu menu2=new JMenu("Menu 2");
        JMenu menu3=new JMenu("Menu 3");

        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");
        JMenuItem saveItem= new JMenuItem("Save");
        JMenuItem saveAsItem= new JMenuItem("Save As");
        JMenuItem printItem= new JMenuItem("Print");

        JMenuItem appleItem=new JMenuItem("Apple");
        JMenuItem orangeItem=new JMenuItem("Orange");
        JMenuItem bananaItem=new JMenuItem("Banana");

        JMenuItem blackItem=new JMenuItem("Black");
        JMenuItem redItem=new JMenuItem("Red");
        JMenuItem greenItem=new JMenuItem("Green");

        //exitItem.addActionListener(e -> System.exit(0));


        fileMenu.add(openItem);
        fileMenu.add(exitItem);
        fileMenu.add(saveItem);
        fileMenu.add(saveAsItem);
        fileMenu.add(printItem);

		menu1.add(appleItem);
		menu1.add(orangeItem);
		menu1.add(bananaItem);

		menu2.add(blackItem);
		menu2.add(redItem);
		menu2.add(greenItem);

		menu3.add(new JMenuItem("Ahmed"));
		menu3.add(new JMenuItem("Md"));
		menu3.add(new JMenuItem("Sajid"));

        //Added in menubar
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);


        frame.setJMenuBar(menuBar);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
