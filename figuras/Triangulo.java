package figuras;

import java.awt.Color;

/**
 * Clase que representa un triángulo.
 * Hereda de la clase Figura e implementa el cálculo
 * del área y el perímetro mediante los lados del triángulo.
 * 
 * El área se calcula usando la fórmula de Herón.
 * 
 * @author Eva Katherine
 * @version 1.0
 */
public class Triangulo extends Figura {

    /** Lado 1 del triángulo */
    private double lado1;

    /** Lado 2 del triángulo */
    private double lado2;

    /** Lado 3 del triángulo */
    private double lado3;

    /**
     * Constructor de la clase Triangulo.
     * 
     * @param x Coordenada X del centro
     * @param y Coordenada Y del centro
     * @param color Color del triángulo
     * @param lado1 Primer lado
     * @param lado2 Segundo lado
     * @param lado3 Tercer lado
     */
    public Triangulo(double x, double y, Color color, double lado1, double lado2, double lado3) {
        super(x, y, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    /**
     * Obtiene el lado 1.
     * 
     * @return lado1
     */
    public double getLado1() {
        return lado1;
    }

    /**
     * Obtiene el lado 2.
     * 
     * @return lado2
     */
    public double getLado2() {
        return lado2;
    }

    /**
     * Obtiene el lado 3.
     * 
     * @return lado3
     */
    public double getLado3() {
        return lado3;
    }

    /**
     * Modifica el lado 1.
     * 
     * @param lado1 nuevo valor
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    /**
     * Modifica el lado 2.
     * 
     * @param lado2 nuevo valor
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    /**
     * Modifica el lado 3.
     * 
     * @param lado3 nuevo valor
     */
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    /**
     * Calcula el perímetro del triángulo.
     * 
     * @return suma de los tres lados
     */
    @Override
    public double perimetro() {
        return lado1 + lado2 + lado3;
    }

    /**
     * Calcula el área del triángulo usando la fórmula de Herón.
     * 
     * @return área del triángulo
     */
    @Override
    public double area() {
        double sp = perimetro() / 2;
        return Math.sqrt(sp * (sp - lado1) * (sp - lado2) * (sp - lado3));
    }
}