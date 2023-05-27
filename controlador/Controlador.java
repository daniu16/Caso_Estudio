package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Operaciones;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener {

    private VentanaPrincipal vP;
    private Operaciones miOperaciones;

    public Controlador(VentanaPrincipal vP, Operaciones pOperaciones) {
        this.vP = vP;
        this.miOperaciones = pOperaciones;
        this.vP.mCalcular.agregarEscuchadores(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String event = e.getActionCommand();

        if (event.equals("calcular")) {
            // Realizar acciones para el evento "calcular"
        }
        
        if (event.equals("salir")) {
            System.exit(0);
        }

        if (event.equals("borrar")) {
            this.vP.mCalcular.borrar();
            
        }
    }
}


    /*
     * 
    public static void main(String[] args) {

        String confirmacion = "si";

        while (confirmacion.equals("si")) {
            // Entrada de datos
            String Nombre = JOptionPane.showInputDialog("Ingrese el nombre del libro: ");
            String Autor = JOptionPane.showInputDialog("Ingrese el nombre del autor del libro: ");
            String Año = JOptionPane.showInputDialog("Ingrese el año de ingreso del libro: ");
            String Edicion = JOptionPane.showInputDialog("El libro es de una edición de lujo (si / no): ");
            String Ediciondellibro;
            if (Edicion.equals("si")) {
                Ediciondellibro = JOptionPane.showInputDialog("El libro es de una edición de lujo: ");
            } else {
                Ediciondellibro = "El libro no es una edición de lujo";
            }
            String Coleccion = JOptionPane.showInputDialog("El libro tiene una colección (si / no): ");
            String Colecciondellibro;
            if (Coleccion.equals("si")) {
                Colecciondellibro = JOptionPane.showInputDialog("¿Cuál es el número de colección del libro?: ");
            } else {
                Colecciondellibro = "";
            }

            Nom miNombre = new Nom(Nombre);
            String resultadoNombre = miNombre.getResultadosNombre();
            JOptionPane.showMessageDialog(null, "El nombre del libro es: " + resultadoNombre);

            Aut miAutor = new Aut(Autor);
            String resultadoAutor = miAutor.getResultadosAutor();
            JOptionPane.showMessageDialog(null, "El autor o autores del libro son: " + resultadoAutor);

            Añ miAño = new Añ(Año);
            String resultadoAño = miAño.getResultadosAño();
            JOptionPane.showMessageDialog(null, "El año de edición del libro es: " + resultadoAño);

            Edicclib miEdicclib = new Edicclib(Ediciondellibro);
            String resultadoEdicion = miEdicclib.getResultadoEdicciondellibro();
            JOptionPane.showMessageDialog(null, "La edición del libro es: " + resultadoEdicion);

            LibCol miLibCol = new LibCol(Colecciondellibro);
            String resultadoColeccion = miLibCol.getResultadosColecciondellibro();
            JOptionPane.showMessageDialog(null, "La colección del libro es: " + resultadoColeccion);

            // Lógica para procesar los datos del libro 
            confirmacion = JOptionPane.showInputDialog("Desea agregar otro libro (si/no): ");
        }
    }
     */
