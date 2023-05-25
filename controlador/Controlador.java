package controlador;

import javax.swing.JOptionPane;

public class Controlador {
  

    public static void main(String[] args) {
       
        String Confirmacion = "si";

        while(Confirmacion = "si"){
        //Entradad de datos 
        String Nombre = JOptionPane.showInputDialog("Ingrese el nombre del libro: ");
        String Autor = JOptionPane.showInputDialog("Ingrese el nombre del Autor del libro: ");
        String Año = JOptionPane.showInputDialog("Ingrese el año de ingreso del libro: ");
        String Ediccion = JOptionPane.showInputDialog("El libro es de una ediccion de lujo; ingrese si o no: ");



        String Confirmacion = JOptionPane.showInputDialog("Desea agregar otro libro: ");

    }
}
