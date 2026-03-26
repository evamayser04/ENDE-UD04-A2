package figuras;

import java.awt.Color;

/**
 * Clase que representa un cuadrado.
 * Un cuadrado es un tipo de rectángulo cuyos lados son iguales.
 * Hereda de la clase Rectangulo.
 * 
 * @author Eva Katherine 
 * @version 1.0
 */
public class Cuadrado extends Rectangulo {

    /**
     * Constructor de la clase Cuadrado.
     * 
     * @param x Coordenada X de la posición del cuadrado
     * @param y Coordenada Y de la posición del cuadrado
     * @param color Color del cuadrado
     * @param lado Longitud del lado del cuadrado
     */
    public Cuadrado(double x, double y, Color color, double lado) {
        super(x, y, color, lado, lado);
    }
}