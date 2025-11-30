import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class EnigmaFrame extends JFrame {
    private JComboBox<String> inner;
    private JComboBox<String> middle;
    private JComboBox<String> out;
    private JTextField initialPosition;
    private final String[] units = {
    "1", "2", "3", "4"
    };
    public EnigmaFrame() {

    // Setting up the logic
    setTitle("Enigma GUI");
    setSize(600, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    inner = new JComboBox<String>(units);
    middle = new JComboBox<String>(units);
    out = new JComboBox<String>(units);
    initialPosition = new JTextField("1.0", 4);
    JButton encrypt = new JButton("Encrypt");
    JButton decrypt = new JButton("Decrypt");
    JLabel input = new JLabel("Input");
    JTextField inputField = new JTextField();
    JLabel output = new JLabel("Output");
    JTextField outputField = new JTextField();
    outputField.setEditable(false);
    // Setting up the window
    add(inner, BorderLayout.AFTER_LAST_LINE);
    add(middle, BorderLayout.AFTER_LAST_LINE);
    add(out, BorderLayout.AFTER_LAST_LINE);
    add(initialPosition, BorderLayout.AFTER_LAST_LINE);
    add(encrypt, BorderLayout.AFTER_LAST_LINE);
    add(decrypt, BorderLayout.AFTER_LAST_LINE);
    add(input, BorderLayout.SOUTH);
    add(inputField);
    add(output, BorderLayout.SOUTH);
    add(outputField);

    }

}
