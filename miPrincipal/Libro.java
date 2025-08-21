package miPrincipal;
public class Libro{
    /*Atributos  */
    private String titulo;
    private String autor;
    private int anio;
    /*Constructores */
    public Libro(){
        this.autor = "No definido";
        this.titulo = "No definido";

    }
    
    
    public Libro(String titulo, String autor, int anio){
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    /*gettes y setteres */
    public String gettitulo(){
        return titulo;
    }
    public void settitulo(String titulo){
        this.titulo = titulo;
    }
    public String getautor(){
        return autor;
    }
    public void setautor(String autor){
        this.autor = autor;
    }
    public int getanio(){
        return anio;
    }
    public void setanio(int anio){
        this.anio = anio;
    }


}