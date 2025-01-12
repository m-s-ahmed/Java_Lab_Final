import javax.swing.*;
import java.awt.*;

public class abcd {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Radio/Combo Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        
        // Create the panels
        JPanel radioPanel = new JPanel();
        radioPanel.setBorder(BorderFactory.createTitledBorder("Radio Buttons"));
        JPanel checkPanel = new JPanel();
        checkPanel.setBorder(BorderFactory.createTitledBorder("Check Boxes"));
        
        // Create radio buttons
        JRadioButton radioButton1 = new JRadioButton("4 slices");
        JRadioButton radioButton2 = new JRadioButton("8 slices");
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        
        // Add radio buttons to the panel
        radioPanel.add(radioButton1);
        radioPanel.add(radioButton2);
        
        // Create check boxes
        JCheckBox checkBox1 = new JCheckBox("Anchovies");
        JCheckBox checkBox2 = new JCheckBox("Garlic");
        checkBox2.setSelected(true);
        
        // Add check boxes to the panel
        checkPanel.add(checkBox1);
        checkPanel.add(checkBox2);
        
        // Create combo box
        String[] items = {"Bird", "Cat", "Dog", "Rabbit", "Cow"};
        JComboBox<String> comboBox = new JComboBox<>(items);
        comboBox.setSelectedItem("Cow");
        
        // Add combo box to the panel
        checkPanel.add(comboBox);
        
        // Set layout and add panels to the frame
        frame.setLayout(new GridLayout(1, 2));
        frame.add(radioPanel);
        frame.add(checkPanel);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}
