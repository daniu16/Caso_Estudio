package modelo;

public class LibCol extends Operaciones{
    public LibCol(String colecciondellibro) {
        super("", "", "", "","", "",colecciondellibro);
    }

    public String getColecciondellibro() {
        return Colecciondellibro;
    }

    public String getResultados() {
        return getColecciondellibro();
    }
}
