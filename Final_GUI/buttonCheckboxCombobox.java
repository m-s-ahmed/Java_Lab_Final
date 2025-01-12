import javax.swing.*;
import java.awt.*;

public class buttonCheckboxCombobox {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Radio/Combo Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        
        // Create the radio button panel
        JPanel radioPanel = new JPanel();
        radioPanel.setBorder(BorderFactory.createTitledBorder("Radio Buttons"));
        // BorderFactory class
        
        // Create radio buttons
        JRadioButton radioButton1 = new JRadioButton("4 slices");
        JRadioButton radioButton2 = new JRadioButton("8 slices");
        JRadioButton radioButton3 = new JRadioButton("10 slices");
        radioButton2.setSelected(true);
        
        // Group the radio buttons
        //This is a class in the Swing package that is used 
        //to create a group of buttons where only one button 
        //can be selected at a time.This is typically used with radio buttons.

        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);
      
        
        radioPanel.setLayout(new GridLayout(3,2));
        // Add radio buttons to the radio panel
        radioPanel.add(radioButton1);
        radioPanel.add(radioButton2);
        radioPanel.add(new JLabel());
        radioPanel.add(radioButton3);
        
        // Create the check box panel
        JPanel checkPanel = new JPanel();
        checkPanel.setBorder(BorderFactory.createTitledBorder("Check Boxes"));
        
        // Create check boxes
        JCheckBox checkBox1 = new JCheckBox("Anchovies");
        JCheckBox checkBox2 = new JCheckBox("Garlic");
        checkBox2.setSelected(true);
        
        // Add check boxes to the check panel
        checkPanel.add(checkBox1);
        checkPanel.add(checkBox2);
        
        // Create combo box
        String[] items = {"Bird", "Cat", "Dog", "Rabbit", "Cow"};
        JComboBox<String> comboBox = new JComboBox<>(items);
        comboBox.setSelectedItem("Cow");
        
        // Add combo box to the check panel
        checkPanel.add(comboBox);
        
        // Set the layout and add panels to the frame
        frame.setLayout(new GridLayout(1, 2));
        frame.add(radioPanel);
        frame.add(checkPanel);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}
