import javax.swing.*;
import javax.swing.border.Border;
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
    setSize(600, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    inner = new JComboBox<String>(units);
    middle = new JComboBox<String>(units);
    out = new JComboBox<String>(units);
    initialPosition = new JTextField("abc", 4);
    JButton encrypt = new JButton("Encrypt");
    JButton decrypt = new JButton("Decrypt");
    JLabel input = new JLabel("Input");
    JTextField inputField = new JTextField(30);
    inputField.setSize(100, 100);
    JLabel output = new JLabel("Output");
    JTextField outputField = new JTextField(30);
    outputField.setSize(100, 100);
    outputField.setEditable(false);

    // Setting up the window
    JPanel top = new JPanel();
    top.add(inner);
    top.add(middle);
    top.add(out);
    top.add(initialPosition);
    top.add(encrypt);
    top.add(decrypt);
    JPanel center = new JPanel();
    center.add(input);
    center.add(inputField);
    JPanel bottom = new JPanel();
    bottom.add(output);
    bottom.add(outputField);
    add(top, BorderLayout.NORTH);
    add(center, BorderLayout.CENTER);
    add(bottom, BorderLayout.SOUTH);
    }

}
