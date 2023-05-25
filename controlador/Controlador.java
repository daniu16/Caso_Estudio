package controlador;

import javax.swing.JOptionPane;
import modelo.Nom;
import modelo.Añ;
import modelo.Aut;
import modelo.Col;
import modelo.Edicc;
import modelo.Edicclib;
import modelo.LibCol;

public class Controlador {

    public static void main(String[] args) {

        String confirmacion = "si";

        while(confirmacion.equals("si")) {
            // Entrada de datos
            String Nombre = JOptionPane.showInputDialog("Ingrese el nombre del libro: ");
            String Autor = JOptionPane.showInputDialog("Ingrese el nombre del autor del libro: ");
            String Año = JOptionPane.showInputDialog("Ingrese el año de ingreso del libro: ");
            String Edicion = JOptionPane.showInputDialog("El libro es de una edición de lujo; (si / no): ");
            if(Edicion.equals("si")){
                String Ediciondellibro = JOptionPane.showInputDialog("¿Cual es la ediccion del libro?: ");
            }else{
            String Ediciondellibro = JOptionPane.showInputDialog(null);
            }
            String Coleccion = JOptionPane.showInputDialog("El libro tiene una coleccion; (si / no): ");
            if(Coleccion.equals("si")){
                String Colecciondellibro = JOptionPane.showInputDialog("¿Cual es el numero de collecion del libro?: ");
            }else{
            String EColecciondellibro = JOptionPane.showInputDialog(null);
            }

            Nom miNombre = new Nom(Nombre);
            miNombre.getResultadosNombre();
            JOptionPane.showMessageDialog(null, "El nombre del libro es: " + miNombre.getResultadosNombre());

            Aut miAutor = new Aut(Autor);
            miAutor.getResultadosAutor();
            JOptionPane.showMessageDialog(null,"El autor o autores del libro es:" + miAutor.getResultadosAutor());

            
            // Lógica para procesar los datos del libro 
            confirmacion = JOptionPane.showInputDialog("Desea agregar otro libro (si/no): ");
        }
    }
}
