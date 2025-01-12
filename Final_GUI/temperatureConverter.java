import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class temperatureConverter {
    @SuppressWarnings("unused")//optional 
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Fahrenheit to Celsius Converter");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 2, 10, 10)); // Grid layout for 3 rows, 2 columns

        // Create components
        JLabel fahrenheitLabel = new JLabel("Enter Fahrenheit temperature:");
        JTextField fahrenheitField = new JTextField(10);
        JLabel celsiusLabel = new JLabel("Temperature in Celsius:");
        JTextField celsiusField = new JTextField(10);
        celsiusField.setEditable(false); // Output field should not be editable
        JButton convertButton = new JButton("Convert");

        // Add ActionListener to the button
        convertButton.addActionListener((ActionEvent e) -> {
            try {
                // Get input from the Fahrenheit text field
                double fahrenheit = Double.parseDouble(fahrenheitField.getText());

                // Convert Fahrenheit to Celsius
                double celsius = (fahrenheit - 32) * 5 / 9;

                // Display result in the Celsius text field
                celsiusField.setText(String.format("%.2f", celsius));
            } catch (NumberFormatException ex) {
                // Handle invalid input
                JOptionPane.showMessageDialog(frame, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Add components to the frame
        frame.add(fahrenheitLabel);
        frame.add(fahrenheitField);
        frame.add(celsiusLabel);
        frame.add(celsiusField);
        frame.add(new JLabel()); // Empty space for alignment
        frame.add(convertButton);

        // Make the frame visible
        frame.setVisible(true);
    }
}
