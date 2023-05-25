package modelo;

public class LibCol extends Operaciones{
    public LibCol(String colecciondellibro) {
        super("", "", "", "","", "",colecciondellibro);
    }

    public String getColecciondellibro() {
        return Colecciondellibro;
    }

    public String getResultadosColecciondellibro() {
        return getColecciondellibro();
    }
}
