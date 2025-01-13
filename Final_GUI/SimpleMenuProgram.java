import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleMenuProgram {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Simple Menu Program");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create menus
        JMenu stateMenu = new JMenu("Indian States");
        JMenu cityMenu = new JMenu("Indian Cities");

        // Add menu items for Indian States
        JMenuItem himachalPradesh = new JMenuItem("Himachal Pradesh");
        JMenuItem rajasthan = new JMenuItem("Rajasthan");
        JMenuItem westBengal = new JMenuItem("West Bengal");
        JMenuItem tamilNadu = new JMenuItem("Tamil Nadu");
        JMenuItem karnataka = new JMenuItem("Karnataka");

        // Add menu items to the state menu
        stateMenu.add(himachalPradesh);
        stateMenu.add(rajasthan);
        stateMenu.add(westBengal);
        stateMenu.add(tamilNadu);
        stateMenu.add(karnataka);

        // Add menu items for Indian Cities
        JMenuItem shimla = new JMenuItem("Shimla");
        JMenuItem jaipur = new JMenuItem("Jaipur");
        JMenuItem kolkata = new JMenuItem("Kolkata");
        JMenuItem chennai = new JMenuItem("Chennai");
        JMenuItem bengaluru = new JMenuItem("Bengaluru");

        // Add menu items to the city menu
        cityMenu.add(shimla);
        cityMenu.add(jaipur);
        cityMenu.add(kolkata);
        cityMenu.add(chennai);
        cityMenu.add(bengaluru);

        // Add menus to the menu bar
        menuBar.add(stateMenu);
        menuBar.add(cityMenu);

        // Set the menu bar for the frame
        frame.setJMenuBar(menuBar);

        // Create a label to display output
        JLabel label = new JLabel("Select an option from the menu", SwingConstants.CENTER);
        frame.add(label);

        // Add action listeners for state menu items
        himachalPradesh.addActionListener(e -> label.setText("You selected: Himachal Pradesh"));
        rajasthan.addActionListener(e -> label.setText("You selected: Rajasthan"));
        westBengal.addActionListener(e -> label.setText("You selected: West Bengal"));
        tamilNadu.addActionListener(e -> label.setText("You selected: Tamil Nadu"));
        karnataka.addActionListener(e -> label.setText("You selected: Karnataka"));

        // Add action listeners for city menu items
        shimla.addActionListener(e -> label.setText("You selected: Shimla"));
        jaipur.addActionListener(e -> label.setText("You selected: Jaipur"));
        kolkata.addActionListener(e -> label.setText("You selected: Kolkata"));
        chennai.addActionListener(e -> label.setText("You selected: Chennai"));
        bengaluru.addActionListener(e -> label.setText("You selected: Bengaluru"));

        // Set the frame visibility
        frame.setVisible(true);
    }
}
