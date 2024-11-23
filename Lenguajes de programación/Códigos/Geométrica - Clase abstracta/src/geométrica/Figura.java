/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geométrica;

/**
 *
 * @author unico
 */
public abstract class Figura {
    
    private String color;
    // sugiere definirla inmutable (final), pero igual compila
    
    public Figura(String color) {
        this.color = color;
    }
    
    // tiene que tener al menos un método abstracto para ser clase abstracta
    // es decir, un método sin definir para que sus hijos lo definan por sí mismos
    public abstract double calcularArea();
    
    public String getColor() {
        return color;
    }
}
// fin class abstracta