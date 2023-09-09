package TragaMonedas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CasinoFrame extends JFrame {
    private JTextField montoApuestaField;
    private JButton jugarButton;

    public CasinoFrame() {
        
        setTitle("Casino");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel montoLabel = new JLabel("Monto de la apuesta:");
        montoApuestaField = new JTextField(10); // Tamaño modificable
        jugarButton = new JButton("Jugar");

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(montoLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(montoApuestaField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(jugarButton, gbc);

        jugarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String montoApuestaText = montoApuestaField.getText();
                try {
                    double montoApuesta = Double.parseDouble(montoApuestaText);
                    // Aquí puedes agregar la lógica para el juego o realizar acciones con el monto de la apuesta
                    JOptionPane.showMessageDialog(null, "Has apostado: $" + montoApuesta);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un monto válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                CasinoFrame frame = new CasinoFrame();
                frame.setVisible(true);
            }
        });
    }
}