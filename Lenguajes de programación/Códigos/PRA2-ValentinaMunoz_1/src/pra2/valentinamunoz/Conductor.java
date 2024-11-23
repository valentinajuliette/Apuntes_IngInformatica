/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pra2.valentinamunoz;

/*
    Se crea el objeto Conductor.
 */

public class Conductor {
    
    // Atributos
    String rut;
    String nombre;
    String apellido;
    char licencia;
    
    // Método constructor
    public Conductor(String _rut, String _nombre, String _apellido, char _licencia) {
        this.rut = _rut;
        this.nombre = _nombre;
        this.apellido = _apellido;
        this.licencia = _licencia;
    
    } //fin metodo constructor
    
    // Función que muestra en palabras al usuario lo que está guardado en la variable
    /*@Override
    public void toString() {
        System.out.println("Nombre: "+nombre+" "+apellido);
        System.out.println("RUT: "+ rut);
        System.out.println("Licencia: "+licencia);
    }*/
    
} // fin de la clase
