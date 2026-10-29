import javax.swing.*;

public class Cabusas_JLabelandJTextField {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");

        JLabel label1 = new JLabel("First Number:");
        label1.setBounds(30, 50, 100, 25);

        JTextField textField1 = new JTextField();
        textField1.setBounds(140, 50, 120, 25);

        JLabel label2 = new JLabel("Second Number:");
        label2.setBounds(30, 100, 100, 25);

        JTextField textField2 = new JTextField();
        textField2.setBounds(140, 100, 120, 25);

        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);

        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}