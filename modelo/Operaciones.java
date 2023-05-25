package modelo;

public class Operaciones
{

    //Atributos
    protected String Nombre;
    protected String Autor;
    protected String Año;
    protected Boolean Ediccion;
    protected String Coleccion;
    protected double resultado;

    //Contructor
    public Operaciones(String Nombre, String Autor, String Año, boolean Ediccion, String Coleccion, Double resultados)
    {
        this.Nombre = Nombre;
        this.Autor= Autor;
        this.Año= Año;
        this.Ediccion= Ediccion;
        this.Coleccion= Coleccion;
        this.resultado= resultados;
    }
    //Metodos
    public double mostrarResultados()
    {
        return this.resultado;
    }
}

