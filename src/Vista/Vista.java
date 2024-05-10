package Vista;
import Controlador.Controlador;

import javax.swing.*;
import java.awt.*;

public class Vista {
    private JFrame frame;
    private JLabel label;
    private JButton btnCuentaInfinita;
    private JButton btnCuentaAtras;
    private Controlador controlador;

    public Vista(Controlador controlador) {
        this.controlador = controlador;
        frame = new JFrame("Vista");
        label = new JLabel("0", SwingConstants.CENTER);
        btnCuentaInfinita = new JButton("Cuenta Infinita");
        btnCuentaAtras = new JButton("Cuenta Atrás");

        btnCuentaInfinita.addActionListener(e -> {
            try {
                this.controlador.startCuentaInfinita();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        btnCuentaAtras.addActionListener(e -> {
            try {
                this.controlador.startCuentaAtras();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.getContentPane().add(btnCuentaInfinita, BorderLayout.NORTH);
        frame.getContentPane().add(btnCuentaAtras, BorderLayout.SOUTH);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }

    public Vista() {
    }


    public void mostrar(int count) {
        label.setText(String.valueOf(count));
    }

    public void update(String mensaje) {
        label.setText(mensaje);
    }

    public void actualizarTexto(String mensaje) {
        label.setText(mensaje + "\n");
    }

    public String getLastShownNumber() {
        return label.getText();
    }

    public String getLastUpdatedMessage() {
        return label.getText();
    }
}
