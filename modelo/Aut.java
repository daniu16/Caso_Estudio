package modelo;

public class Aut extends Operaciones {

    public Aut(String autor) {
        super("", autor, "", "","", "","");
    }

    public String getAutor() {
        return Autor;
    }

    public String getResultadosAutor() {
        return getAutor();
    }
    
}
