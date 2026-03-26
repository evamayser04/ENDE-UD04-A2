package figuras;

import java.awt.Color;

/**
 * Clase que representa un rectángulo.
 * Hereda de la clase Figura e implementa el cálculo
 * del área y el perímetro.
 * 
 * @author Eva Katherine
 * @version 1.0
 */
public class Rectangulo extends Figura {

    /** Base del rectángulo */
    private double base;

    /** Altura del rectángulo */
    private double altura;

    /**
     * Constructor de la clase Rectangulo.
     * 
     * @param x Coordenada X del centro
     * @param y Coordenada Y del centro
     * @param color Color del rectángulo
     * @param base Base del rectángulo
     * @param altura Altura del rectángulo
     */
    public Rectangulo(double x, double y, Color color, double base, double altura) {
        super(x, y, color);
        this.base = base;
        this.altura = altura;
    }

    /**
     * Obtiene la base del rectángulo.
     * 
     * @return base del rectángulo
     */
    public double getBase() {
        return base;
    }

    /**
     * Obtiene la altura del rectángulo.
     * 
     * @return altura del rectángulo
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Modifica la base del rectángulo.
     * 
     * @param base nueva base
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Modifica la altura del rectángulo.
     * 
     * @param altura nueva altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Calcula el perímetro del rectángulo.
     * 
     * @return perímetro del rectángulo
     */
    @Override
    public double perimetro() {
        return 2 * base + 2 * altura;
    }

    /**
     * Calcula el área del rectángulo.
     * 
     * @return área del rectángulo
     */
    @Override
    public double area() {
        return base * altura;
    }
}