import java.util.Scanner;

public class metodoSimplex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Resolver por metodo simplex (maximizar o minimizar)");
        int opcion;

        do {
            System.out.println("\nMenu...:");
            System.out.println("1. Maximizar");
            System.out.println("2. Minimizar");
            System.out.println("3. Salir");
            System.out.print("Teclea la opcion del metodo que deseas realizar: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
                    break;
            }
        } while(opcion != 3);
    }
}