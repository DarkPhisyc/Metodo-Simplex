import java.util.Scanner;

public class metodoSimplex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Resolver problemas por metodo simplex (maximizar o minimizar)");
        int opcion;

        do {
            System.out.println("\n \t \t \tMenu:");
            System.out.println("\n1. Maximizar");
            System.out.println("2. Minimizar");
            System.out.println("3. Salir del programa");
            System.out.print("\nTeclea la opcion del metodo que deseas realizar: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
                    break;
            }
        } while(opcion != 3);
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

    public static void minimizar(Scanner sc) {
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

        double[] Max = new double[variables];
        for (int i = 0; i < variables; i++) {
            Max[i] = -coeficientes[i];
        }
    }

    public static void simplex(double[][] coef, double[] b, double[] Max, boolean Min, Scanner sc) {
        int restricciones = coef.length;
        int variables = coef[0].length;

        if(restricciones == 0 || variables == 0) {
            System.out.println("No hay restricciones o variables.");
            return;
        }

        boolean factible = true;
        for(int i = 0; i < restricciones; i++) {
            if(b[i] < 0) {
                factible = false;
                break;
            }
        }

        if(!factible) {
            System.out.println("No hay solucion factible.");
            return;
        }

        int columnas = variables + restricciones + 1;
        int filas = restricciones + 1;
        double[][] tab = new double[filas][columnas];
        int[] variablesBasicas = new int[restricciones];

        for (int i = 0; i < restricciones; i++) {
            for (int j = 0; j < variables; j++) {
                tab[i][j] = coef[i][j];
            }
            tab[i][variables + i] = 1.0;
            tab[i][columnas - 1] = b[i];
            variablesBasicas[i] = variables + i;
        }

    }   
}