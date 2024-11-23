/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package munozvalentina;

/*
            EJERCICIO 2:
Desarrolle un programa en Java que permita a un usuario saber cuántas cifras tiene un número
ingresado por teclado y la suma de éstas. Por ejemplo, si se introduce el número 3454 el
programa devolverá: Cantidad de cifras: 4, Suma de las cifras: 16.
 */

// Se importa la librería de utilidad de inputs del usuario
import java.util.Scanner;

// Se inicia la clase
public class Ejercicio2 {
    
    // Se inicia el cuerpo del código
    public static void main(String[] args) {
        
        // Se crea el objeto "Scanner"
        Scanner sc = new Scanner(System.in);

        // Se crean las variables
        String número;
        int largo, suma=0;
        
        // Se solicita al usuario que ingrese un número
        System.out.println("Ingresa un numero, por favor: ");
        número = sc.nextLine(); // Se asigna el valor ingresado a la variable
        
        // Cant. de cifras
        largo = número.length();
        System.out.println("Cantidad de cifras: "+largo);
        
        // Suma de las cifras
        for (int i=0; i<largo; i++) { // Se recorre como un string, caracter por caracter
            // Se extrae el caracter
            String caracter = número.substring(i,i+1);
            // Se transforma a entero
            int dígito = Integer.parseInt(caracter);
            // Se suman cada dígito
            suma = suma + dígito;
        } //Fin del for
        System.out.println("Suma de las cifras: "+suma);
        
    } //Fin del cuerpo del código
} //Fin de la clase

// rosé