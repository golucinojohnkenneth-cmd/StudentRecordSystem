import javax.swing.*;
import java.awt.event.*;

public class CalculatorGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");

        JLabel label1 = new JLabel("First Number:");
        label1.setBounds(30, 50, 100, 25);

        JTextField textField1 = new JTextField();
        textField1.setBounds(140, 50, 120, 25);

        JLabel label2 = new JLabel("Second Number:");
        label2.setBounds(30, 100, 110, 25);

        JTextField textField2 = new JTextField();
        textField2.setBounds(140, 100, 120, 25);

        JButton addButton = new JButton("+");
        addButton.setBounds(30, 150, 50, 30);

        JButton subtractButton = new JButton("-");
        subtractButton.setBounds(90, 150, 50, 30);

        JButton multiplyButton = new JButton("*");
        multiplyButton.setBounds(150, 150, 50, 30);

        JButton divideButton = new JButton("/");
        divideButton.setBounds(210, 150, 50, 30);

        JLabel resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(30, 210, 250, 25);

        // Addition
        addButton.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                resultLabel.setText("Result: " + (num1 + num2));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Please enter valid numbers.");
            }
        });

        // Subtraction
        subtractButton.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                resultLabel.setText("Result: " + (num1 - num2));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Please enter valid numbers.");
            }
        });

        // Multiplication
        multiplyButton.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());
                resultLabel.setText("Result: " + (num1 * num2));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Please enter valid numbers.");
            }
        });

        // Division
        divideButton.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(textField1.getText());
                double num2 = Double.parseDouble(textField2.getText());

                if (num2 == 0) {
                    resultLabel.setText("Cannot divide by zero.");
                } else {
                    resultLabel.setText("Result: " + (num1 / num2));
                }
            } catch (NumberFormatException ex) {
                resultLabel.setText("Please enter valid numbers.");
            }
        });

        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(addButton);
        frame.add(subtractButton);
        frame.add(multiplyButton);
        frame.add(divideButton);
        frame.add(resultLabel);

        frame.setSize(300, 320);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}