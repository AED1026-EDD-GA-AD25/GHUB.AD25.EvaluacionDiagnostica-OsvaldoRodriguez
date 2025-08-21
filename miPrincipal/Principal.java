package miPrincipal;

public class Principal {
    public String getGreeting() {
        return "Hola m!";
    }

    public static void main(String[] args) {
        System.out.println(new Principal().getGreeting());


    }
}