package vista;

import javax.swing.JFrame;
import java.awt.Color;

public class VentanaPrincipal extends JFrame {
    
    public PanelDatos mPrincipal;
    public PanelOperaciones mCalcular;
    public PanelResultados mIngresas;

    public VentanaPrincipal() {
        setLayout(null);
        setBackground(Color.BLACK);

        mPrincipal = new PanelDatos();
        mPrincipal.setBounds(630, 10, 345, 245);
        add(mPrincipal);

        mIngresas = new PanelResultados();
        mIngresas.setBounds(10, 10, 310, 245);
        add(mIngresas);

        mCalcular = new PanelOperaciones();
        mCalcular.setBounds(331, 10, 290, 245);
        add(mCalcular);

        // Características de la ventana
        setTitle("Biblioteca");
        setSize(1000, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

   
}
