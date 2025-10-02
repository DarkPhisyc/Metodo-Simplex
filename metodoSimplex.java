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
        sc.close();
    }

    public static void maximizar(Scanner sc) {
        System.out.println("Teclea el numero de variables (n): ");
        int variables = sc.nextInt();

        System.out.println("Teclea el numero de restricciones (m): ");
        int restricciones = sc.nextInt();

        double[] coeficientes = new double[variables];
        System.out.println("Teclea los coeficientes de la funcion objetivo: ");
        for(int i = 0; i < variables; i++) {
            System.out.print("Coeficiente [ " + (i + 1) + " ]: ");
            coeficientes[i] = sc.nextDouble();
         }

        double[][] coef = new double[restricciones][variables];
        System.out.println("Teclea los coeficientes de las restricciones: ");
        for(int i = 0; i < restricciones; i++) {
            System.out.println("Restriccion [ " + (i + 1) + " ]: ");
            for(int j = 0; j < variables; j++) {
                System.out.print("Coeficiente " + (j + 1) + ": ");
                coef[i][j] = sc.nextDouble();
            }
         }
            
        double[] b = new double[restricciones];
        for(int i = 0; i < restricciones; i++) {
            System.out.print("b [ " + (i + 1) + " ]: ");
            b[i] = sc.nextDouble();
        }
    }   
}