package at.nihat.games.learnGUI;

import javax.swing.*;
import java.awt.*;

public class Main2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main2().createAndShowGUI());
    }
    private void createAndShowGUI(){
        JFrame frame = new JFrame("Benutzerformular");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,500);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

        JTextField name = new JTextField();
        panel.add(new JLabel("Name"));
        panel.add(name);

        JButton abschicken = new JButton("Abschicken");

        JTextArea ergebnisse = new JTextArea();
        abschicken.addActionListener(e ->{
                ergebnisse.setText("Ergebnis:\n\n");
                ergebnisse.append(name.getText());});

        frame.add(panel, BorderLayout.NORTH);
        frame.add(ergebnisse, BorderLayout.SOUTH);
        frame.add(abschicken, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
