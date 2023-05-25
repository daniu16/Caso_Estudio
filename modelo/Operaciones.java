package modelo;

public class Operaciones
{

    //Atributos
    protected String Nombre;
    protected String Autor;
    protected String Año;
    protected String Ediccion;
    protected String Edicciondellibro;
    protected String Coleccion;
    protected String Colecciondellibro;
    //protected double resultado;

    //Contructor
    public Operaciones(String Nombre, String Autor, String Año, String Ediccion, String Edicciondellibro, String Coleccion, String Colecciondellibro)
    {
        this.Nombre = Nombre;
        this.Autor= Autor;
        this.Año= Año;
        this.Ediccion= Ediccion;
        this.Edicciondellibro = Edicciondellibro;
        this.Coleccion= Coleccion;
        this.Colecciondellibro= Colecciondellibro;
        //this.resultado= resultados;
    }
    //Metodos
    /*
     * public double mostrarResultados()
    {
        return this.resultado;
    }
     */
}

