package figuras;

import java.awt.Color;
import java.util.Scanner;

/**
 * Clase de prueba para trabajar con distintas figuras geométricas.
 * Permite al usuario seleccionar una figura (triángulo, rectángulo o cuadrado),
 * introducir sus datos y calcular su área y perímetro.
 * 
 * @author Eva Katherine
 * @version 1.0
 */
public class PruebaFigura {

    /** Mensaje para mostrar el área */
    private static final String EL_ÁREA_ES = "El área es ";

    /** Mensaje para mostrar el perímetro */
    private static final String EL_PERÍMETRO_ES = "El perímetro es ";

    /** Opción elegida por el usuario */
    private static int opcion;

    /**
     * Método principal del programa.
     * Controla el flujo de ejecución y la interacción con el usuario.
     * 
     * @param args Argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        do {
            opcion = mostrarMenu();
            if (opcion != 4) {
                System.out.print("Introduzca la coordenada x del centro: ");
                double x = teclado.nextDouble();
                System.out.print("Introduzca la coordenada y del centro: ");
                double y = teclado.nextDouble();
                switch (opcion) {
                    case 1:
                        getT(teclado, x, y);
                        break;
                    case 2:
                        getR(teclado, x, y);
                        break;
                    case 3:
                        getC(teclado, x, y);
                        break;
                }
            }
        } while (opcion != 4);
        teclado.close();
    }

    /**
     * Crea un cuadrado con los datos introducidos por el usuario
     * y muestra su área y perímetro.
     * 
     * @param teclado Scanner para leer datos
     * @param x Coordenada X
     * @param y Coordenada Y
     */
    private static void getC(Scanner teclado, double x, double y) {
        System.out.print("Introduzca el lado del cuadrado: ");
        double lado = teclado.nextDouble();
        Cuadrado c = new Cuadrado(x, y, Color.red, lado);
        System.out.println(EL_PERÍMETRO_ES + c.perimetro());
        System.out.println(EL_ÁREA_ES + c.area());
    }

    /**
     * Crea un rectángulo con los datos introducidos por el usuario
     * y muestra su área y perímetro.
     * 
     * @param teclado Scanner para leer datos
     * @param x Coordenada X
     * @param y Coordenada Y
     */
    private static void getR(Scanner teclado, double x, double y) {
        System.out.print("Introduzca la base del rectángulo: ");
        double base = teclado.nextDouble();
        System.out.print("Introduzca la altura del rectángulo: ");
        double altura = teclado.nextDouble();
        Rectangulo r = new Rectangulo(x, y, Color.red, base, altura);
        System.out.println(EL_PERÍMETRO_ES + r.perimetro());
        System.out.println(EL_ÁREA_ES + r.area());
    }

    /**
     * Crea un triángulo con los datos introducidos por el usuario
     * y muestra su área y perímetro.
     * 
     * @param teclado Scanner para leer datos
     * @param x Coordenada X
     * @param y Coordenada Y
     */
    private static void getT(Scanner teclado, double x, double y) {
        System.out.print("Introduzca el lado 1 del triángulo: ");
        double lado1 = teclado.nextDouble();
        System.out.print("Introduzca el lado 2 del triángulo: ");
        double lado2 = teclado.nextDouble();
        System.out.print("Introduzca el lado 3 del triángulo: ");
        double lado3 = teclado.nextDouble();
        Triangulo t = new Triangulo(x, y, Color.red, lado1, lado2, lado3);
        System.out.println(EL_PERÍMETRO_ES + t.perimetro());
        System.out.println(EL_ÁREA_ES + t.area());
    }

    /**
     * Muestra el menú de opciones y valida la entrada del usuario.
     * 
     * @return opción elegida por el usuario (1-4)
     */
    public static int mostrarMenu() {
        int opción;
        System.out.println("1) Triángulo");
        System.out.println("2) Rectángulo");
        System.out.println("3) Cuadrado");
        System.out.println("4) Salir");
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Introduzca una opción (1-4): ");
            opción = teclado.nextInt();
            if (opción < 1 || opción > 4)
                System.out.println("Debe introducir un número entre 1 y 4");
        } while (opción < 1 || opción > 4);
        return opción;
    }
}