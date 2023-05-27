package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Graphics;

public class PanelDatos extends JPanel{

    private JLabel lbNombre;
    private JTextField tfNombre;
    private JLabel lbAutor;
    private JTextField tfAutor;
    private JLabel lbAño;
    private JTextField tfAño;
    private JLabel lbEdiccion;
    private JTextField tfEdiccion;
    private JLabel lbColeccion;
    private JTextField tfColeccion;


    double valorImpuesto;

    public PanelDatos()
    {
        setLayout(null);
        setBackground(Color.GRAY);

        //Crear y agregar elementos nombre
        lbNombre = new JLabel("Nombre del libro: ");
        lbNombre.setBounds(30,30,140,20);
        this.add(lbNombre);

        tfNombre= new JTextField();
        tfNombre.setBounds(170,30,100, 25);
        this.add(tfNombre);

        //Crear y agregar elementos autor
        lbAutor = new JLabel("Autor del libro: ");
        lbAutor.setBounds(30,60,140,20);
        this.add(lbAutor);

        tfAutor = new JTextField();
        tfAutor.setBounds(170,60,100, 25);
        this.add(tfAutor);

        //Crear y agregar elementos año
        lbAño = new JLabel("Año de edicion: ");
        lbAño.setBounds(30,90,140,20);
        this.add(lbAño);

        tfAño = new JTextField();
        tfAño.setBounds(170,90,100, 25);
        this.add(tfAño);

        //Crear y agregar elementos ediccion
        lbEdiccion = new JLabel("Ediccion de lujo: ");
        lbEdiccion.setBounds(30,120,180,20);
        this.add(lbEdiccion);

        tfEdiccion = new JTextField();
        tfEdiccion.setBounds(170,120,100, 25);
        this.add(tfEdiccion);

        //Crear y agregar elementos coleccion
        lbColeccion = new JLabel("Numero coleccion: ");
        lbColeccion.setBounds(30,150,180,20);
        this.add(lbColeccion);

        tfColeccion = new JTextField();
        tfColeccion.setBounds(170,150,100, 25);
        this.add(tfColeccion);

        TitledBorder borde = BorderFactory.createTitledBorder("Ingresar");
        borde.setTitleColor(Color.BLACK);
        setBorder(borde);
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
    //Metodos de acceso

    public String getfNombre(){
        return tfNombre.getText();
    }
    public String getTfAutor() {
        return tfAutor.getText();
    }
    public String getTfAño() {
        return tfAño.getText();
    }
    public String getTfEdiccion(){
        return tfEdiccion.getText();
    }
    

    
}
