/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geométrica;

/**
 Cuadrado (clase hija de la clase abstracta Figura)
 */
public class Cuadrado extends Figura {
    
    private double lado;
    
    public Cuadrado (String color, double lado) {
        super(color);
        // me marcaba error en la línea anterior porque estaba heredando Cuadrado de la clase Geométrica, no de la clase Figura
        this.lado = lado;
    }
    
    public double calcularArea() {
        return lado*lado;
    }
} //fin clase cuadrado
