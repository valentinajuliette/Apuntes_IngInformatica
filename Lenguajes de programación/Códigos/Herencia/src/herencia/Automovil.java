/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

// Subclase Automovil, que hereda de Vehiculo
class Automovil extends Vehiculo {
    private int numeroPuertas;
    
    public Automovil(String marca, String modelo, int numeroPuertas) {
        // Llama al constructor de la superclase Vehiculo
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }
    
    // Método adicional de la subclase Automovil
    public void mostrarInfoAutomovil() {
        // Llama al método de la superclase Vehiculo
        mostrarInfo();
        System.out.println("Número de puertas: " + numeroPuertas);
    }
}