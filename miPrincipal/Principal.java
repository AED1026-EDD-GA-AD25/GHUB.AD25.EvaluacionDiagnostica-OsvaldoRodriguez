package miPrincipal;
import java.util.Scanner;

public class Principal {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opc =0;
        String autor,titulo = null;
        int anio = 0;
        InventarioLibros inventarioLibros = new InventarioLibros();
        do {
            menu();
            opc = sc.nextInt();
            sc.nextLine();//consume el entero
            switch (opc) {
                case 0:
                System.out.println("Chao");
                break;
                case 1:
                System.out.println("Proporcion nombre de autor: ");
                autor=sc.nextLine();
                System.out.println("Proporciona titulo del libro: ");
                titulo=sc.nextLine();
                System.out.println("Proporciona año de publicacion: ");
                anio=sc.nextInt();
                break;
                case 2:
                System.out.println("Proporcion autor del libro: ");
                autor=sc.nextLine();
                Libro libro = new Libro(titulo, autor, anio);
                inventarioLibros.agregar(libro);
                break;
                case 3:
                inventarioLibros.mostrar(); 
                break;   
                default:
                    break;
            }
        } while (opc !=0);


    }
    public static void menu(){
        System.out.println("Menu Principal");
        System.out.println("1. Agregar");
        System.out.println("2. Buscar");
        System.out.println("3. Mostrar todo");
        System.out.println();
        System.out.println("0. Salir");
        System.out.println("Selecciona opcion: ");

    }
}