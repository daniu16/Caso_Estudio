package vista;

import java.util.PrimitiveIterator.OfDouble;
import ejecutable.Test;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.BorderFactory;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Graphics;


public class PanelResultados extends JPanel{

    private JTextArea taResultados;
    private JScrollPane spResultados;
    
    public PanelResultados(){
        
        setLayout(null);
        setBackground(Color.GRAY);

        taResultados = new JTextArea();
        spResultados = new JScrollPane(taResultados);
        spResultados.setBounds(10, 15, 285, 220);
        this.add(spResultados);

        //taResultados.setText(Test.carro);

        TitledBorder borde = BorderFactory.createTitledBorder("Entrada");
        borde.setTitleColor(Color.BLACK);
        setBorder(borde);

    }

    public void resultado(String msg){
        taResultados.append(msg);
    }

    public void borrar(){
        taResultados.setText("");
    }
   


 // pintar panel
 public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.decode("#059b9a")); // color de la línea diagonal

    for (int i = 0; i <= 780; i = i + 1) {

        // dibuja muchas línea diagonal por la mitad del panel
        g.drawLine(i, getHeight(), getWidth(), getHeight() / 130);
        g.drawLine(i + 1, getHeight(), getWidth(), getHeight() / 130);
        i = i + 1;
    }

}
}
