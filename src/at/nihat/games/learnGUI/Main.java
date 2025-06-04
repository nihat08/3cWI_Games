package at.nihat.games.learnGUI;

import javax.swing.*;
import java.awt.*;

public class Main {
    private static int count=0;
    public static void main(String[] args) {
        JFrame fenster = new JFrame("Zähler");
        fenster.setVisible(true);
        fenster.setSize(300,150);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Klick mich");
        JLabel label = new JLabel("Anzahl: 0");

        button.addActionListener(e -> {
            count++;
            label.setText("Anzahl: "+ count);
        });
        JPanel panel = new JPanel();

        panel.setLayout(new BorderLayout());
        panel.add(button, BorderLayout.SOUTH);
        panel.add(label, BorderLayout.NORTH);
        panel.setBackground(Color.ORANGE);

        /*panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(button);
        panel.add(label);
        panel.setBackground(Color.ORANGE);*/

        /*panel.setLayout(new GridLayout(8,8));
        panel.add(button);
        panel.add(label);
        panel.setBackground(Color.ORANGE);*/

        fenster.add(panel);
    }
}
