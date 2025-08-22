package miPrincipal;
public class DemostrarArreglos{
    public static void main(String[] args) {
        System.out.println("Uso de Arreglos ");
        int numero1[];
        numero1 = new int[3];
        short numero2[];
        numero2 = new short[5];
        double numero3[] = new double[10];

        long numero4[] = new long[3];
        Libro arregloLibros[]/*= new Libro[5]; */;
        arregloLibros = new Libro[5];

        numero1[2]=10;
        System.out.println("Arreglo de entero");
        for(int i=0;i<3;i++){
            System.out.println(numero1[i]);

        }
        System.out.println("Arreglo de short");
        for(int i=0;i<numero2.length;i++){
            System.out.println(numero2[i]);

        }
        System.out.println("Arreglo de Libros");
        arregloLibros[0]= new Libro("El invencible verano", "Marta", 2003);
        arregloLibros[1]= new Libro();
        arregloLibros[2]= new Libro();
        arregloLibros[3]= new Libro();
        arregloLibros[4]= new Libro();
        for(int i=0;i<arregloLibros.length;i++){
            System.out.println(arregloLibros[i]);
           /// System.out.println(arregloLibros[i].gettitulo());

        }
    }

    

    
}