package tag7;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Waerungsrechner {
    public static void main(String[] args) {
        openUI();
    }

    public static void openUI() {
        JFrame frame = new JFrame("Währungsrechner");
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setLocation(100, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel text = new JLabel("Gib Euro ein");
        text.setBounds(50, 50, 350, 30);
        frame.add(text);

        JTextField input = new JTextField();
        input.setBounds(50, 100, 200, 30);
        frame.add(input);

        JRadioButton dollarButton = new JRadioButton("Dollar");
        dollarButton.setBounds(250, 50, 100, 20);
        frame.add(dollarButton);

        JRadioButton yenButton = new JRadioButton("Yen");
        yenButton.setBounds(250, 80, 100, 20);
        frame.add(yenButton);

        JRadioButton pfundButton = new JRadioButton("Pfund");
        pfundButton.setBounds(250, 110, 100, 20);
        frame.add(pfundButton);

        JRadioButton frankenButton = new JRadioButton("Franken");
        frankenButton.setBounds(250, 140, 150, 20);
        frame.add(frankenButton);

        JRadioButton kronenButton = new JRadioButton("Kronen");
        kronenButton.setBounds(250, 170, 150, 20);
        frame.add(kronenButton);

        ButtonGroup group = new ButtonGroup();
        group.add(dollarButton);
        group.add(yenButton);
        group.add(pfundButton);
        group.add(frankenButton);
        group.add(kronenButton);

        JButton button = new JButton("Konvertieren!");
        button.setBounds(50, 150, 200, 30);
        frame.add(button);

        JLabel result = new JLabel("");
        result.setBounds(50, 200, 300, 30);
        frame.add(result);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                double euro = Double.parseDouble(input.getText());
                double end = 0;

                if (dollarButton.isSelected()) {
                    end = convertToDollar(euro);
                    result.setText("Dollar: " + end);
                } else if (yenButton.isSelected()) {
                    end = convertToYen(euro);
                    result.setText("Yen: " + end);
                } else if (pfundButton.isSelected()) {
                    end = convertToPfund(euro);
                    result.setText("Pfund: " + end);
                } else if (frankenButton.isSelected()) {
                    end = convertToFranken(euro);
                    result.setText("Schweizer Franken: " + end);
                } else if (kronenButton.isSelected()) {
                    end = convertToKronen(euro);
                    result.setText("Norwegische Kronen: " + end);
                } else {
                    result.setText("Bitte zuerst eine Währung wählen!");
                }
                } catch (Exception error) {
                    result.setText("Bitte gültige Zahl eingeben!");
                }
            }
        });
        frame.setVisible(true);
        JFrame.setDefaultLookAndFeelDecorated(true);   
    }

    public static double convertToDollar(double euro) {
       return euro * 1.16;
    }

    public static double convertToYen(double euro) {
       return euro * 182.36;
    }

    public static double convertToPfund(double euro) {
       return euro * 0.87;
    }

    public static double convertToFranken(double euro) {
       return euro * 0.94;
    }

    public static double convertToKronen(double euro) {
       return euro * 11.81;
    }
}
