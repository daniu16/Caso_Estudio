package vista;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.Graphics;

public class PanelOperaciones extends JPanel {

    private JButton btCalcular;
    private JButton btBorrar;
    private JButton btSalir;

    public PanelOperaciones() {
        setLayout(null);
        setBackground(Color.GRAY);

        // Creación y adición del botón calcular
        btCalcular = new JButton("calcular");
        btCalcular.setBounds(90, 45, 120, 25);
        btCalcular.setActionCommand("calcular");
        this.add(btCalcular);

        btBorrar = new JButton("borrar");
        btBorrar.setBounds(90, 90, 120, 25);
        btBorrar.setActionCommand("borrar");
        this.add(btBorrar);

        btSalir = new JButton("salir");
        btSalir.setBounds(90, 135, 120, 25);
        btSalir.setActionCommand("salir");
        this.add(btSalir);

        TitledBorder borde = BorderFactory.createTitledBorder("Calcular");
        borde.setTitleColor(Color.BLACK);
        setBorder(borde);
    }

    // Pintar panel
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.decode("#059b9a")); // Color de la línea diagonal

        for (int i = 0; i <= 780; i = i + 1) {
            // Dibuja muchas líneas diagonales por la mitad del panel
            g.drawLine(i, getHeight(), getWidth(), getHeight() / 130);
            g.drawLine(i + 1, getHeight(), getWidth(), getHeight() / 130);
            i = i + 1;
        }
    }

    public void agregarEscuchadores(ActionListener listener) {
        btCalcular.addActionListener(listener);
        btBorrar.addActionListener(listener);
        btSalir.addActionListener(listener);
    }

}
