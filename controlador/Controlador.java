package controlador;

import javax.swing.JOptionPane;

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
            
            // Lógica para procesar los datos del libro (aquí puedes agregar la lógica deseada)
            confirmacion = JOptionPane.showInputDialog("Desea agregar otro libro (si/no): ");
        }
    }
}
