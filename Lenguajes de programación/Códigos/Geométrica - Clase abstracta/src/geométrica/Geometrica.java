/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geométrica;

/*
Ejercicio clase abstracta: Una clase que se define como tal, puede heredar, pero no puede ser instanciada
(crear objetos a partir de ella).
*/

import java.util.Scanner;

public class Geometrica {
    
    public static void main(String[] args) {
        String ColorDelCuadrado;
        double LadoDelCuadrado;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el color de cuadrado: ");
        ColorDelCuadrado = sc.nextLine();
        
        System.out.println("Ingrese el largo del lado del cuadrado en cm: ");
        LadoDelCuadrado = sc.nextDouble();
        
        Cuadrado cuadrado1 = new Cuadrado(ColorDelCuadrado,LadoDelCuadrado);
        
        System.out.printf("El área del cuadrado %s es: %f", cuadrado1.getColor(), cuadrado1.calcularArea());
        /* me marcaba error porque usé "println" en lugar de "printf", donde se especifica FORMATO
        %s y %f son especificadores de formato utilizados en el método printf() para dar formato a los valores que se van
        a imprimir:
        -   %s: Especifica un marcador de posición para un valor de cadena (String). Cuando printf() encuentra %s,
        espera que le siga un argumento que sea una cadena (String), y reemplaza %s con ese valor de cadena en la cadena
        de formato.
        -   %f: Especifica un marcador de posición para un valor de coma flotante (float o double). Cuando printf() 
        encuentra %f, espera que le siga un argumento que sea un número de coma flotante (float o double), y reemplaza 
        %f con ese valor en la cadena de formato.
        -   %d: lo mismo pero para un valor de tipo entero int.
        */
    }
}
