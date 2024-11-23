/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

/**
La herencia en Java permite que una clase (llamada subclase o clase hija) herede los campos y métodos de otra clase
(llamada superclase o clase padre). La subclase puede utilizar los campos y métodos heredados de la superclase, y 
también puede agregar nuevos campos y métodos, o bien, sobrescribir los métodos existentes de la superclase.
 */

// // Clase principal para probar la herencia
public class Herencia {

    public static void main(String[] args) {
        // Crear un objeto de la subclase Automovil
        Automovil auto = new Automovil("Toyota", "Corolla", 4);
        
        // Llamar al método de la subclase para mostrar la información del automóvil
        auto.mostrarInfoAutomovil();
    }
    /*
    En este ejemplo, la clase Vehiculo es la superclase que tiene dos campos: marca y modelo, y un método mostrarInfo()
    que muestra la información del vehículo. La clase Automovil es la subclase que hereda de Vehiculo y agrega un nuevo
    campo numeroPuertas, así como un nuevo método mostrarInfoAutomovil() que muestra información específica del automóvil.

    Cuando creamos un objeto de la subclase Automovil, este objeto hereda los campos y métodos de la superclase Vehiculo
    y puede acceder a ellos directamente. Además, la subclase puede agregar funcionalidades adicionales o modificar las
    existentes según sea necesario.
    */
}
