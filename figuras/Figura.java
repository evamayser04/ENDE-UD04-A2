package figuras;

import java.awt.Color;

/**
 * Clase abstracta que representa una figura geométrica.
 * Contiene atributos comunes como el centro y el color,
 * y define métodos abstractos para calcular el área y el perímetro.
 * 
 * Las clases hijas (como Triangulo, Rectangulo o Cuadrado)
 * deben implementar los métodos abstractos.
 * 
 * @author Eva Katherine
 * @version 1.0
 */
public abstract class Figura {

    /** Punto que representa el centro de la figura */
    private Punto centro;

    /** Color de la figura */
    private Color color;

    /**
     * Constructor de la clase Figura.
     * 
     * @param x Coordenada X del centro
     * @param y Coordenada Y del centro
     * @param color Color de la figura
     */
    public Figura(double x, double y, Color color) {
        centro = new Punto(x, y);
        this.color = color;
    }

    /**
     * Obtiene la coordenada X del centro.
     * 
     * @return coordenada X
     */
    public double getXCentro() {
        return centro.getX();
    }

    /**
     * Obtiene la coordenada Y del centro.
     * 
     * @return coordenada Y
     */
    public double getYCentro() {
        return centro.getY();
    }

    /**
     * Obtiene el color de la figura.
     * 
     * @return color de la figura
     */
    public Color getColor() {
        return color;
    }

    /**
     * Modifica la coordenada X del centro.
     * 
     * @param x nueva coordenada X
     */
    public void setXCentro(double x) {
        centro.setX(x);
    }

    /**
     * Modifica la coordenada Y del centro.
     * 
     * @param y nueva coordenada Y
     */
    public void setYCentro(double y) {
        centro.setY(y);
    }

    /**
     * Modifica el color de la figura.
     * 
     * @param color nuevo color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Calcula el perímetro de la figura.
     * Este método debe ser implementado por las clases hijas.
     * 
     * @return perímetro de la figura
     */
    public abstract double perimetro();

    /**
     * Calcula el área de la figura.
     * Este método debe ser implementado por las clases hijas.
     * 
     * @return área de la figura
     */
    public abstract double area();

    /**
     * Compara el área de esta figura con otra figura.
     * 
     * @param otraFigura figura con la que se compara
     * @return 1 si es mayor, -1 si es menor, 0 si son iguales
     */
    public int esMayorQue(Figura otraFigura) {
        int codigo;
        if (this.area() > otraFigura.area())
            codigo = 1;
        else if (this.area() < otraFigura.area())
            codigo = -1;
        else
            codigo = 0;
        return codigo;
    }
}