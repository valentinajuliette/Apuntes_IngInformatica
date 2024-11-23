/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pra2.valentinamunoz;

/*
La empresa de transportes JAVAUSM, quiere mejorar el registro y control de su flota de vehículos. Como primer paso,
requiere una aplicación que permita agregar y ver la información de sus vehículos y del conductor asignado a cada móvil.
*/

/*            NOTA AL AYUDANTE:
La profesora me dio plazo extra por certificado médico, ya que estuve 2 semanas con reposo. Mi plazo es hasta el 04-05 ;)
*/

// Se importa las librerías necesarias
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// Se inicia la clase
public class JAVAUSM {
    
    // Se inicia el cuerpo del código
    public static void main(String[] args) {
                
        // Se crea el objeto "Scanner"
        Scanner sc = new Scanner(System.in);
        
        // Se crea la lista de vehículos
        List<Vehiculo> vehiculos = new ArrayList<>();
        
            // Interacción con el usuario
        /*
        Construya una aplicación en Java que permita a los usuarios, mediante un menú, realizar las siguientes acciones:
        1.	Registrar un nuevo vehículo
        2.	Asignar un nuevo conductor a un vehículo registrado
        3.	Listar toda la flota de vehículos
        4.	Usar al menos una herencia(Vehículos)
        */
        int seguir;
        do {
            int opcion;
            System.out.println("""
                                ¡Bienvenida/o! Por favor ingresa el numero correspondiente a la accion que deseas realizar:
                                       1. Registrar un nuevo vehiculo.
                                       2. Asignar un nuevo conductor a un vehiculo registrado.
                                       3. Listar toda la flota de vehiculos.
                                       4. Usar al menos una herencia (Vehiculos).
                               """);
            opcion = sc.nextInt();

            switch(opcion) {
                case 1:
                    // Registrar un nuevo vehiculo.
                    System.out.print("Ingresa la patente del vehículo: ");
                    String nuevaPatente = sc.nextLine();
                    nuevaPatente = sc.nextLine(); // Esto lo hacemos para evita salto de línea extra
                    System.out.print("Ingresa la marca del vehículo: ");
                    String nuevaMarca = sc.nextLine();
                    System.out.print("Ingresa el modelo del vehículo: ");
                    String nuevoModelo = sc.nextLine();
                    System.out.print("Ingresa la velocidad del vehículo: ");
                    int nuevaVelocidad = sc.nextInt();
                    System.out.print("Ingresa la marcha del vehículo: ");
                    int nuevaMarcha = sc.nextInt();
                    System.out.print("Ingresa la velocidad máxima del vehículo: ");
                    int nuevaVelocidadMax = sc.nextInt();
                    System.out.print("Ingresa la marcha máxima del vehículo: ");
                    int nuevaMarchaMax = sc.nextInt();
                    Conductor nuevoConductor = null; // Se inicializa la varible, pero se deja vacía hasta que se le asigne un conductor
                    
                    // Asignación de variables
                    Vehiculo nuevoAuto = new Vehiculo(nuevaPatente,nuevaMarca,nuevoModelo,nuevaVelocidad, nuevaMarcha, nuevaVelocidadMax, nuevaMarchaMax, nuevoConductor);
                    // Se agrega el nuevo auto al registro
                    vehiculos.add(nuevoAuto);
                    
                    break;
                    // fin caso 1
                case 2:
                    // Asignar un nuevo conductor a un vehiculo registrado.
                    // Información del conductor:
                    System.out.println("Ingresa el RUT del conductor: ");
                    String new_rut = sc.nextLine();
                    new_rut = sc.nextLine(); // Evita el salto de línea
                    System.out.println("Ingresa el NOMBRE del conductor: ");
                    String new_nombre = sc.nextLine();
                    System.out.println("Ingresa el APELLIDO del conductor: ");
                    String new_apellido = sc.nextLine();
                    System.out.println("Ingresa la LICENCIA del conductor: ");
                    String input = sc.nextLine(); // lleemos la licencia en tipo String ya que no se puede leer en char
                    // Asumimos que su largo será de 1 carácter, por lo que tomamos el primer carácter de la entrada como el valor de la licencia
                    char new_licencia = input.charAt(0);
                    // Construimos al conductor asignando sus variables
                    Conductor new_conductor = new Conductor(new_rut,new_nombre,new_apellido,new_licencia);
                    // Asignar al vehículo correspondiente
                    System.out.println("Ingresa la patente del vehículo al que quieres asignar este conductor: ");
                    String patente_de_busqueda = sc.nextLine();
                    // Lamamos a la función "getVehículo" para buscar coincidencias y hallar el auto buscado
                    var auto = Vehiculo.getVehiculo(patente_de_busqueda,vehiculos);
                    auto.asignarConductor(new_conductor); // Se le asigna el conductor al auto encontrado
                    break;
                    // fin caso 2
                case 3:
                    // Listar toda la flota de vehiculos.
                    // Aquí  actúa la función getAll de la clase Vehiculos.
                    Vehiculo.getAll(vehiculos);
                    break;
                case 4:
                    // Usar al menos una herencia (Vehiculos).
                    Herencia h = new Herencia();
                    h.ImprimirMensaje();
                    break;
            }
            System.out.println("¿Deseas continuar? (0=NO, 1=SÍ)");
            seguir = sc.nextInt();
        } while (seguir == 1); // El ciclo termina cuando el usuario ingrese un "0" prepresentando un NO
        System.out.println("Gracias por usar este programa. Saludos :)");
    } // fin void
} // fin class
