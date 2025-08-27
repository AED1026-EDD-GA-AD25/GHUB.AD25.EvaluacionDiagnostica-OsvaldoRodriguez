package miPrincipal;
public class InventarioLibros{
    Libro listaLibro[];//creando arreglo de libro
    int contador;
    /*Constructores*/
    public InventarioLibros(){
        listaLibro = new Libro[2];
        contador = 0;
    }
    /*Metodos */
    /* agrega libros a la lista */
    public void agregar(Libro libro){
        if(contador<listaLibro.length){
        listaLibro[contador] = libro;
        contador++;    
        }else{
            Libro listaTemp[] = new Libro[listaLibro.length*2];
            for(int i=0;i<listaLibro.length;i++){
                listaTemp[i]=listaLibro[i];
            }
            listaLibro = listaTemp;
            listaLibro[contador] = libro;
            contador++;
        }
        
    }
    /*busca en la lista un libro por autor, si no retorna null  */
    public Libro[] buscar(String autor){
        Libro[] libroBuscado = new Libro[listaLibro.length];
        int contEncontrados = 0;
        for(int i=0;i<contador;i++){
            if(listaLibro[i].getautor().equalsIgnoreCase(autor)){
                libroBuscado[contEncontrados++]=listaLibro[i];


            }
        }
        /*si llega a este lugar, es porque el libro deseado con el autor no existe  */
        return libroBuscado;

    }
    /*muestra por pantalla toda la lista de libros */
    public void mostrar(){
        for(int i=0;i<contador;i++){
            System.out.println(listaLibro[i]);

        }

    }

    
    

    
}