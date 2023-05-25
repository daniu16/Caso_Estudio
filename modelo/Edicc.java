package modelo;

public class Edicc extends Operaciones{

    public Edicc(String ediccion){
        super("", "", "", ediccion,"", "");
    }

    public String getEdiccion()
    {
        return Ediccion;
    }

    public String getResultado(){
        return getEdiccion();
    }
}