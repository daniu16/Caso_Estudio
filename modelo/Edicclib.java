package modelo;

public class Edicclib extends Operaciones{

    public Edicclib(String edicciondellibro)
    {
        super("", "", "", "", edicciondellibro, "","");
    }
    
    public String getEdicciondellibro()
    {
        return Edicciondellibro;
    }

    public String getResultadoEdicciondellibro()
    {
        return getEdicciondellibro();
    }
}
