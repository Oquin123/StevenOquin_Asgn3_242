import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIConverter extends JFrame {
    private JButton distButton;
    private JButton tempButton;
    private JButton exitButton;

    public GUIConverter() {
        super("Converter");
        setLayout(new FlowLayout());
        distButton = new JButton("Distance Converter");
        add(distButton);
        tempButton = new JButton("Temperature Converter");
        add(tempButton);
        exitButton = new JButton("Exit");
        add(exitButton);

        ButtonHandler handler = new ButtonHandler();
        tempButton.addActionListener(handler);
        distButton.addActionListener(handler);
        exitButton.addActionListener(handler);
    }

    private class ButtonHandler implements ActionListener {
        private Converter converter;

        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == distButton) {
                String input = JOptionPane.showInputDialog(null, "Input miles distance to convert");
                double miles = Double.parseDouble(input);
                converter = new DistanceConverter(miles);
                JOptionPane.showMessageDialog(null, miles + " Miles equals " + converter.convert() + " Kilometers");
            } else if (event.getSource() == tempButton) {
                String input = JOptionPane.showInputDialog(null, "Input fahrenheit temperature to convert");
                double fahrenheit = Double.parseDouble(input);
                converter = new TemperatureConverter(fahrenheit);
                JOptionPane.showMessageDialog(null, fahrenheit + " F equals " + converter.convert() + " C");
            } else if (event.getSource() == exitButton) {
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        GUIConverter guiConverter = new GUIConverter();
        guiConverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiConverter.setLocationRelativeTo(null);
        guiConverter.setSize(300, 100 );
        guiConverter.setVisible(true);
    }
}