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
    "1", "2", "3", "4", "5"
    };
    public EnigmaFrame() {

    // Setting up the logic
    setTitle("Enigma GUI");
    setSize(800, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    JLabel innertLabel = new JLabel("Inner");
    inner = new JComboBox<String>(units);
    JLabel middleLabel = new JLabel("Middle");
    middle = new JComboBox<String>(units);
    JLabel outLabel = new JLabel("Out");
    out = new JComboBox<String>(units);
    initialPosition = new JTextField("abc", 3);
    JButton encrypt = new JButton("Encrypt");
    JButton decrypt = new JButton("Decrypt");
    JLabel input = new JLabel("Input");
    JTextArea inputField = new JTextArea(4, 40);
    JLabel output = new JLabel("Output");
    JTextArea outputField = new JTextArea(4, 40);
    outputField.setEditable(false);

    // Putting in Enigma
    encrypt.addActionListener(e -> {;
    try {
        String inputText = inputField.getText();
        int innerRotor = Integer.parseInt(inner.getSelectedItem().toString());
        int middleRotor = Integer.parseInt(middle.getSelectedItem().toString());
        int outerRotor = Integer.parseInt(out.getSelectedItem().toString());
        String position = initialPosition.getText().toUpperCase();
        Enigma enigma = new Enigma(innerRotor, middleRotor, outerRotor, position);
        String result = enigma.encrypt(inputText.toUpperCase());
        outputField.setText(result);
    } catch(Exception ex) {
        System.out.println("There is an error with the input values");
    }
    });

    decrypt.addActionListener(e -> {;
        try {
            String inputText = inputField.getText();
            int innerRotor = Integer.parseInt(inner.getSelectedItem().toString());
            int middleRotor = Integer.parseInt(middle.getSelectedItem().toString());
            int outerRotor = Integer.parseInt(out.getSelectedItem().toString());
            String position = initialPosition.getText().toUpperCase();
            Enigma enigma = new Enigma(innerRotor, middleRotor, outerRotor, position);
            String result = enigma.decrypt(inputText.toUpperCase());
            outputField.setText(result);
        } catch(Exception ex) {
            System.out.println("There is an error with the input values");
        }
        });

    // Setting up the window
    JPanel top = new JPanel();
    top.add(innertLabel);
    top.add(inner);
    top.add(middleLabel);
    top.add(middle);
    top.add(outLabel);
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
