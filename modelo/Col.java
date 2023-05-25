package modelo;

public class Col extends Operaciones{
    public Col(String coleccion) {
        super("", "", "", "","", coleccion,"");
    }

    public String getColeccion() {
        return Coleccion;
    }

    public String getResultados() {
        return getColeccion();
    }
    
}
