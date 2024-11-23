/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pra2.valentinamunoz;

// Se crea el objeto "Vehículo".

import java.util.List;

public class Vehiculo {
    
    // Atributos
    String patente;
    String marca;
    String modelo;
    int velocidad;
    int marcha;
    int velocidadMax;
    int marchaMax;
    Conductor conductor;
    
    // Método constructor
    public Vehiculo(String _patente, String _marca, String _modelo, int _velocidad, int _marcha, int _velocidadMax, int _marchaMax, Conductor _conductor){
        this.patente = _patente;
        this.marca = _marca;
        this.modelo = _modelo;
        this.velocidad = _velocidad;
        this.marcha = _marcha;
        this.velocidadMax = _velocidadMax;
        this.marchaMax = _marchaMax;
        this.conductor = _conductor;
    } //fin metodo constructor
    
    public void acelerar() {
        int acelerando = velocidad++;
        this.velocidad = acelerando;
    }
    
    public void frenar() {
        int frenando = velocidad--;
        this.velocidad = frenando;
    }
    
    public void subirMarcha() {
        int subir = marcha++;
        this.marcha = subir;
    }
    
    public void bajarMarcha() {
        int bajar = marcha++;
        this.marcha = bajar;
    }
    
    public void ponerMarcha(int nuevaMarcha) {
        this.marcha = nuevaMarcha;
    }
    
    /*public void toString() {
        // String ??
    }*/
    
    public void asignarConductor(Conductor nuevoConductor) {
        this.conductor = nuevoConductor;
    }
    
    // Creación método/función getAll: Listar toda la flota de vehículos.
    public static void getAll(List<Vehiculo> _vehiculos){
        for (int i = 0; i < _vehiculos.size(); i++) {
            var auto = _vehiculos.get(i);
            System.out.println(auto.patente);
        }
    } // fin método getAll
    
    // Creación método/función getVehiculo: Obtener un vehículo en base a su patente.
    public static Vehiculo getVehiculo(String patente, List<Vehiculo> _vehiculos){
        for (var auto : _vehiculos) {
            String patente_analizada = auto.patente;
            if (patente_analizada.equals(patente)) {
                return auto;
            }
        }
        return null;
    } // fin método getVehiculo

} //fin de clase
