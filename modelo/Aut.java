package modelo;

public class Aut extends Operaciones {

    public Aut(String autor) {
        super("", autor, "", false, "", 0.0);
    }

    public String getAutor() {
        return Nombre;
    }

    public String getResultados() {
        return getNombre();
    }
    
}
/*
 * package modelo;

public class Nom extends Operaciones {
    public Nom(String nombre) {
        super(nombre, "", "", false, "", 0.0);
    }

    public String getNombre() {
        return Nombre;
    }

    public String getResultados() {
        return getNombre();
    }
}
 */